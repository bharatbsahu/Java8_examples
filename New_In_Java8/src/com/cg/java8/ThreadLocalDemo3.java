package com.cg.java8;

//Java Program to Illustrate ThreadLocal Class
//Via initialValue() Method

//Importing required classes
import java.lang.*;

//Class 1
//Helper class extending Thread class
class NewThread extends Thread {

	private static ThreadLocal gfg = new ThreadLocal() {
		protected Object initialValue() {
			return new Integer(question--);
		}
	};

	private static int question = 15;

	NewThread(String name) {
		// super keyword refers to parent class instance
		super(name);
		start();
	}

	// Method
	// run() method for Thread
	public void run() {

		for (int i = 0; i < 2; i++)
			System.out.println(getName() + " " + gfg.get());
	}
}

//Class 2
//Main class
//ThreadLocalDemo

public class ThreadLocalDemo3 {

	// Main driver method
	public static void main(String[] args) {

		// Creating threads inside main() method
		NewThread t1 = new NewThread("quiz1");
		NewThread t2 = new NewThread("quiz2");
	}
}
