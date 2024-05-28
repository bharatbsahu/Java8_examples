package com.java8.DefaultMethods;

interface Sayable2 {

	// default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);

	// static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}

}

public class DefaultMethods2 implements Sayable2 {

	@Override
	public void sayMore(String msg) {// implementing abstract method

		System.out.println(msg);
	}

	public static void main(String[] args) {
		
		DefaultMethods2 dm = new DefaultMethods2();
		
		dm.say();						// calling default method    
		
		dm.sayMore("Work is worship");	// calling abstract method    
		
		Sayable2.sayLouder("Helloooo..."); 		// calling static method    

	}

}
