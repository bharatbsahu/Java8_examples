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
		
		
		System.out.println("Hi From -> Java Lambda Expression Example: Foreach Loop Practice***********8");
		
		List <String> list = new ArrayList <>();
		//list.add(null);
		list.add("Bharat");
		list.add("Tripti");
		list.add("Pratyush");
		list.add("Vaanya");
					
		list.forEach(
				n1 -> {
					System.out.println(n1);
				}				
			);
		
		System.out.println("Hi From -> Java Lambda Expression Start with B");
		
		list.forEach(
				
				n2 -> {
					
					if(n2.startsWith("B"))
					{
						System.out.println(n2);
					}
					
				}
				
			);
		

	}

}
