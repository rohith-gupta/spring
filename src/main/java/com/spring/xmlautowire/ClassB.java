package com.spring.xmlautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClassB {
	
	
	ClassA a;
	String lastname;

	public ClassA getA() {
		return a;
	}

	
	public void setA(ClassA A) {
		this.a = A;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	

//	public ClassB() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//	@Override
//	public String toString() {
//		return "ClassB [A=" + a + "]";
//	}
//	
	
	

}
