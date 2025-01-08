package com.myblog11.service;

import com.myblog11.dto.PostDto;

public interface PostService {

    public PostDto createpost(PostDto postDto);

    public void deletePost(long id);
}
