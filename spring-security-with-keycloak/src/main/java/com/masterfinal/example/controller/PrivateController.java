package com.masterfinal.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/private")
public class PrivateController {

    @GetMapping
    public String get() {
        return "Private Resource";
    }

    @PostMapping
    public String post() {
        return "Private Resource";
    }

}