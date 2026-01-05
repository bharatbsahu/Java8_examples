package com.java8.Zprectice;

import java.util.Map;
import java.util.concurrent.*;

public class ConcurrentHashMapExp {

	public static void main(String[] args) {
		
		Map<Integer, String> cuncMap = new ConcurrentHashMap<>();
		
		cuncMap.put(1, "Greek");
		cuncMap.put(100, "Hello");
		cuncMap.put(101, "Geeks");
		cuncMap.put(102, "Geeks");
		
        // Here we cant add Hello because 101 key
        // is already present in ConcurrentHashMap object
		cuncMap.putIfAbsent(101, "Hello");
        
        // We can remove entry because 101 key
        // is associated with For value
		cuncMap.remove(101, "Geeks");
		
        // Now we can add Hello
		cuncMap.putIfAbsent(103, "Hello");
		
        // We cant replace Hello with For
		cuncMap.replace(101, "Hello", "For");
        System.out.println(cuncMap);

	}

}
