package com.example.demo;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@FeignClient(value = "config-getuser")

public interface UserService2 {
 
    
    @SuppressWarnings("rawtypes")
	@RequestMapping(value = "/getusers", method = RequestMethod.POST)
    List getUser();
    
    
    
    
   
}
