package com.java8.LambdaExp;

//Java Lambda Expression Example: Single Parameter

@FunctionalInterface
interface Sayable4 {
	
	public String say(String name);
}

public class LambdaExpressionExample4 {
	
	public static void main(String[] args) {

		// Lambda expression with single parameter.
		Sayable4 s1 = (name) -> {
			return "Hello1, " + name;
		};
		
		System.out.println(s1.say("Sam1"));

		// You can omit function parentheses
		Sayable4 s2 = name -> {
			
			return "Hello2, " + name;
			
		};
				
		System.out.println(s2.say("Mili"));
	}
}