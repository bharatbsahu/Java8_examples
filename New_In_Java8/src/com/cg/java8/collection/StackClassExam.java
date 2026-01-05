package com.cg.java8.collection;

import java.util.*;

public class StackClassExam {

	public static void main(String[] args) {
		System.out.println("*******************StackClassExam ********************");
		
		Stack<String> stack = new Stack<String> ();
		
		stack.push(null);
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        
        // Iterator for the stack
        Iterator<String> itr = stack.iterator();
		
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        
        System.out.println();

        stack.pop();
        
        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
	}

}
