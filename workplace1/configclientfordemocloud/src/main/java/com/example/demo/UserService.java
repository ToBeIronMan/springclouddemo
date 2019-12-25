package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
	@Autowired
	private UserMapper userdao;
	public String login(String username,String password)
	{
		if(userdao.selectByUsernamePass(username, password)!=null)
			return "yes";
		return "no";
	}
	
}
