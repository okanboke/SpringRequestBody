package com.javademo.requestbody.controller;

import com.javademo.requestbody.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        System.out.println("User saved!");
        user.setPassword("");
        return user;
    }

    @PostMapping("/users-all")
    public List<User> saveAllUser(@RequestBody List<User> users) { //liste olarak kaydetme
        System.out.println("All users saved!");
        users.forEach(user -> user.setPassword(""));
        return users;
    }

    @GetMapping("/header") //header bilgisi örnek
    public String getHeader(@RequestHeader("My-Header") String myHeader) {
        return "Your header is : " + myHeader;
    }

}
