package com.java8.LambdaExp;

@FunctionalInterface
interface Drawable {
	public void draw();
}

//Without Lambda Expression

public class LambdaExpressionExample {
	
	public static void main(String[] args) {
		int width = 10;

		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		
		d.draw();
	}
}

