package com.rays.abstraction;


public class Triangle extends Circle {
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
