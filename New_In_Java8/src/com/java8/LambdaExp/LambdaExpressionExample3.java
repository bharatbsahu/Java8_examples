package com.java8.LambdaExp;

//Java Lambda Expression Example: No Parameter

@FunctionalInterface
interface Sayable {
	
	public String say();
}

public class LambdaExpressionExample3 {
	
	public static void main(String[] args) {
		

		Sayable s = () -> {
			return "Java Lambda Expression Example: No Parameter";
			
		};
		
		
		System.out.println(s.say());
	}
}
