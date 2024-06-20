package com.cg.java8.JavaLambdaStream;

import java.util.stream.*; 

public class StreamIteratingExample {

	public static void main(String[] args) {
		
        Stream.iterate(1, element->element+1)  
        .filter(element->element%4==0)  
        .limit(5)  
        .forEach(System.out::println);  
		
		java.util.stream.Stream.iterate(1, I -> I + 1 )
			.filter( J -> J%5 == 0 )
			.limit(5)	
			.forEach( K -> System.out.println(K));	
			
		//
		Stream.iterate( 1, I -> I + 1)
				.filter( K -> K%6 == 0)
				.limit(10)
				.forEach( J -> System.out.println(J)); 
	}

}
