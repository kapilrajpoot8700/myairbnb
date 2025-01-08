package com.myblog11.service;

import com.myblog11.dto.PostDto;
import com.myblog11.entity.Post;
import com.myblog11.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {


    private PostRepository postRepository;

    private ModelMapper modelMapper;


    public PostServiceImpl(PostRepository postRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper= modelMapper;
    }

    @Override
    public PostDto createpost(PostDto postDto) {
     Post post =  modelMapper.map(postDto,Post.class);
       postRepository.save(post);

      PostDto dto = modelMapper.map(post,PostDto.class);
       return dto;
           }

    @Override
    public void deletePost(long id) {
        postRepository.deleteById(id);

    }

    Post mapToEntity(PostDto postDto){
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        return post;
   }
   PostDto mapToDto(Post post){
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        dto.setDescription(post.getDescription());
        return dto;

   }









}
