package com.myblog11.controller;

import com.myblog11.dto.PostDto;
import com.myblog11.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //http://localhost:8080/api/posts
    @PostMapping
    public ResponseEntity<?> createPost(@Valid @RequestBody PostDto postDto, BindingResult result){
       if(result.hasErrors()){
            return new ResponseEntity<>(result.getFieldError().getDefaultMessage(),HttpStatus.CREATED);
       }


        PostDto dto = postService.createpost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    //http://localhost:8080/api/posts/2
    @DeleteMapping("/{id}")
    public  ResponseEntity<String> deletePost(@PathVariable long id){
        postService.deletePost(id);
        return new ResponseEntity<>("post is deleted"+id,HttpStatus.OK);


    }
}
