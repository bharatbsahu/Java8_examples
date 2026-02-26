package com.java8.Zprectice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HowManyTimesEachCharacterPrint {

	public static void main(String[] args) {
		System.out.println("*********************** HowManyTimesEachCharacterPrint:");
		
		System.out.println("Hi From -> Write a Java program to print how many times each character is repeated in a given string.");
		
		String str = "Hello How Are You";
		System.out.println("Hi From ->"+str);
		
		Map <Character, Long> charCountMap = countOccurrences(str);
		
		charCountMap.forEach(
				
				(character, count) -> {
					
					System.out.println(character + "-> " + count);
					
				}
			);
		
		
		System.out.println("+++++++++++++++++++= Practice ===================================");
		
		Map<Character, Long> counting = countOccurrences2(str);
		
		counting.forEach( 
				
				(charrr, longgg) -> System.out.println(charrr + "->" +longgg)
				
				);

	}
	private static Map<Character, Long> countOccurrences(String str) {

		return str.chars()
				.mapToObj(
					C -> (char)C
				)
				.collect(
						Collectors.groupingBy(Function.identity(), Collectors.counting())
				);
	}
	
	
	private static Map<Character, Long> countOccurrences2(String str) {
		
		return str.chars().mapToObj( c -> (char) c)
		.collect(
				
				Collectors.groupingBy( Function.identity() ,  Collectors.counting() )
		);
		
	}
}
