package com.spring.xmlLifecycle;

public class Login {

	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void start()
	{
		System.out.println("in-it method created");
	}
	
	public void end()
	{
		System.out.println("destroy method created");
	}
	
	
}
