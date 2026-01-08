package com.java8.Zprectice;


/* Abstract Factory Interface */
interface CarFactory {
	Car createCar();
	
	CarSpecification createSpecification();
}

//Concrete Factory for North America Cars
class NorthAmericaCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		 return new Sedan();
	}

	@Override
	public CarSpecification createSpecification() {
		return new NorthAmericaSpecification();
	}
	
}

//Concrete Factory for Europe Cars
class EuropeCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Hatchback();
	}

	@Override
	public CarSpecification createSpecification() {
		return new EuropeSpecification();
	} 
	
}

//Abstract Product Interface for Cars
interface Car {
	void assemble();
}

//Concrete Product for North America Car Specification
interface CarSpecification {
	void display();
}

//Concrete Product for Sedan Car
class Sedan implements Car {

	@Override
	public void assemble() {
		System.out.println("Assembling Sedan car.");
	}
}

//Concrete Product for Hatchback Car
class Hatchback implements Car {

	@Override
	public void assemble() {
		System.out.println("Assembling Hatchback car.");
	} 
}

//Concrete Product for North America Car Specification
class NorthAmericaSpecification implements CarSpecification {
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}

//Concrete Product for Europe Car Specification
class EuropeSpecification implements CarSpecification {
	 public void display() {
	     System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
	 }
}


public class C_AbstractFactory_Exp2 {

	public static void main(String[] args) {
		System.out.println("***********8 C_AbstractFactory_Exp2 ***** :");
		
		// Creating cars for North America
		System.out.println("*********** Creating cars for North America ***** :");
		CarFactory northAmericaFactory = new NorthAmericaCarFactory();
		Car northAmericaCar = northAmericaFactory.createCar();

		CarSpecification northAmericaSpec =  northAmericaFactory.createSpecification();
		
		northAmericaCar.assemble();
		northAmericaSpec.display();
		
		// Creating cars for Europe
		System.out.println("");System.out.println("*********** Creating cars for Europe ***** :");
		CarFactory europeFactory = new EuropeCarFactory();
		Car europeCar = europeFactory.createCar();
		
		CarSpecification europeSpec = europeFactory.createSpecification();
		
		europeCar.assemble();
		europeSpec.display();
		
	}

}
