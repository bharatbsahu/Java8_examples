package com.cg.java8.FuncInter;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> predict = (a) -> a%2 == 0;
		
		System.out.println(predict.test(2));
		

	}

}
