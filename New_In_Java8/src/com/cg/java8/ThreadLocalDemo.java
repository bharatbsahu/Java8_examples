package com.cg.java8;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		
		
        // Creating objects of ThreadLocal class
        ThreadLocal<Number> gfg_local = new ThreadLocal<Number>();
 
        ThreadLocal<String> gfg = new ThreadLocal<String>();
 
        // Now setting custom value
        gfg_local.set(100);
 
        // Returns the current thread's value
        System.out.println("value = " + gfg_local.get());
 
        // Setting the value
        gfg_local.set(90);
 
        // Returns the current thread's value of
        System.out.println("value = " + gfg_local.get());
 
        // Setting the value
        gfg_local.set(88.45);
 
        // Returns the current thread's value of
        System.out.println("value = " + gfg_local.get());
 
        // Setting the value
        gfg.set("GeeksforGeeks");
 
        // Returning the current thread's value of
        System.out.println("value = " + gfg.get());

	}

}
