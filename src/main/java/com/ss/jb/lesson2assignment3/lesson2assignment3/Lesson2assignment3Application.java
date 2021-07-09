package com.ss.jb.lesson2assignment3.lesson2assignment3;

interface Shape {
	public void calculateArea();
	public void display();
};

class Triangle implements Shape {
	int base;
	int height;

	public Triangle (int b, int h) {
		base = b;
		height = h;
	};

	public void calculateArea() {
		System.out.println("Triangle area is : " + 0.5 * base * height);
	};

	public void display() {
		System.out.println("This is a triangle : △");
	};

};

class Rectangle implements Shape {
	int height;
	int length;

	public Rectangle (int h, int l) {
		height = h;
		length = l;
	};

	public void calculateArea() {
		System.out.println("Rectangle area is " + height * length);
	};

	public void display() {
		System.out.println("This is a rectangle : ▢");
	};

};

class Circle implements Shape {
	int diameter;
	double pi = Math.PI;

	public Circle (int d) {
		diameter = d;
	};

	public void calculateArea() {
		double exponent = Math.pow(diameter / 2,2);
		System.out.println("Circle area is : " + pi * exponent);
	};

	public void display() {
		System.out.println("This is a circle : ◯");
	};

};

public class Lesson2assignment3Application {

	public static void main(String[] args) {
		Triangle myTriangle = new Triangle(8,4);
		Rectangle myRectangle = new Rectangle(7,5);
		Circle myCircle = new Circle(6);
		myTriangle.calculateArea();
		myTriangle.display();
		myRectangle.calculateArea();
		myRectangle.display();
		myCircle.calculateArea();
		myCircle.display();
	};

}
