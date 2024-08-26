package com.cg.java8.FuncInter;
import java.util.function.BiConsumer;
public class BiConsumerDemo {

	public static void main(String[] args) {
		
		java.util.function.BiConsumer<String, String> _biConsumer = 
				(s1, s2) -> { System.out.println("x: "+ s1 +", b: "+s2); };
				
		_biConsumer.accept("Java8", "Implementation");
		
		
		
	   	BiConsumer<Integer, Integer> addition = (a,b) -> {
	           System.out.println("Addition is: "+(a+b));
	   	};
	   		
	   	BiConsumer<Integer, Integer> subtraction = (a,b) -> {
	   	   System.out.println("Subtraction is: "+(a-b));
	   	};
	   	addition.andThen(subtraction).accept(2,1);

	}

}
