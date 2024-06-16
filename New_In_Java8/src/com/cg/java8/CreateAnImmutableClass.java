package com.cg.java8;

public final class CreateAnImmutableClass {
	
	private final int value;
	private final String text;
	
	
	public CreateAnImmutableClass(int value, String text){
		this.value = value;
		this.text = text;
	}
	
	public int getValue() {
		return value;
	}


	public String getText() {
		return text;
	}
	
	

}
