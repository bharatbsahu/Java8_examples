package com.cg.java8.FuncInter;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> _BiPredicate = (I1, I2) -> I1 % I2 == 0 ;
		
		System.out.println(_BiPredicate.test(10, 2));
		
		
		
	      BiPredicate<Integer, Integer> biPredicate1 = (n1, n2) -> (n1 % n2 == 0);
	      BiPredicate<Integer, Integer> biPredicate2 = (n1, n2) -> (n1 * n2 > 100);
	      
	      System.out.println(biPredicate1.and(biPredicate2).test(120, 6)); // false

	      BiPredicate<String, String> biPredicate3 = (s1, s2) -> s1.startsWith(s2);
	      BiPredicate<String, String> biPredicate4 = (s1, s2) -> s1.endsWith(s2);
	      
	      System.out.println(biPredicate3.and(biPredicate4).test("Java", "J")); 
	        // false
	      System.out.println(biPredicate3.and(biPredicate4).test("CODEC", "C")); 
	        // true

	}

}
