package com.gateam.spring.serverless.service.impl;

import com.gateam.spring.serverless.model.entity.Post;
import com.gateam.spring.serverless.repository.PostRepository;
import com.gateam.spring.serverless.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(String id) {
        return postRepository.findById(id).orElse(null);
    }

}
