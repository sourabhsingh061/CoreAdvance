package com.rays.inheritance;

public class TestInheritation {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.setBorderWidth(8);
		c.setColor("red");
		c.setRadius(5);
		c.area();
		System.out.println(c.getBorderWidth());
		System.out.println(c.getColor());
		System.out.println();

		Rectangles r = new Rectangles();
		r.setBorderWidth(6);
		r.setColor("black");
		r.setLength(6);
		r.setWidth(5);
		r.area();
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
	

		Triangle t = new Triangle();
		t.setBorderWidth(2);
		t.setColor("grey");
		t.setBase(10);;
		t.setHeight(5);;
		t.area();

		System.out.println(t.getBorderWidth());
		System.out.println(t.getColor());

	
	
	}
}
