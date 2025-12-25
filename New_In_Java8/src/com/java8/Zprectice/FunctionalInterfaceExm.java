package com.java8.Zprectice;


@FunctionalInterface
interface sayable99{
	
	void say1(String msg);
}

public class FunctionalInterfaceExm  implements sayable99 {
	
	public static void main(String[] args) {
		System.out.println("******** FunctionalInterfaceExm ******");
		
		FunctionalInterfaceExm obj = new FunctionalInterfaceExm();
		obj.say1("Ajay");
	}
	

	@Override
	public void say1(String msg) {
		
		System.out.println("******** FunctionalInterfaceExm ****** say1 -> msg"+msg);
		
	}

}
