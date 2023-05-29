package com.gateam.spring.serverless.controller;

import com.gateam.spring.serverless.model.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {
    @RequestMapping(path = "/post/list", method = RequestMethod.GET)
    public List<Post> findAll() {
        List<Post> postList = new ArrayList<>();

        Post p1 = new Post();
        p1.setId("1");
        p1.setTitle("P1");
        postList.add(p1);

        Post p2 = new Post();
        p2.setId("2");
        p2.setTitle("P2");
        postList.add(p2);

        return postList;
    }

}
