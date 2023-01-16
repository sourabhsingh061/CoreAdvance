package com.rays.abstraction;

public class TestAbstraction {
public static void main(String[] args) {
	Shape s = new Rectangle(10,20);
	System.out.println(s.area());
	
	Circle c = new Triangle(40,40);
	System.out.println(c.area());
}
}
