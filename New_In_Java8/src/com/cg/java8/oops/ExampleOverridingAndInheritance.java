package com.cg.java8.oops;

//Java program to demonstrate application
//of overriding in Java

//Base Class
class Employee1 {
	public static int base = 10000;

	int salary() {
		return base;
	}
}

//Inherited class
class Manager extends Employee1 {
	// This method overrides salary() of Parent
	int salary() {
		return base + 20000;
	}
}

//Inherited class
class Clerk extends Employee1 {
	// This method overrides salary() of Parent
	int salary() {
		return base + 10000;
	}
}

public class ExampleOverridingAndInheritance {

	public static void main(String[] args) {
		
		
        Employee1 obj1 = new Manager();
        
        // We could also get type of employee using
        // one more overridden method.loke getType()
        System.out.print("Manager's salary : ");
        printSalary(obj1);
 
        Employee1 obj2 = new Clerk();
        System.out.print("Clerk's salary : ");
        printSalary(obj2);

	}

	private static void printSalary(Employee1 obj1) {
		System.out.println(obj1.salary());
		
	}

}
