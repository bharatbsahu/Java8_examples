package com.cg.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpExmp {

	public static void main(String[] args) {

			System.out.println("strem Example ");
			
			
			
			List<Integer> list = new ArrayList<>();
			list = Arrays.asList(1,2,3,4,5,6,7,8);
			
			list.parallelStream().forEach(System.out::println);
			
			list.stream()
				.filter( n -> n % 2 == 0)
				.map(n -> n * n)
				.forEach(System.out::println);
			
			
			//list.parallelStream().forEach(System.out::println);

	}

}
