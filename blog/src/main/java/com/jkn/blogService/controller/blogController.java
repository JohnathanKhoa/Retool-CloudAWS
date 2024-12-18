package com.jkn.blogService.controller;

import com.jkn.blogService.entity.blog;
import com.jkn.blogService.service.blogService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://johnathan-khoa-blog-jvf7dc6gq-johnathankhoas-projects.vercel.app/")
@RestController
@Transactional
//@RequestMapping("/api")
public class blogController {

    @Autowired
    private blogService blogService;

    @PutMapping("/blog")
    public ResponseEntity<blog> createBlog(@RequestBody blog Blog) {
        blog createdBlog = blogService.saveBlog(Blog);
        return ResponseEntity.ok(createdBlog);
    }

    @GetMapping("/blogs")
    public ResponseEntity<List<blog>> getBlogsByEmail(@RequestParam("email") String email) {
        List<blog> Blogs = blogService.getBlogsByEmail(email);
        return (ResponseEntity.ok(Blogs));
    }
}