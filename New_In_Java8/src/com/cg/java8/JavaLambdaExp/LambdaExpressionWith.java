package com.cg.java8.JavaLambdaExp;



@FunctionalInterface
interface Drawable1{  
    public void draw1();  
}  


public class LambdaExpressionWith {

	public static void main(String[] args) {
		
		System.out.println("Hi From -> With Lambda Expression ");
		
	       int width=10; 
	       
	       //with lambda  
	       
	       Drawable1 d1 = () -> {
	    	   
	    	   System.out.println("width->"+width);
	       };
	       
	       
	       d1.draw1();
	}

}
