package com.jkn.blogService.entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "blog")
public class blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int blog_id;
    private String name;
    private String email;
    private String message;
}