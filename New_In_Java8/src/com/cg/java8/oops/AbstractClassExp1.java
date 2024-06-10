package com.cg.java8.oops;


abstract class Sunstar  {
	
	abstract void printInfo();
	
}

//Abstraction performed using extends
class Employee extends Sunstar {

	@Override
	void printInfo() {
		
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;
 
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
		
	}
	
	
	
}



public class AbstractClassExp1 {

	public static void main(String[] args) {
		Sunstar sunstar = new Employee();
		
		sunstar.printInfo();

	}

}
