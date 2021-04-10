package com.springcore.standalone.collections;

import java.util.*;

public class Person {
	
	public List<String> friends;
	public Map<String,Integer> udhar;
	public Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getUdhar() {
		return udhar;
	}

	public void setUdhar(Map<String, Integer> udhar) {
		this.udhar = udhar;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Temp [friends=" + friends + "]";
	}

}
