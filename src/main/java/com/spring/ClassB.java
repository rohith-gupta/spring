package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassB {
	
	String fullname;
	ClassA a;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public ClassA getA() {
		return a;
	}

	public void setA(ClassA a) {
		this.a = a;
	}
	
	

}
