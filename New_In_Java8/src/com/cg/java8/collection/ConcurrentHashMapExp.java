package com.cg.java8.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExp {

	public static void main(String[] args) {
		System.out.println("Hi From -> ConcurrentHashMapExp "); 
		
	
		ConcurrentHashMap <String, Integer> _concurrentHashMap = new ConcurrentHashMap();
		
		// Adding elements to the map
		_concurrentHashMap.put("AA", 1);
		_concurrentHashMap.put("BB", 2);
		_concurrentHashMap.put("CC", 3);
		_concurrentHashMap.put("DD", 4);
		
		System.out.println("Map size: " + _concurrentHashMap.size() );
		
		// Getting values from the map
		int valueA = _concurrentHashMap.get("AA");
		System.out.println("Value of AA: " + valueA);
		
		// Removing elements from the map
		_concurrentHashMap.remove("CC");
		
		System.out.println("Map size After: " + _concurrentHashMap.size() );

	}

}
