package com.java8.LambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaExpressionExample11 {

	public static void main(String[] args) {
		
		List <Product> listPro = new ArrayList <Product> ();
		
		listPro.add(new Product(1,"Samsung A5",17000f));  
		listPro.add(new Product(3,"Iphone 6S",65000f));  
		listPro.add(new Product(2,"Sony Xperia",25000f));  
		listPro.add(new Product(4,"Nokia Lumia",15000f));  
		listPro.add(new Product(5,"Redmi4 ",26000f));  
		listPro.add(new Product(6,"Lenevo Vibe",19000f));  
		
		Stream <Product> filterData =  listPro.stream().filter( 
				p -> p.price > 20000  
		);
		
		Stream <Product> filterDataless = listPro.stream().filter(
				
				p1 -> p1.price < 20000
				
				);
				
		filterData.forEach(
				
				Pro -> System.out.println(Pro.name + Pro.price)
				
				);
		
		filterDataless.forEach(
				
				pro1 -> System.out.println(pro1.id + ":" + pro1.name + ":" + pro1.price)
				);

	}

}
