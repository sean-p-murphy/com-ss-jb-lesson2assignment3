package com.ss.jb.lesson2assignment3.lesson2assignment3;

interface Shape {
	public double calculateArea();
	public void display();
};

class Triangle implements Shape {
	int base;
	int height;

	public Triangle (int b, int h) {
		base = b;
		height = h;
	};

	public double calculateArea() {
		return 0.5 * base * height;
	};

	public void display() {
		System.out.println("The area if the Triangle is " + this.calculateArea() + ".");
	};

};

class Rectangle implements Shape {
	int height;
	int length;

	public Rectangle (int h, int l) {
		height = h;
		length = l;
	};

	public double calculateArea() {
		return height * length;
	};

	public void display() {
		System.out.println("The area of the Rectangle is " + this.calculateArea() + ".");
	};

};

class Circle implements Shape {
	int diameter;
	double pi = Math.PI;

	public Circle (int d) {
		diameter = d;
	};

	public double calculateArea() {
		double first = Math.pow(diameter / 2,2);
		return first * pi;
	};

	public void display() {
		System.out.println("The area of the Circle is " + this.calculateArea() + ".");
	};

};

public class Lesson2assignment3Application {

	public static void main(String[] args) {
		Triangle myTriangle = new Triangle(8,4);
		Rectangle myRectangle = new Rectangle(7,5);
		Circle myCircle = new Circle(6);
		myTriangle.display();
		myRectangle.display();
		myCircle.display();
	};

}
