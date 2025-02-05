package com.spring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("l")
@Scope("prototype")

// by default scope is singleton but to change it we need to mention prototype and it should be given along with component
public class Login {
	
	
	@Value("rohith")
	public String firstname;
	@Value("Gupta")
	public String lastname;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	@Override
	public String toString() {
		return "login [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
	

}
