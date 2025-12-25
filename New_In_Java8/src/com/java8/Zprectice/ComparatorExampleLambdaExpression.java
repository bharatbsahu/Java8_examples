package com.java8.Zprectice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;





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



public class ComparatorExampleLambdaExpression {
	

	

	public static void main(String[] args) {
		System.out.println("*************** ComparatorExampleLambdaExpression *************************");
		
		
		List <Product> list = new ArrayList<>();
		
        //Adding Products  
        list.add(new Product(1,"HP Laptop",25000f));  
        list.add(new Product(3,"Keyboard",300f));  
        list.add(new Product(2,"Dell Mouse",150f));  
        
        for (Product p:list) {
        	System.out.println(p.id+" "+p.name+" "+p.price);  
        	
        }
        
        System.out.println("Sorting on the basis of name...Comparable -> compareTo() method:");  
        // implementing lambda expression  Comparable -> compareTo() method
        
        Collections.sort( list,
        		
        		(p1, p2) -> {
        				return p1.name.compareTo(p2.name);
        			}
        		
        		);
        for (Product p1: list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);  
        	
        } 
                
        System.out.println("Sorting on the basis of Name reverse ...Comparable -> compareTo() method:");  
        // implementing lambda expression  Comparable -> compareTo() method
        
        Collections.sort( list,
        		
        			(p1, p2) -> {
        				
        				return p1.name.compareTo(p2.name);
        			}
        		
        		);
        Collections.reverse(list);
        for (Product p1: list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);  
        }
        
        System.out.println("Sorting on the basis of ID ...Comparator -> compare(o1, o2):");  
        // implementing lambda expression  Comparator -> compare(o1, o2) method
        
        Collections.sort(list, 
        		(p1, p2) -> {
        				return Integer.compare(p1.id, p2.id);
        			}
        );
        for (Product p1: list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);  
        }
        
        System.out.println("Sorting on the basis of price ... Comparator -> compare(o1, o2):");  
        //implementing lambda expression  Comparator -> compare(o1, o2) method
        
        Collections.sort(list, 
        		
        		(o1, o2) -> {
        			return Float.compare(o1.price, o2.price);
        		});
        
        for (Product p1: list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);  
        }
	}

}
