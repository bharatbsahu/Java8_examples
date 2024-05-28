package com.java8.Stream;


import java.util.*;  
import java.util.stream.Collectors;  


class Product0{  
    int id;  
    String name;  
    float price;  
    public Product0(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  


public class ConvertListIntoMap {

	public static void main(String[] args) {
		
		
        List<Product0> productsList = new ArrayList<Product0>();  
        
        //Adding Products  
        productsList.add(new Product0(1,"HP Laptop",25000f));  
        productsList.add(new Product0(2,"Dell Laptop",30000f));  
        productsList.add(new Product0(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product0(4,"Sony Laptop",28000f));  
        productsList.add(new Product0(5,"Apple Laptop",90000f));  
        
        
        // Converting Product List into a Map  
		
		Map <Integer, String> productPriceMap  =  productsList.stream()
											  .collect(Collectors.toMap( p -> p.id, p -> p.name));
		
		System.out.println("productPriceMap:"+productPriceMap);

	}

}
