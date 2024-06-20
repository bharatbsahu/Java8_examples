package com.cg.java8.JavaLambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Pproduct{    
    int id;    
    String name;    
    float price;    
    public Pproduct(int id, String name, float price) {    
        this.id = id;    
        this.name = name;    
        this.price = price;    
    }    
}     

public class StreamFindMaxAndMinProductPrice {

	public static void main(String[] args) {
		
		System.out.println("Hi From => Stream Example: Find Max and Min Product Price");
		
        List<Pproduct> productsList = new ArrayList<Pproduct>();    
        //Adding Products    
        productsList.add(new Pproduct(1,"HP Laptop",25000f));    
        productsList.add(new Pproduct(2,"Dell Laptop",30000f));    
        productsList.add(new Pproduct(3,"Lenevo Laptop",28000f));    
        productsList.add(new Pproduct(4,"Sony Laptop",28000f));    
        productsList.add(new Pproduct(5,"Apple Laptop",90000f));  
        
        for (Pproduct p:productsList) {
        	System.out.println(p.id+" "+p.name+" "+p.price);  
        	
        }
        // max() method to get max Product price 
        
        Pproduct productA = productsList.stream()
        					.max(
        							(product1, product2)-> product1.price > product2.price ? 1: -1
        					).get();    
        					
        System.out.println(productA.id+" "+productA.name+" "+productA.price);

     // min() method to get min Product price    
        Pproduct productB	= productsList.stream()
        						.min(
        								(prod1, prod2) -> prod1.price > prod2.price ? 1: -1
        						).get();
        
        
        
        System.out.println(productB.price);  
	}

}
