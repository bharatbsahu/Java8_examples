package com.cg.java8.JavaLambdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;  
import java.util.stream.Stream;   


class Product{  
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

public class LambdaExpressionExampleFilter_Collection_Data {

	public static void main(String[] args) {
		
		System.out.println("Hi From -> Java Lambda Expression Example: Filter Collection Data");
		
		List <Product> list = new ArrayList<>();
		
        list.add(new Product(1,"Samsung A5 ",17000f));  
        list.add(new Product(3,"Iphone 6S ",65000f));  
        list.add(new Product(2,"Sony Xperia ",25000f));  
        list.add(new Product(4,"Nokia Lumia ",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
        for (Product p1:list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);
        }
        
        System.out.println("Sorting on the basis of ID ...");  
        Collections.sort(list, 
        		(p1, p2) -> {
        			return Integer.compare(p1.id, p2.id);
        		}
        ); 
        for (Product p1:list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);
        }
        
        // Using lambda to filter data price > 20000 
        Stream <Product> filtered_Data = 
        		list.stream().filter(
        			P -> P.price > 20000 
        		);
        
        filtered_Data.forEach(
        		
        		P1 -> System.out.println(P1.name+P1.price)
        );
        
     // Using lambda to filter data id > 3
        Stream <Product> strem_Dt = list.stream().filter(
        		PP -> PP.id >3 
        	);
        
        strem_Dt.forEach(P -> System.out.println(P.id+P.name+P.price));

	}

}
