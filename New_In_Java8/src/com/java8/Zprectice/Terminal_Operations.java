package com.java8.Zprectice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Terminal_Operations {

	public static void main(String[] args) {
		System.out.println("********************* Terminal_Operations **********************");
		
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
		
		System.out.println("********************* names:"+names);
		
		
		
		long count = names.stream()
					.filter(name -> name.startsWith("J"))
					.count();
		
		System.out.println("********************* count:"+count);
		
		long count1 = names.stream()
						.filter(name -> name.startsWith("J"))
						.count();
		
		
	}

}
