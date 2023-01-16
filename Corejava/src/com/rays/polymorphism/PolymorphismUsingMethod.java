package com.rays.polymorphism;

public class PolymorphismUsingMethod {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		/*s[0] = getShape(1);
		s[1] = getShape(2);
		s[2] = getShape(3);*/
		System.out.println(getShape(1).area());
		System.out.println(getShape(2).area());
		System.out.println(getShape(3).area());
		
		System.out.println(totalArea(s));
	}
	//polymorphism using return type
	public static Shape getShape(int i) {
		if(i==1) return new Circle(5);
		if(i==2) return new Rectangle(10,20);
		if(i==3) return new Triangle(10,20);
		return null;
	}
	
	//polymorphism using return type
	public static double totalArea(Shape[] s) {
		double  total = 0;
		for (int i = 0; i < s.length; i++) {
			total= total+s[i].area();
		}
		return total;
	}
	
}
