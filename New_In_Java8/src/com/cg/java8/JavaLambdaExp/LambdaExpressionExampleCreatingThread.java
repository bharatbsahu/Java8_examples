package com.cg.java8.JavaLambdaExp;

public class LambdaExpressionExampleCreatingThread {

	public static void main(String[] args) {
		System.out.println(" Hi From -> Lambda Expression Example: Creating Thread");
		
		//Thread Example without lambda  
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				 System.out.println("Thread1 is running...");  
			}
		};
		
		r1.run();
		
		 //Thread Example with lambda  
		
		

	}

}
