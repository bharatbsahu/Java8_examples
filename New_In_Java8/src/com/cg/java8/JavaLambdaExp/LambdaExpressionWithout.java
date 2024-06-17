package com.cg.java8.JavaLambdaExp;

@FunctionalInterface
interface Drawable{  
    public void draw();  
}  

public class LambdaExpressionWithout {

	public static void main(String[] args) {
		System.out.println("Hi From -> Without Lambda Expression ");
		
	       int width=15;  
	       
	        //without lambda, Drawable implementation using anonymous class  
	       	
	       Drawable dr = new Drawable() {

			@Override
			public void draw() {
				System.out.println("width->"+width);
				
			}
	    	   
	       };
	       dr.draw();

	}

}
