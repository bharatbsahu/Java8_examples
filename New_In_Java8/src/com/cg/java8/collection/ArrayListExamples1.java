package com.cg.java8.collection;

import java.io.*;
import java.util.*;

public class ArrayListExamples1 {

	public static void main(String[] args) {
		System.out.println("Hi From Array List Demo -> ");
		
		ArrayList <Integer> ArrList = new ArrayList<Integer>();
		
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
        	ArrList.add(i);

        // Printing elements
        System.out.println(ArrList);
        
     // Remove element at index 3
        ArrList.remove(3);
        //ArrList.remove(3);
        
        // Displaying the ArrayList
        // after deletion
        System.out.println(ArrList);
        
        for(int i=0; i < ArrList.size() ; i++ ) {
        	
        	  System.out.println(" -> " +ArrList.get(i) + " ");
        	
        }
        
        
	}

}
