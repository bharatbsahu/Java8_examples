package com.java8.Stream;

//Filtering and Iterating Collection
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
		
        List<Product2> productsList = new ArrayList<Product2>();  
        //Adding Products  
        productsList.add(new Product2(1,"HP Laptop",25000f));  
        productsList.add(new Product2(2,"Dell Laptop",30000f));  
        productsList.add(new Product2(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product2(4,"Sony Laptop",28000f));  
        productsList.add(new Product2(5,"Apple Laptop",90000f));  
        
        // This is more compact approach for filtering data  
        
        productsList.stream()
        	.filter( prod -> prod.price == 30000)
        	.forEach(prod -> System.out.println(prod.name));
		
        System.out.println("************** Practice...........");
        
        productsList
        	.stream()
        	.filter( p1 -> p1.price == 30000)
        	.forEach( p2 -> System.out.println(p2.name));

	}

}
