package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public String login(@RequestParam(value = "username") String userName, @RequestParam(value = "password") String passWord){
        return userService.login(userName,passWord);
    }

}
