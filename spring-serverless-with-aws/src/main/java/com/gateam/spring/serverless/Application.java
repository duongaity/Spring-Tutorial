package com.gateam.spring.serverless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.gateam.spring.serverless.controller.PingController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
// We use direct @Import instead of @ComponentScan to speed up cold starts
 @ComponentScan(basePackages = "com.gateam.spring.serverless.controller")
//@Import({ PingController.class })
@EnableWebMvc
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}