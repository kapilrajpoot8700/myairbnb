package com.myblog11.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String content;
    private String description;
    private String title;

    @OneToMany(mappedBy ="post",orphanRemoval = true,cascade = CascadeType.ALL)
    private List<Comment> comments= new ArrayList<>();

}
