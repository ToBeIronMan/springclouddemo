package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 



@Controller
public class WebAppConfig {
    @Autowired 
   UserService helloWorldFeignService;
    @RequestMapping(value = "/login")
    public String sayHello(HttpServletResponse response,HttpServletRequest request,Model model){
    	String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println("ok");
		String s=helloWorldFeignService.login(username, password);
		System.out.println(s);
		if(s.equals("yes"))
       return "success";
		else
			return "fail";
    }
    @RequestMapping(value = "/tologin")
    public String yHello(HttpServletResponse response,HttpServletRequest request,Model model){
    	
			return "index";
    }
}