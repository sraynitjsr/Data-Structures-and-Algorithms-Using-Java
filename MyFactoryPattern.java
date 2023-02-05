package com.sraynitjsr.design_patterns;

interface Shape {
	void display();
}

class Square implements Shape {
	public void display() {
		System.out.println("Inside Square");
	}
}

class Triangle implements Shape {
	public void display() {
		System.out.println("Inside Triangle");
	}
}

class ShapeFactory {
	public static Shape getShape(String userInput) {
		if(userInput.equals("Square")) {
			return new Square();
		} else if(userInput.equals("Triangle")) {
			return new Triangle();
		} else {
			return null;
		}
	}
}

public class MyFactoryPattern {
	public static void startFactoryPattern() {
		System.out.println("Inside Factory Design Pattern");
		ShapeFactory.getShape("Square").display();
		ShapeFactory.getShape("Triangle").display();
	}
}
