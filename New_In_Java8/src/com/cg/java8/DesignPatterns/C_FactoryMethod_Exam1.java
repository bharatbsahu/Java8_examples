package com.cg.java8.DesignPatterns;


abstract class Product1 {
    public abstract void display();
}


//Concrete Products
class ConcreteProductA extends Product1 {
	 @Override
	 public void display() {
	     System.out.println("This is Concrete Product A.");
	 }
}

class ConcreteProductB extends Product1 {
    @Override
    public void display() {
        System.out.println("This is Concrete Product B.");
    }
}


//Creator Abstract Class
abstract class Creator {
	public abstract Product1 factoryMethod();
}

class ConcreteCreatorA extends Creator {

	@Override
	public Product1 factoryMethod() {
		return new ConcreteProductA();
	}
	
}

class ConcreteCreatorB extends Creator{

	@Override
	public Product1 factoryMethod() {
		return new ConcreteProductB();
	}
	
}


public class C_FactoryMethod_Exam1 {

	public static void main(String[] args) {
		
		System.out.println("Hi From => C_FactoryMethod_Exam..");
		
		Creator CreatorA = new ConcreteCreatorA();
		Product1 ProductA = CreatorA.factoryMethod();
		ProductA.display();
		
		Creator CreatorB = new ConcreteCreatorB();
		Product1 ProductB = CreatorB.factoryMethod();
		ProductB.display();

	}

}
