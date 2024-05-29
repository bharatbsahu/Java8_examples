package com.cg.java8.FuncInter;


@FunctionalInterface
interface sayable1{
	void saying(String msg1);  // abstract method  
	
	
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}

public class FunctionalInterfaceExample2 implements sayable1{

	public static void main(String[] args) {
        FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();  
        fie.saying("Hello there");  
	}

	@Override
	public void saying(String msg1) {
	
	    System.out.println(msg1);  
	}

}
