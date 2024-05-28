package com.java8.LambdaExp2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaExpressionExample8 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
		
		List<String> filteredNames = names.stream()
							.filter(name -> name.startsWith("B"))
							.map(name -> name.toUpperCase())
							.collect(Collectors.toList());
		System.out.println(" filteredNames:"+filteredNames);

	}

}
