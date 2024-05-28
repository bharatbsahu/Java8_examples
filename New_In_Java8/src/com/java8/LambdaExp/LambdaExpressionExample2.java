package com.java8.LambdaExp;

@FunctionalInterface // It is optional
interface Drawable2 {
	
	public void draw();
}

//with lambda Expression
public class LambdaExpressionExample2 {
	
	public static void main(String[] args) {
		int width = 20;

		// with lambda

		Drawable2 d2 = () -> {
			System.out.println("width:"+width);
		};
		
		d2.draw();
	}
}
