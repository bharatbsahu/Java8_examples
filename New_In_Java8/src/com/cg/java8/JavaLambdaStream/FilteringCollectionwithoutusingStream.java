package com.cg.java8.JavaLambdaStream;

import java.util.*;  


class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}

public class FilteringCollectionwithoutusingStream {

	public static void main(String[] args) {
		System.out.println("Hi From -> Java Example: Filtering Collection without using Stream");
		
		
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        List<Float> productPriceList = new ArrayList<Float>();  
        
        System.out.println(productsList.toString());
        for (Product p:productsList) {
        	if(p.price < 30000) {
        		productPriceList.add(p.price);
        	}
        }
		
		System.out.println(productPriceList);

	}

}
