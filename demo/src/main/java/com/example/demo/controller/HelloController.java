package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") // 解决前端的跨域问题
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        return "spring boot hello world!hfhggfhgggf";
    }
}
