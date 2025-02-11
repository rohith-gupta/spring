package com.spring.xmlLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/xmlLifecycle/config.xml");
		
		Login login =  (Login) context.getBean("login");
		
		System.out.println(login.getUsername());
		
		context.registerShutdownHook();

	}

}
