package com.cg.java8.oops;


interface Sayable{
	
	// default method    
	default void say() {
		System.out.println("Hello, this is default method");   
	}
	
	// Abstract method   
	void sayMore(String msg);    
	
	// static method  
	public static void sayLouder(String msg){    
        System.out.println(msg);    
    }  
	
}



public class StaticMethodsinsideJava8Interface implements Sayable {



    public void sayMore(String msg){     // implementing abstract method    
        System.out.println(msg);    
    }    

	public static void main(String[] args) {
		
		StaticMethodsinsideJava8Interface dm = new StaticMethodsinsideJava8Interface();    
        dm.say();                       // calling default method    
        dm.sayMore("Work is worship");      // calling abstract method    
        Sayable.sayLouder("Helloooo...");   // calling static method  

	}
	
}
