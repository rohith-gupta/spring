package com.spring.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/standalone/config.xml");
		
		Login names = (Login) context.getBean("login");
		
		System.out.println(names.toString());

	}

}
