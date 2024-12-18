package com.jkn.blogService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jkn.blogService.entity.blog;

import java.util.List;
import java.util.Optional;

@Repository
public interface blogRepository extends JpaRepository<blog, String>{
    List<blog> findByEmail(String Email);

}