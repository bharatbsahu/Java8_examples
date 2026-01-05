package com.cg.java8.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapGreeksExmpl {

	public static void main(String[] args) {
		System.out.println("********8 ConcurrentHashMapGreeksExmpl *************8");
		
		ConcurrentHashMap<Integer, String> _conHashMap = new ConcurrentHashMap<>();
		
		//_conHashMap.put(null, null);
		_conHashMap.put(1, "Java");
		_conHashMap.put(2, "Python");
		_conHashMap.put(3, "C++");
		
		System.out.println(_conHashMap.get(1));
		
		_conHashMap.putIfAbsent(2, "Go");
		
		 System.out.println(_conHashMap);

	}

}
