package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		Con1 con;
		
		ApplicationContext c = new ClassPathXmlApplicationContext("com/spring/constructor/constconfig.xml");
		
		con = (Con1) c.getBean("cons1");
		
		System.out.println(con.toString());
		

	}

}
