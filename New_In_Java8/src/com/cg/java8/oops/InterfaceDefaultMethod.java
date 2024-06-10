package com.cg.java8.oops;



interface int1 {
	
	public static final int z = 10;
	
	default void display() {
		 System.out.println("hello");
	}
	
	static void display2Static() {
		System.out.println("display2Static");
	}
}

public class InterfaceDefaultMethod implements int1 {
	
	 public static void main (String[] args) {
		
		 InterfaceDefaultMethod test = new InterfaceDefaultMethod();
		 test.display();
		 int1.display2Static();
		
	}

}
