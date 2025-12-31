package com.java8.Stream;

import java.util.*;  
import java.util.stream.Collectors;  

class Product4{  
    int id;  
    String name;  
    float price;  
    
    public Product4(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 

public class SumByUsingCollectorsMethods {
	
    public static void main(String[] args) {  
    	
    	
        List<Product4> productsList = new ArrayList<Product4>();  
        
        //Adding Products  
        productsList.add(new Product4(1,"HP Laptop",25000f));  
        productsList.add(new Product4(2,"Dell Laptop",30000f));  
        productsList.add(new Product4(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product4(4,"Sony Laptop",28000f));  
        productsList.add(new Product4(5,"Apple Laptop",90000f));  
        
        // Using Collectors's method to sum the prices.  
        
        double totalPrice3 = 	productsList.stream()
        						.collect(Collectors.summingDouble( product -> product.price) );
        
    	System.out.println(totalPrice3);
    	
    	double totalPrice4 = productsList.stream()
    						.collect(Collectors.summingDouble( prod -> prod.price));
    	
    	System.out.println("totalPrice4:"+totalPrice4);
    	
    	
    	
    	// max() method to get max Product price   
    	
    	Product4 ProductA = productsList.stream()
    						.max( (prod1, prod2) ->  prod1.price > prod2.price ? 1: -1).get();
    	
    	
    	System.out.println("max():"+ProductA.price); 
    	
    	
    	// min() method to get min Product price  
    	
    	Product4 ProductB = productsList.stream()
    						.min( (prod1, prod2) ->  prod1.price > prod2.price ? 1: -1).get();
    	
    	System.out.println("min():"+ProductA.price); 
    	
    	//Practice ......................
        // Using Collectors's method to sum the prices.
    	double totalpricees = productsList
    				.stream()
    				.collect(Collectors.summingDouble( prod -> prod.price));
    	System.out.println("totalpricees:"+totalpricees);
    	
    	// max() method to get max Product price   
    	Product4 ProductAA = productsList
    			.stream()
    			.max(  (prod1, prod2) -> prod1.price >  prod2.price ? 1: -1).get();
    	System.out.println("ProductAA max():"+ProductAA.price);
    	
    	// min() method to get min Product price  
    	Product4 ProductBB = productsList
    			.stream()
    			.min(       
    				(p1, p2) -> 
    					p1.price > p2.price ? 1: -1
    				
    			).get();
    	System.out.println("ProductBB min ():"+ProductBB.price);
    	
    }

}
