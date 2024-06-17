package com.cg.java8.JavaLambdaExp;


import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  


class Product1{  
	
    int id;  
    String name;  
    float price;  
    
    public Product1(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 



public class LambdaExpressionExampleComparator {

	public static void main(String[] args) {
		
		System.out.println("Hi From -> ava Lambda Expression Example: Comparator");
		
		List <Product1> _product = new ArrayList<>();
		
		_product.add(new Product1(1,"HP Laptop",25000f));
		

	}

}
