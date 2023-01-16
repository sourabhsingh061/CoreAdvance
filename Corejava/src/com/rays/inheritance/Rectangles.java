package com.rays.inheritance;

public class Rectangles extends Shape {
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void area() {
		double d = length*width;
		System.out.println("Area of rectangle =" +d);
	}
	
	
	

}
