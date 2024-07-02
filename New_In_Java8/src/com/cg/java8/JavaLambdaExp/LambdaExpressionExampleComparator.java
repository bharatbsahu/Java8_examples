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
		
		List <Product1> list = new ArrayList<>();
		
        //Adding Products  
        list.add(new Product1(1,"HP Laptop",25000f));  
        list.add(new Product1(3,"Keyboard",300f));  
        list.add(new Product1(2,"Dell Mouse",150f));  
        
        
        
        for (Product1 p:list) {
        	System.out.println(p.id+" "+p.name+" "+p.price);  
        	
        }
        
        System.out.println("Sorting on the basis of name...");  
        
        // implementing lambda expression  
        
        Collections.sort(list, 
        		
        		(p1, p2) -> {
        			return p1.name.compareTo(p2.name);
        		}
        		
        		
        );
        
        for (Product1 p:list) {
        	System.out.println(p.id+" "+p.name+" "+p.price);  
        	
        }
  
        System.out.println("Sorting on the basis of Name reverse ...");  

        Collections.sort(list, 
        		
        		(s1, s2) -> {
        			return s1.name.compareTo(s1.name);
        			//return Integer.compare(s1.id, s2.id);
        		}
        );
        
        Collections.reverse(list);
        
        for (Product1 p:list) {
        	System.out.println(p.id+" "+p.name+" "+p.price);  
        	
        }
        
        
        System.out.println("Sorting on the basis of ID ...");  
        
        Collections.sort(list, 
        		
        		(p1, p2) -> {
        			
        			return Integer.compare(p1.id, p2.id);
        		} 
        		
        );
        
        for (Product1 p1: list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);  
        	
        } 
        
        System.out.println("Sorting on the basis of price ...");  
        Collections.sort(list, 
        		(f1, f2) -> {
        			return Float.compare(f1.price, f2.price);
        		} 
        );
        
        for (Product1 p1: list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);  
        	
        } 
        
        System.out.println("Sorting on the basis of name...");  
        
        // implementing lambda expression  
        
        Collections.sort(list, 
        		
        		(p1, p2) -> {
        			return p1.name.compareTo(p2.name);
        		}
        
        		
        	);

        for (Product1 p1: list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);  
        	
        } 
        
        System.out.println("Sorting on the basis of ID ...");  
        
        Collections.sort(list, 
        		(I1, I2) -> {
        			return Integer.compare(I1.id, I2.id);
        				
        		}
        ); 
        
        for (Product1 p1: list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);  
        	
        } 
        
        //==================================================================
        System.out.println("//==================================================================");
        System.out.println("Sorting on the basis of ID practise...");  
        Collections.sort(list, 
        		
        		
        		(l1, l2) ->  Integer.compare(l1.id, l2.id)
        		
        		
        );
        for (Product1 p1: list) {
        	System.out.println(p1.id+" "+p1.name+" "+p1.price);  
        	
        } 
        
        System.out.println("Sorting on the basis of name Practise...");  
        Collections.sort(list, 
        		
        		(p1, p2) -> p1.name.compareTo(p2.name)
        );
        for (Product1 p1: list) {System.out.println(p1.id+" "+p1.name+" "+p1.price);   }
        
	}

}
