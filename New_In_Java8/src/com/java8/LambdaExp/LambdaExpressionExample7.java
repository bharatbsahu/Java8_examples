package com.java8.LambdaExp;

import java.util.ArrayList;
import java.util.List;

//Java Lambda Expression Example: Foreach Loop

public class LambdaExpressionExample7 {
	
	
	  public static void main(String[] args) {  
		  
		  List <String> list = new ArrayList<String>();
		  
		  list.add("ankit");
		  list.add("mayank");
		  list.add("irfan");
		  list.add("jai");
		  list.add("David");
		  
		  list.forEach(
				  
				  (n) -> System.out.println("Val->"+n)
				  
		  );
		  
	  }

}
