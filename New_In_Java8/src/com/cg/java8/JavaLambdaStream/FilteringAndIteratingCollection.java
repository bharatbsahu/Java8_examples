package com.cg.java8.JavaLambdaStream;

import java.util.*;  

class Product2{  
    int id;  
    String name;  
    float price;  
    public Product2(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class FilteringAndIteratingCollection {

	public static void main(String[] args) {
		
		System.out.println("Hi From => Java Stream Example: Filtering and Iterating Collection");
		
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // This is more compact approach for filtering data  
        
        productsList.stream()
        			.filter( P -> P.price ==  30000) 
        			.forEach( P1 -> System.out.println(P1.name) );
        
	}

}
