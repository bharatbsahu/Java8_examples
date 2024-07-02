package com.cg.java8.DesignPatterns;


class Singleton {
	
	private static Singleton single_instance = null;
	
	public String str;
	private Singleton() {
		str = "Hello I am a string part of Singleton class";
	}
	
	public static Singleton Singleton() {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
	} 
}

public class C_Singleton_Example2 {

	public static void main(String[] args) {
		
		System.out.println("Hi From => C_Singleton_Example2");
		
		Singleton x = Singleton.Singleton();
		Singleton y = Singleton.Singleton();
		Singleton z = Singleton.Singleton();
		
		x.str = (x.str).toUpperCase();
		
        System.out.println("String from x is " + x.str);
        System.out.println("String from y is " + y.str);
        System.out.println("String from z is " + z.str);
        System.out.println("\n");
        
        // Now again changing variable of instance z
        z.str = (z.str).toLowerCase();
 
        System.out.println("String from x is " + x.str);
        System.out.println("String from y is " + y.str);
        System.out.println("String from z is " + z.str);

	}

}
