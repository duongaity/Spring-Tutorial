package com.masterfinal.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/public")
public class PublicController {

    @GetMapping
    public String get() {
        return "Public Resource";
    }

    @PostMapping
    public String post() {
        return "Public Resource";
    }

}