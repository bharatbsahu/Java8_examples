package com.java8.LambdaExp;

@FunctionalInterface
interface Addable3 {
	int add(int a, int b);
}


//Java Lambda Expression Example: with or without return keyword

public class LambdaExpressionExample6 {

	public static void main(String[] args) {

		// Lambda expression without return keyword.
		Addable3 ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));

		// Lambda expression with return keyword.
		Addable3 ad2 = (int a, int b) -> {
			return a+b;
		};
		
		System.out.println("Hello2:"+ ad2.add(2000, 30000));
		
	}
}
