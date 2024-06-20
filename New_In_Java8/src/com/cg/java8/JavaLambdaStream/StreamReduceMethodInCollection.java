package com.cg.java8.JavaLambdaStream;

import java.util.*;  

class Product3{  
    int id;  
    String name;  
    float price;  
    public Product3(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 

public class StreamReduceMethodInCollection {

	public static void main(String[] args) {
		System.out.println(" Hi From -> Stream Example : reduce() Method in Collection ");
		
		
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        for (Product p:productsList) {
        	System.out.println(p.id+" "+p.name+" "+p.price);  
        	
        }
        // This is more compact approach for filtering data  
        
        Float totalPrice = productsList.stream()
        					.map( prod -> prod.price )
        					.reduce(0.0f, (s,p)-> s+p);
        
		System.out.println("totalPrice=>"+totalPrice); 
		
		 // More precise code 
		
		 float totalPrice2 = productsList.stream()
				 			 .map( p -> p.price)
				 			 .reduce(0.0f, Float::sum);
		 
		 System.out.println("totalPrice2=>"+totalPrice2); 
		 
		 // Maximum Price
		 float maxPrice = productsList
				 			.stream()
				 			.map( P -> P.price)
				 			.reduce(0.0f, Float::max);
		 
		 System.out.println("maxPrice=>"+maxPrice); 
		 
		 // Minimum Price
		 float minPrice = productsList
				 			.stream()
				 			.map( P -> P.price)
				 			.reduce(100000.0f, Float::min);
		 
		 System.out.println("maxPrice=>"+minPrice); 
	}

}
