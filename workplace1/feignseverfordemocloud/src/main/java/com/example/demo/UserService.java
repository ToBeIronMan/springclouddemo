package com.example.demo;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@FeignClient(value = "config-login")

public interface UserService {
 
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    String login(@RequestParam(value = "username") String username, @RequestParam(value = "password")String password);
    
    
    
    
    
   
}
