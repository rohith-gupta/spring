package com.spring.interfacelifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Login implements InitializingBean, DisposableBean {

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
	
//	public void start()
//	{
//		System.out.println("in-it method created");
//	}
//	
//	public void end()
//	{
//		System.out.println("destroy method created");
//	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in-it method created");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("destroy method created");
		
	}
	
	
}
