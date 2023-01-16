package com.rays.abstraction;


public abstract class Circle extends Shape{
	private int radius;
	public Circle() {
		
	}
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getradius() {
		return radius;
	}
	public  abstract double area();
	/*	double d = Shape.PI*radius*radius;
		return d;
	}*/
}
