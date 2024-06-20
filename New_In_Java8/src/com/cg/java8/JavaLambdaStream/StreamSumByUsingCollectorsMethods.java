package com.cg.java8.JavaLambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSumByUsingCollectorsMethods {

	public static void main(String[] args) {
		
		System.out.println("Hi From => Stream Example: Sum by using Collectors Methods");
		
        List<Product> productsList = new ArrayList<>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // Using Collectors's method to sum the prices. 
        
        	
        double totalPrice = productsList.stream()
        					.collect(Collectors.summingDouble( prod -> prod.price  ));
        
        System.out.println("totalPrice=>"+totalPrice);
        

	}

}
