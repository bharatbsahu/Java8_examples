package com.java8.Stream;

import java.util.stream.*;  

//Java Stream Iterating Example

public class JavaStreamIterating {
	
	
	public static void main (String[] args) {
		
		System.out.println("Java Stream Iterating Example");
		
		Stream.iterate(1, element -> element +1 )
		.filter(element -> element % 5 == 0)
		.limit(5)
		.forEach(System.out::println);
		
		
	}

}
