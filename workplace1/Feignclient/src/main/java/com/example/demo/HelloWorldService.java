package com.example.demo;




import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "config-client")
public interface HelloWorldService {
    @RequestMapping(value = "/hello")
    String sayHello();
}
