package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
@RestController
public class HelloService {
    @Autowired RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "serviceFailure")
    @RequestMapping("/")
    public String getHelloContent() {
        return restTemplate.getForObject("http://config-client/hello",String.class);
    }
    public String serviceFailure() {
    	         return "hello world service is not available !";
    	     }
}
