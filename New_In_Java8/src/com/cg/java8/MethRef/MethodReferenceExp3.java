package com.cg.java8.MethRef;


@FunctionalInterface
interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}

public class MethodReferenceExp3 {
	
	
	public static void main(String[] args) {  
		
		
		Messageable hello = Message::new;
		
		hello.getMessage("Hi from Constructor");
		
		
	}

}
