package com.spring.annotationautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClassB {
	
	// autowired here is used as property injection (byType)
	ClassA a;
	String lastname;
	
	public ClassA getA() {
		return a;
	}

	// autowired here is used as setter injection (byType)
	public void setA(ClassA A) {
		this.a = A;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	
	public ClassB() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// autowired here is used as constructor injection (constructor)
	@Autowired
	public ClassB(ClassA a) {
		super();
		this.a = a;
	}


	@Override
	public String toString() {
		return "ClassB [A=" + a + "]";
	}
	
	
	

}
