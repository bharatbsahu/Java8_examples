package com.cg.java8.collection;

import java.io.*;
import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		System.out.println("Hi from -> CollectionDemo");
		
		
	    // Creating instances of the array,
        // vector and hashtable
		
		int arr[] = new int[] {1,2,3,4,5,6,7};
		
		Vector <Integer> _vector = new Vector<>();
		
		Hashtable <Integer, String> hastab = new Hashtable<>();
		
        // Adding the elements into the
        // vector
		
		_vector.addElement(1);
		_vector.addElement(2);
		
	    // Adding the element into the
        // hashtable
		hastab.put(1, "hello");
		hastab.put(2, "geeks");
		hastab.put(3, "4geeks");
		//hastab.put(4, null);
		
        // Array instance creation requires [],
        // while Vector and hastable require ()
        // Vector element insertion requires addElement(),
        // but hashtable element insertion requires put()
 
        // Accessing the first element of the
        // array, vector and hashtable
		
		System.out.println("Integer Array=>"+arr[0]);
		System.out.println("Vector =>"+_vector.get(0));
		System.out.println("Vector =>"+_vector.firstElement());
		System.out.println("Vector =>"+_vector.elementAt(0));
		System.out.println("Hash Table =>"+hastab.get(1));
		
		
		
	}

}
