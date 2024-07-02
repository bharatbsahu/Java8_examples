package com.cg.java8.DesignPatterns;


interface Product {
	public void display();
}

class ProductA implements Product{
	@Override
	public void display() {
		System.out.println("This is Concrete Product A.");
	}
}

class ProductB implements Product{

	@Override
	public void display() {
		System.out.println("This is Concrete Product B.");
	}
}

interface Factory {
	public Product factoryMethod();
}

class FactoryA implements Factory{

	@Override
	public Product factoryMethod() {
		return new ProductA();
	}
	
}

class FactoryB implements Factory {

	@Override
	public Product factoryMethod() {
		return new ProductB();
	}
	
}


public class C_FactoryMethod_Exam2 {

	public static void main(String[] args) {
		
		System.out.println("Hi From => C_FactoryMethod_Exam..");
		
		Factory _FactoryA = new FactoryA();
		Product _ProductA = _FactoryA.factoryMethod();
		_ProductA.display();
		
		
		Factory _FactoryB = new FactoryB();
		Product _ProductB = _FactoryB.factoryMethod();
		_ProductB.display();
	}

}
