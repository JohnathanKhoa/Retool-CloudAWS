package com.jkn.blogService.dao;

import com.jkn.blogService.entity.blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface blogRepository extends JpaRepository<blog, String>{
    List<blog> findByEmail(String Email);


}