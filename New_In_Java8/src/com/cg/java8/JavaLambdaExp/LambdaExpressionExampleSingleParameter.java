package com.cg.java8.JavaLambdaExp;

@FunctionalInterface
interface Sayable2{  
    public String say(String name);  
}  

public class LambdaExpressionExampleSingleParameter {

	public static void main(String[] args) {
		
		System.out.println("Hi From -> Java Lambda Expression Example: Single Parameter");
		
		Sayable2 _s2 = (name1) -> {
			
			 return "Hello, " + name1 ;  
			
		};
		System.out.println(_s2.say("Kavita"));
		
		
		// You can omit function parentheses    
		Sayable2 _s1 = name2 -> {
			 return "Hello, " + name2 ;  
		};
		
		System.out.println(_s1.say("Pritam"));

	}

}
