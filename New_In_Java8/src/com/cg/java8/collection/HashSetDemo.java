package com.cg.java8.collection;



//Java program to demonstrate the
//working of a HashSet
import java.util.*;


public class HashSetDemo {

	public static void main(String[] args) {
		System.out.println("Hi From HashSet =>");
		
		HashSet <String> _hashSet = new HashSet<>();
		
		_hashSet.add(null);
		
		_hashSet.add("Geeks");
		_hashSet.add("For");
		_hashSet.add("Geeks");
		_hashSet.add("Is");
		_hashSet.add("Very helpful");
        
        Iterator<String> it = _hashSet.iterator();
        
        while (it.hasNext()) {
        	System.out.println(it.next());
        }

	}

}
