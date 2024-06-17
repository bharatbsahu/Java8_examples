package com.cg.java8.JavaLambdaExp;


@FunctionalInterface
interface Addable{
	
	public abstract int AddFun(int a, int b);
	
}

public class LambdaExpressionExampleMultipleParameters {

	public static void main(String[] args) {
		
		System.out.println("Hi From -> Java Lambda Expression Example: Multiple Parameters");
		
		Addable _add = (x,y) -> {
			return x + y ;
		};
		
		System.out.println(_add.AddFun(3, 4));
		
		Addable _ad1 = (int a, int b) -> (a+b);
		
		System.out.println(_ad1.AddFun(300, 400));
		
	}

}
