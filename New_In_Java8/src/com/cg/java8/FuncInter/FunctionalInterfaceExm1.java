package com.cg.java8.FuncInter;


@FunctionalInterface
interface sayable{
	
	void say1(String msg);
}


public class FunctionalInterfaceExm1 implements sayable{
	
	

	public static void main(String[] args) {
		
		FunctionalInterfaceExm1 fi1= new FunctionalInterfaceExm1();
		
		fi1.say1("Ajay");
	}

	@Override
	public void say1(String msg) {
		 System.out.println("Say Hello to"+msg);
		
	}

}
