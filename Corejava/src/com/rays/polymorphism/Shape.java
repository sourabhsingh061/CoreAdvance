package com.rays.polymorphism;

public class Shape {
	private String color;

	private String borderWidth;
	public static final float PI = 3.14f;
	
	public Shape() {
		
	}
	public Shape(String color) {
		this.color = color;
		
	}
	public Shape(String color,String borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
	}

	public String getColor() {
		return color;
	}

	public String getBorderWidth() {
		return borderWidth;
	}
	public double area() {
		return 0;
	}
}
