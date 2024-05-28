package com.java8.ForEach;

import java.util.ArrayList;  
import java.util.List; 

//Java Stream forEachOrdered() Method Example

public class ForEachOrderedExample {
	
    public static void main(String[] args) {  
    	
    	List <String> gameList = new ArrayList <String> ();
    	
    	gameList.add("Football");  
    	gameList.add("Cricket");  
    	gameList.add("Chess");  
    	gameList.add("Hocky"); 
    	
    	
        System.out.println("------------Iterating by passing lambda expression---------------");  
        
        gameList.stream().forEachOrdered(
        		
        		(g) -> System.out.println(g)
        		
        		
        		);
        
        
        System.out.println("------------Iterating by passing method reference---------------");  
        
        gameList.stream().sorted().forEachOrdered(System.out::println);
    	
    	
    }

}
