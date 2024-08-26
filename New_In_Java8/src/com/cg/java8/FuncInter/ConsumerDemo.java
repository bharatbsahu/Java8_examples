package com.cg.java8.FuncInter;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		java.util.function.Consumer <String> _consumer = (str) ->  System.out.println(str.toUpperCase()) ;
		
		_consumer.accept("Java 8");

	}

}
