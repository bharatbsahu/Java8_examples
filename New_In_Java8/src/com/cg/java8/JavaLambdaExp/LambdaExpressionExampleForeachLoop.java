package com.cg.java8.JavaLambdaExp;

import java.util.*;  

@FunctionalInterface
interface abc{
	void xyz();
}

public class LambdaExpressionExampleForeachLoop {

	public static void main(String[] args) {
		
		System.out.println("Hi From -> Java Lambda Expression Example: Foreach Loop");
		
		List <String> _list = new ArrayList <>();
		
		_list.add(null);
		_list.add("ankit");  
		_list.add("mayank");  
		_list.add("irfan");  
		_list.add("jai");  
		

		_list.forEach(
				
			n -> System.out.println(n)
				
		);
		
		
		

	}

}
