package com.cg.java8.FuncInter;

@FunctionalInterface
interface sayable22 {
	void say(String msg); // abstract method
	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object obj);
}

public class FunctionalInterfaceExample1_New implements sayable22 {

	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample1_New fie = new FunctionalInterfaceExample1_New();
		fie.say("Hello there");
		
		
		
	}

}
