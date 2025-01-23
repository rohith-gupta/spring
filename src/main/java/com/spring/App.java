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
    	ClassA a = (ClassA) context.getBean("A");
        System.out.println( "Hello " + a.getName());
    }
}
