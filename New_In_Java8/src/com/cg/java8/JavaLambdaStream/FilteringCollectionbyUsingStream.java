package com.cg.java8.JavaLambdaStream;


import java.util.*;  
import java.util.stream.Collectors;

class Product1 {
	
	int id;
	String name;
	float price;
	
	public Product1(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
}


public class FilteringCollectionbyUsingStream {

	public static void main(String[] args) {
		
		System.out.println("Hi From -> Filtering Collection by using Stream");
		
		List <Product1> prodList = new ArrayList<>();
		prodList.add(new Product1(1,"HP Laptop",25000f));
		prodList.add(new Product1(2,"Dell Laptop",30000f));
		prodList.add(new Product1(3,"Lenevo Laptop",28000f));
		prodList.add(new Product1(4,"Sony Laptop",28000f));
		prodList.add(new Product1(5,"Apple Laptop",90000f));
		
        for (Product1 p:prodList) {
        	System.out.println(p.id+" "+p.name+" "+p.price);  
        	
        }
        
        List <Float> fList = prodList
        		.stream()
        		.filter( P1 -> P1.price > 30000)
        		.map( P1 -> P1.price)
        		.collect(Collectors.toList());
        
        System.out.println(fList);
	}

}
