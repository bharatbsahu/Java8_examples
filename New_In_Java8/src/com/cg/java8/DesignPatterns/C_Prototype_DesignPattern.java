package com.cg.java8.DesignPatterns;




//Prototype interface
interface Shape {
	 Shape clone();  // Make a copy of itself
	 void draw();    // Draw the shape
}


//Concrete prototype
class Circle implements Shape {
	 private String color;
	
	 // When you create a circle, you give it a color.
	 public Circle(String color) {
	     this.color = color;
	 }
	
	 // This creates a copy of the circle.
	 @Override
	 public Shape clone() {
	     return new Circle(this.color);
	 }
	
	 // This is how a circle draws itself.
	 @Override
	 public void draw() {
	     System.out.println("Drawing a " + color + " circle.");
	 }
}

//Client code
class ShapeClient {
	
	private Shape _shapeProtoType;
	
	public ShapeClient(Shape _shapeProtoType) {
		this._shapeProtoType = _shapeProtoType;
	}
	
	public Shape createShape() {
		return _shapeProtoType.clone();
	}
	
}

public class C_Prototype_DesignPattern {

	public static void main(String[] args) {
		System.out.println("Hi From => Prototype Design Pattern");
		
		Shape circleType = new Circle("red");
		
		ShapeClient _client = new ShapeClient(circleType);
		
		// Use the prototype to create a new shape (a red circle).
		Shape redCircle = _client.createShape();
		
		redCircle.draw();

	}

}
