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
		
		System.out.println("============ Practice=================== =>");
		Collections.sort(city, 
				
				(d1, d2) -> {
					return Integer.compare(d1.length(), d2.length());
				}
				
		);
		System.out.println("City =>"+city);
		
		System.out.println("============================== Practice2 , sort list on  basis  of length using stream========================================");
		
		Collections.sort(city,
				
				(c1 , c2) -> {
						return Integer.compare(c1.length(), c2.length());
					}
				
				);
		System.out.println("City length =>"+city);
		
		System.out.println("============================== Practice2 , sort list on  basis  of Name using stream========================================");
		Collections.sort(city, 
				
				(P1, P2) -> {
						return P1.compareTo(P2);
					}
				
				);
		System.out.println("City Name =>"+city);
	}

}
