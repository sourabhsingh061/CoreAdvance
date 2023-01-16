package com.rays.polymorphism;

public class Circle extends Shape{
	private int radius;
	public Circle() {
		
	}
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getradius() {
		return radius;
	}
	public double area() {
		double d = Shape.PI*radius*radius;
		return d;
	}
}
