package com.gateam.spring.serverless.service;

import com.gateam.spring.serverless.model.entity.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();

    Post findById(String id);

}
