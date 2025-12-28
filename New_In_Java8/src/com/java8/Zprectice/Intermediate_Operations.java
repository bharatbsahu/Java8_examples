package com.java8.Zprectice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import com.cg.java8.Employee;

public class Intermediate_Operations {

	public static void main(String[] args) {
		System.out.println("******************** Intermediate_Operations **********************");
		
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
		
		System.out.println(names);
		
		Stream <String> stream = names.stream()
									.filter(name -> name.startsWith("J"))
									.map(String::toUpperCase);
		
		ArrayList<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list);
		
		//stream.forEach(System.out::print);
		
		Stream <String> stream1 = names.stream()
							.filter( name -> name.endsWith("n"))
							.map(String::toUpperCase);
		
		stream1.forEach(System.out::print);
		
		Stream <String> stream2 = names.stream()
										.filter(name -> name.startsWith("J"))
										.map(String::toUpperCase);
		
	}

}
