package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;



@Controller
public class WebAppConfig {
    @Autowired 
   UserService helloWorldFeignService;
    @Autowired 
    UserService2 helloWorldFeignService2;
    @RequestMapping(value = "/login")
    public String sayHello(HttpServletResponse response,HttpServletRequest request,Model model){
    	String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println("ok");
		String s=helloWorldFeignService.login(username, password);
		System.out.println(s);
		if(s.equals("yes"))
			return "redirect:/getuser";
		else
			return "fail";
    }
    @RequestMapping(value = "/tologin")
    public String yHello(HttpServletResponse response,HttpServletRequest request,Model model){
    	
			return "index";
    }
    @RequestMapping(value = "/getuser")
    public String getuser(HttpServletResponse response,HttpServletRequest request,Model model){
    	
		@SuppressWarnings("rawtypes")
		List s=helloWorldFeignService2.getUser();
		 model.addAttribute("users", s);
		return "success";
		
    }
}