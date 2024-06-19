package com.cg.java8.JavaLambdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaFilterListByNameSize {

	public static void main(String[] args) {
		System.out.println("Hi From -> sort list on  basis  of length using stream "); 
		
		List <String> city = new ArrayList<>();
		
		city.add("nagpur");
		city.add("pune");
		city.add("mumbai");
		city.add("goa");
		
		System.out.println("City =>"+city);
		
		//sort list on  basis  of length using stream
		Collections.sort(city, 
				(c1, c2) -> {
					return Integer.compare(c1.length(), c2.length());
				}
		);
		System.out.println("City =>"+city);
		
	}

}
