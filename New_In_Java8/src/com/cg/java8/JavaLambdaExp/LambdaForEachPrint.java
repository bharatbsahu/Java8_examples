package com.cg.java8.JavaLambdaExp;

//A Java program to demonstrate simple lambda expressions
import java.util.ArrayList;
import java.util.List;

public class LambdaForEachPrint {

	public static void main(String[] args) {
		
		List <Integer> arrL  = new ArrayList<>();
		
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.add(5);
        
        // Using lambda expression to print all elements
        // of arrL
        arrL.forEach(
        		
        	n -> System.out.println(n)
        		
        );
        
        System.out.println("-------------------");
        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(
    		n -> {
    			if(n % 2 == 0) {
    				System.out.println(n);
    			}
    		}
        );
	}
}
