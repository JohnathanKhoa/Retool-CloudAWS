package com.jkn.blogService.controller;

import com.jkn.blogService.entity.blog;
import com.jkn.blogService.service.blogService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Transactional
public class blogController {

    @Autowired
    private blogService blogService;

    @PutMapping("/blog")
    public ResponseEntity<blog> createBlog(@RequestBody blog Blog) {
        blog createdBlog = blogService.saveBlog(Blog);
        return ResponseEntity.ok(createdBlog);
    }

    @PutMapping("/modifyBlog")
    public ResponseEntity<blog> modifyBlog(@RequestBody blog Blog) {
        blog createdBlog = blogService.saveBlog(Blog);
        return ResponseEntity.ok(createdBlog);
    }

    @GetMapping("/blogs")
    public ResponseEntity<List<blog>> getBlogsByEmail(@RequestParam("email") String email) {
        List<blog> Blogs = blogService.getBlogsByEmail(email);
        return (ResponseEntity.ok(Blogs));
    }

    @GetMapping("/blogAll")
    public ResponseEntity<List<blog>> getBlogs() {
        List<blog> Blogs = blogService.getAllBlogs();
        return (ResponseEntity.ok(Blogs));
    }

    @DeleteMapping("/deleteBlog")
    public ResponseEntity<String> deleteBlog(@RequestBody String blog_id){
        blogService.deleteBlog(blog_id);
        return (ResponseEntity.ok().build());

    }
}