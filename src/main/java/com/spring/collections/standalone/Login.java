package com.spring.collections.standalone;

import java.util.List;

public class Login {
	
	public List<String> names;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Login [names=" + names + "]";
	}
	
	

}
