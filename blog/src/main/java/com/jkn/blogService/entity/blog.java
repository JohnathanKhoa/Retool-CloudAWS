package com.jkn.blogService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "blog")
public class blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private int blog_id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "message")
    private String message;

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getBlog_id() {
        return blog_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getMessage() {
        return message;
    }
}