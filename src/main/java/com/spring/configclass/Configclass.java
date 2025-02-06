package com.spring.configclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configclass {
	
	
	@Bean
	public ClassA first() {
		
		ClassA a = new ClassA();
		a.setName("rohith");
		a.setPass("qwerty");
		return a;
	}

	@Bean
	public ClassB second() {
		ClassB b = new ClassB(first()); // injecting bean of ClassA into classB with same method name as mentioned above
		b.setLastname("Gupta");
		return b;
	}
}
