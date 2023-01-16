package com.rays.inheritance;


public class Circle extends Shape {

	private int radius;
	//public static final float PI = 3.14f;
	
	public void setRadius ( int radius ) {
	this.radius=radius;
	}
	public int getRadius(){
	return radius;
	}
	public void area() {
	    double d =  Shape.PI*radius*radius ;
	    System.out.println();
	    System.out.println("Area of circle =" +d);

	}
	
}
