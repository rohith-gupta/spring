package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/config.xml");
    	
    	ClassB b = (ClassB) context.getBean("B");
    	
    	System.out.println(b.getFullname());
    	System.out.println(b.getA().getName()); //displayed output from a using b class
    	
    }
}
