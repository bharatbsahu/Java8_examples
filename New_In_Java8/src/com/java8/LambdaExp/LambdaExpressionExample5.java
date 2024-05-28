package com.java8.LambdaExp;

//Java Lambda Expression Example: Multiple Parameters

@FunctionalInterface
interface Addable{  
    int add(int a,int b);  
}  
  
public class LambdaExpressionExample5 {
	
    public static void main(String[] args) {  
          
        // Multiple parameters in lambda expression  
    	Addable ad1=(a,b)->(a+b);
    	System.out.println("Hello:"+ad1.add(23, 23));
          
    	// Multiple parameters with data type in lambda expression  

    	Addable ad2 = (int x, int y) -> (x+y);
    	System.out.println("Hello2:"+ad2.add(200, 300));
    	
    }
}
