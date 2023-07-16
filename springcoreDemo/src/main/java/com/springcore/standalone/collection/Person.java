package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class Person {
	List<String> friends;
	Map<String, Integer> cource;

	
	
	public List<String> getFriends() {
		return friends;
	}



	public void setFriends(List<String> friends) {
		this.friends = friends;
	}



	public Map<String, Integer> getCource() {
		return cource;
	}



	public void setCource(Map<String, Integer> cource) {
		this.cource = cource;
	}



	@Override
	public String toString() {
		return "Person [friends=" + friends + ", cource=" + cource + "]";
	}


	
	
}
