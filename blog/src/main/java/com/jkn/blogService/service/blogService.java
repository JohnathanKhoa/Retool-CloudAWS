package com.jkn.blogService.service;

import java.util.List;
import java.util.Optional;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkn.blogService.dao.blogRepository;
import com.jkn.blogService.entity.blog;

@Service
@Transactional
public class blogService {

    @Autowired
    private blogRepository blogRepository;

    public blog saveBlog(blog Blog) { return blogRepository.save(Blog); }

    public blog modifyBlog(blog Blog) { return blogRepository.save(Blog); }
    public List<blog> getBlogsByEmail(String email) { return (List<blog>) blogRepository.findByEmail(email); }

    public List<blog> getAllBlogs(){ return blogRepository.findAll(); }

    public Optional<blog> getBlogById(String blog_id) { return blogRepository.findById(blog_id); }

    public void deleteBlog(String id) { blogRepository.deleteById(id); }
}

