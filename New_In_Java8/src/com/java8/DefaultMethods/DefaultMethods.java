package com.java8.DefaultMethods;

@FunctionalInterface
interface Sayable{
	
	// Default method   
	
	default void say() {
		
		System.out.println("Hello, this is default method");
	}
	
	// Abstract method  
	void sayMore(String msg);
	
}



public class DefaultMethods implements Sayable{
	
	public static void main(String[] args) { 
		
		DefaultMethods dm = new DefaultMethods();
		
		dm.say();
		
		dm.sayMore("Work is worship");
		
	}

	@Override
	public void sayMore(String msg) {  // implementing abstract method   
		
        System.out.println(msg);  
		
	}

}// Abstract method  
