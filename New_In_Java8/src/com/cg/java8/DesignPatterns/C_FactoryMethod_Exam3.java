package com.cg.java8.DesignPatterns;


abstract class Product2{
	
	public  abstract void display();
}


//Concrete Products
class ConcreteProductAA extends Product2 {

	@Override
	public void display() {
		System.out.println("This is Concrete Product AA.");		
	}
		
}

class ConcreteProductBB extends Product2{

	@Override
	public void display() {
		System.out.println("This is Concrete Product BB.");
	}
	
}

//Creator Abstract Class
abstract class Creatorr {
	public abstract Product2 factoryMethod();
}

class ConcreteCreatorAA extends Creatorr{

	@Override
	public Product2 factoryMethod() {
		return new ConcreteProductAA();
	}
	
}

class ConcreteCreatorBB extends Creatorr {

	@Override
	public Product2 factoryMethod() {
		return new ConcreteProductBB();
	}
	
}

public class C_FactoryMethod_Exam3 {

	public static void main(String[] args) {
		System.out.println("****************C_FactoryMethod_Exam3 Practice ****************");
		
		Creatorr CreatorAa = new ConcreteCreatorAA();
		Product2 ProductAa = CreatorAa.factoryMethod();
		ProductAa.display();
		System.out.println(ProductAa.hashCode());
		System.out.println(ProductAa.toString());
		
		Creatorr CreatorBb = new ConcreteCreatorBB();
		Product2 ProductBb = CreatorBb.factoryMethod();
		ProductBb.display();
		System.out.println(ProductBb.hashCode());
		System.out.println(ProductBb.toString());

	}

}
