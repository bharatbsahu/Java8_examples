package com.cg.java8.MethRef;


interface Sayable{  
    void say();  
}  



public class MethodReferenceExp1 {


	public static void saySomething(){  
		System.out.println("Hello, this is static method.");  
	}


	public static void main(String[] args) {
		
		Sayable sayable = MethodReferenceExp1::saySomething;
		
		sayable.say();
	}

}
