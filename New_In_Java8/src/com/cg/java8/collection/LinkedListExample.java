package com.cg.java8.collection;



//Java program to demonstrate the
//working of LinkedList
import java.io.*;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		System.out.println("Hi From LinkedList -> ");
		
		
		LinkedList <Integer> linkLst = new LinkedList<Integer>();
		
		LinkedList <String> linkLstStr = new LinkedList<>();
		
		
		for ( int i = 1 ; i <= 5 ; i++)
			linkLst.add(i);
		
		linkLstStr.add("aaa");
		linkLstStr.add("bbb");
		linkLstStr.add("ccc");
		linkLstStr.add(null);
		
        // Printing elements
        System.out.println(linkLst);
        System.out.println(linkLstStr);
        
        // Remove element at index 3
        linkLst.remove(3);
        linkLstStr.remove(3);
 
        // Displaying the List
        // after deletion
        System.out.println(linkLst);
        System.out.println(linkLstStr);
        
        
        // Printing elements one by one
        for (int i = 0; i < linkLst.size(); i++)
            System.out.print(linkLst.get(i) + " ");
        
        
        for (int i = 0; i < linkLstStr.size(); i++)
            System.out.print(linkLstStr.get(i) + " ");
        

	}

}
