package com.cg.java8.JavaLambdaExp;


@FunctionalInterface
interface Sayablee{  
    String say(String message);  
}  


public class LambdaExpressionExampleMultipleStatements {

	public static void main(String[] args) {
		
		System.out.println("Hi From -> Java Lambda Expression Example: Multiple Statements");
		
		
		Sayablee _person = (message) -> {
			
			  String str1 = "I would like to say, ";  
			  
			  String str2 = str1 + message;
			
			return str2;
		};
		
		System.out.println(_person.say("time is precious."));

		
	}

}
