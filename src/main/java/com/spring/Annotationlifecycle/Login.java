package com.spring.Annotationlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
	
	@PostConstruct
	public void start()
	{
		System.out.println("in-it method created");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("destroy method created");
	}
	
	
	
}
