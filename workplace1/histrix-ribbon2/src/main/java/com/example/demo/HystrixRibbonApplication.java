package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker

@EnableHystrixDashboard
public class HystrixRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixRibbonApplication.class, args);
	}
	
	 @Bean
	    @LoadBalanced
	    RestTemplate restTemplate(){
	        //return new RestTemplate();
		 return new RestTemplate();
	}
	    
	  
	
}
