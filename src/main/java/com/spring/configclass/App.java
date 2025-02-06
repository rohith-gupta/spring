package com.spring.configclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new AnnotationConfigApplicationContext(Configclass.class);
    	
    	ClassB b = (ClassB) context.getBean("second");
    	
    	System.out.println(b.getA().getName()+" "+ b.getLastname());
    	
    }
}
