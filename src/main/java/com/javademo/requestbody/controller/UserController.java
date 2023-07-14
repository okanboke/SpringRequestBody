package com.javademo.requestbody.controller;

import com.javademo.requestbody.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        System.out.println("User saved");
        user.setPassword("");
        return user;
    }
}
