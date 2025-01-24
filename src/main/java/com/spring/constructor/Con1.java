package com.spring.constructor;

public class Con1 {
	
	private String username;
	private int num;
	
	
	public Con1(String username, int num) {
		super();
		this.username = username;
		this.num = num;
	}


	public String toString() {
		return "con1 [username=" + username + ", num=" + num + "]";
	}


	public Con1() {
		super();
	}
	
	
	
	

}
