package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Select;



public interface UserMapper {
	 @Select("Select * from user where username = #{username} and password = #{password}")
	    User selectByUsernamePass( String username, String password);
     @Select("select * from user")
	   List<User> selectAll();
     
      
}