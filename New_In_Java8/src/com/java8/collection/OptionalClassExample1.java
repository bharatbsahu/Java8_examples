package com.java8.collection;

import java.util.Optional;

public class OptionalClassExample1 {
	
	public static void main(String[] args) {  
		
		String [] str = new String [10];
		
		Optional<String> checknull = Optional.ofNullable(str[5]);
		
		System.out.println("*** checknull:" + checknull);  
		
		if(checknull.isPresent()) {				// check for value is present or not  
			
            String lowercaseString = str[5].toLowerCase();  
            System.out.println(lowercaseString);  
			
		} else {
			
	         System.out.println("string value is not present");  
		}
		
	}

}
