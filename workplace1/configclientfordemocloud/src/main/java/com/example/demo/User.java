package com.example.demo;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID =1L;
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
    private Integer id;

    private String username;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
    public User() {
    	super();
    }
}