package com.java8.methref;

@FunctionalInterface
interface Messageable {
	
	Message getMessage(String msg);
}

class Message {
	
	Message(String msg) {
		System.out.print(msg);
	}
}

public class ConstructorReference {
	
	public static void main(String[] args) {
		
		Messageable Mess = Message::new;
		
		Mess.getMessage("Hello");

	}
}
