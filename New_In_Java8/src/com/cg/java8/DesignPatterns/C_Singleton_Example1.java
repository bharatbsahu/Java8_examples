package com.cg.java8.DesignPatterns;

//Java program implementing Singleton class
//with using  getInstance() method

//Class 1
//Helper class

class Singleton1 {
	
	private static Singleton1 single_Instance = null;
	
    // Declaring a variable of type String
    public String str;
			
    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Singleton1() {
    	str = "Hello I am a string part of Singleton class";
    }
    
    public static synchronized Singleton1 getInstance() {
    	
    	if(single_Instance == null)
    		single_Instance = new Singleton1();
    	
    	return single_Instance;
    }
	
}


public class C_Singleton_Example1 {

	public static void main(String[] args) {
		System.out.println("Hi From => Singleton_Example1");
		
        // Instantiating Singleton class with variable x
        Singleton1 x = Singleton1.getInstance();
 
        // Instantiating Singleton class with variable y
        Singleton1 y = Singleton1.getInstance();
 
        // Instantiating Singleton class with variable z
        Singleton1 z = Singleton1.getInstance();
        
        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());
        
        System.out.println(" Print value "+ x.str);
         
        // Condition check
        if (x == y && y == z) {
 
            // Print statement
            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }
 
        else {
            // Print statement
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
        
	}

}
