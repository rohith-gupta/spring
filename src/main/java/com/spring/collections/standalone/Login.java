package com.spring.collections.standalone;

import java.util.List;
import java.util.Map;

public class Login {
	
	public List<String> names;
	public Map<String, Integer> marks;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Login [names=" + names + ", marks=" + marks + "]";
	}

	
	
	
	

}
