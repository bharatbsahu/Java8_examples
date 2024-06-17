package com.cg.java8.FuncInter;


@FunctionalInterface
interface sayable2{
	void saying2(String msg1);  // abstract method  
	
	

}

//@FunctionalInterface
interface sayable3 extends sayable2{
	void saying3(String msg1);  // abstract method  
	
	
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}



public class FunctionalInterfaceExtFunInt implements sayable3 {

	public static void main(String[] args) {
		
		FunctionalInterfaceExtFunInt funInt = new FunctionalInterfaceExtFunInt();
		
		funInt.saying2(null);
		funInt.saying3(null);

	}

	@Override
	public void saying2(String msg1) {
		System.out.println("Hello from saying2");
		
	}

	@Override
	public void saying3(String msg1) {
		System.out.println("Hello from saying3");
		
	}

}
