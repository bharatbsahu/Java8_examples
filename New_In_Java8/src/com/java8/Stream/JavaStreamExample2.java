package com.java8.Stream;

import java.util.*;  
import java.util.stream.Collectors;  

//Filtering Collection by using Stream

class Product1{  
    int id;  
    String name;  
    float price;  
    public Product1(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 

public class JavaStreamExample2 {
	
	
	public static void main(String[] args) {  
		
		List <Product1> productsList = new ArrayList <Product1> ();
		
		// //Adding Products 
		productsList.add(new Product1(1,"HP Laptop",25000f));
		
		productsList.add(new Product1(2,"Dell Laptop",30000f));
		
        productsList.add(new Product1(3,"Lenevo Laptop",28000f)); 
        
        productsList.add(new Product1(4,"Sony Laptop",28000f));  
        
        productsList.add(new Product1(5,"Apple Laptop",90000f));  
        
        List <Float> productsList2 = productsList.stream()
        		.filter( p -> p.price > 30000  ) 
        		.map( p -> p.price)
        		.collect(Collectors.toList())     ;
        
        System.out.println(productsList2);
        
	}
	
	
	
}
