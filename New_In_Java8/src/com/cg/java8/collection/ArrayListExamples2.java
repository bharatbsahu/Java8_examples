package com.cg.java8.collection;

import java.io.*;
import java.util.*;


public class ArrayListExamples2 {

	public static void main(String[] args) {
		
		
		System.out.println("Hi From Array List Demo2 -> ");
		
		List <String> arrlst = new ArrayList<>();
		
		arrlst.add("aaa");
		arrlst.add("bbb");
		arrlst.add("ccc");
		arrlst.add(null);
		
        // Printing elements
        System.out.println(arrlst);
        
        // Remove element at index 3
        arrlst.remove(2);
        //arrlst.remove("ccc");
        
        System.out.println(arrlst);
        
        
	}

}
