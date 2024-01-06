package com.myBlog2.MyBlog2.service.impl;

import com.myBlog2.MyBlog2.entity.PostEntity;
import com.myBlog2.MyBlog2.payload.PostDto;
import com.myBlog2.MyBlog2.repository.PostRepository;
import com.myBlog2.MyBlog2.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostDto createDto(PostDto postDto){
        PostEntity postEntity = new PostEntity();
        postEntity.setTitle(postDto.getTitle());
        postEntity.setDescription(postDto.getDescription());
        postEntity.setConcept(postDto.getConcept());
        PostEntity save = postRepository.save(postEntity);

        postDto.setTitle(save.getTitle());
        postDto.setDescription(save.getDescription());
        postDto.setConcept(save.getConcept());

        return postDto;
    }
}
