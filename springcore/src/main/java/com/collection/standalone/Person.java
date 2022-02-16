package com.collection.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friends;
	private Map<String,Integer>feesStructor;
	private Properties properties;

	public Map<String, Integer> getFeesStructor() {
		return feesStructor;
	}

	public void setFeesStructor(Map<String, Integer> feesStructor) {
		this.feesStructor = feesStructor;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesStructor=" + feesStructor + ", properties=" + properties + "]";
	}


}
