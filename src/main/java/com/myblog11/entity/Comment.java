package com.myblog11.entity;

import lombok.Data;

import javax.annotation.security.DenyAll;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "comments")
public class Comment {


    private long id;
    private String name ;
    private String message;

    @ManyToOne
    @JoinColumn(name ="post_id")
    private Post post;


}
