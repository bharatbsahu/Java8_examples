package com.cg.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HowManyTimesEachCharacter {

	public static void main(String[] args) {

		System.out.println("Hi From -> Write a Java program to print how many times each character is repeated in a given string.");
		
		String str = "Hello How Are You";
		System.out.println("Hi From ->"+str);
		
		Map<Character, Long> charCountMap = countOccurrences(str);

		/*
	    charCountMap.forEach(
	    		(character, count) ->
	    			System.out.println("The character '" + character + "' occurs " + count + " times in the string.")
        );
	    */
		charCountMap.forEach(
				
				(character, count) ->  System.out.println(character+""+count)
				
				);
		

		
	}

	private static Map<Character, Long> countOccurrences(String str) {
		
		
		/*return str.chars()
                .mapToObj(c -> (char) c)
                .collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
                
                ); */
		
		/*
		return 	str.chars()
                .mapToObj(c -> (char) c)
				.collect(
				
						Collectors.groupingBy(Function.identity(), Collectors.counting())						
						
				);
		*/
		
		return str.chars()
				.mapToObj( C -> (char)C)
				.collect( 
						
						Collectors.groupingBy(Function.identity(), Collectors.counting())
				);
		
	}

}
