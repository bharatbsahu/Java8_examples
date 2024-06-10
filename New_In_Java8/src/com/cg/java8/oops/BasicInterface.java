package com.cg.java8.oops;

//Java program to demonstrate working of
//interface

import java.io.*;

//A simple interface
interface In1 {

	// public, static and final
	public static final int a = 10;

	// public and abstract
	public abstract void display();
}

//A simple interface
interface In2 extends In1{

	// public, static and final
	public static final int b = 20;

	// public and abstract
	public abstract void display2();
}

//A class that implements the interface.
class BasicInterface implements In2 {

	// Implementing the capabilities of
	// interface.
	public void display() {
		System.out.println("Geek");
	}

	// Driver Code
	public static void main(String[] args) {
		BasicInterface t = new BasicInterface();
		
		t.display();
		t.display2();
		System.out.println(t.a);
		System.out.println(t.b);
	}

	@Override
	public void display2() {
		System.out.println("Geek-2");
		
	}
}
