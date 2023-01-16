package com.rays.oopss;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setColor("red");
		System.out.println(s.getColor());
		s.setBorderWidth(4);
		System.out.println(s.getBorderWidth());

	}
}
