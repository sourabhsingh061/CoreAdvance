package com.rays.polymorphism;

public class TestPolymorphism {
	public static void main(String[] args) {

		Shape c = new Circle(5);
		System.out.println("area of circle is =" + c.area());

		Shape r = new Rectangle(10, 20);
		System.out.println("area of rectangle is =" + r.area());

		Shape t = new Triangle(10, 20);
		System.out.println("area of circle is =" + t.area());
		System.out.println();

		Shape[] s = new Shape[3];
		s[0] = new Circle(5);
		s[1] = new Rectangle(10, 20);
		s[2] = new Triangle(10, 20);

		double total = 0;
		for (int i = 0; i < s.length; i++) {
			total = total + s[i].area();

			// System.out.println("total area is =" + total);
		}
		System.out.println(" total area is =" + total);

	}

}
