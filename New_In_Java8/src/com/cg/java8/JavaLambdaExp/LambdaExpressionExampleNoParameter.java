package com.cg.java8.JavaLambdaExp;



@FunctionalInterface
interface Sayable{  
    public String say();  
}  

public class LambdaExpressionExampleNoParameter {

	public static void main(String[] args) {
		
		System.out.println("Hi From -> Java Lambda Expression Example: No Parameter");
		
		Sayable _say = () -> {
			return "Hi From -> Java Lambda ";
			
		};
		System.out.println(_say.say());  
		
		//practice
		
		Sayable say1 = () -> {
						return "Hi From -> Java Lambda 2";
					};
		
		System.out.println(say1.say());

	}

}
