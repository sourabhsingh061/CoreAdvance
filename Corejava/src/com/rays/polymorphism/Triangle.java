package com.rays.polymorphism;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle() {
		
	}
	public Triangle(int base) {
	this.base =  base;	
	}
	public Triangle(int height, int base) {
		this.base =  base;
		this.height =  height;
		
	}
	public double area() {
		double d = (base*height)/2;

	return d;
	}

}
