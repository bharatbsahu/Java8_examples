package com.java8.ForEach;

import java.util.ArrayList;
import java.util.List;


//Iterating by passing method reference

public class ForEachExample {
	
	public static void main(String[] args) {
		
		List <String> gameList = new ArrayList<String>();
		
		gameList.add("Football");
		gameList.add("Cricket");
		gameList.add("Chess");
		gameList.add("Hocky");
		
		System.out.println("------------Iterating by passing method reference---------------");  
		gameList.forEach(System.out::println);

	}

}