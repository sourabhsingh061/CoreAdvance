package com.rays.polymorphism;

public class MethodOverloading {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, double b) {
		System.out.println(a + b);
	}

	public void add(double a, double b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int a, double b, float c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {

		MethodOverloading a = new MethodOverloading();
		a.add(10.20, 20.20);
		a.add(10, 20.20);
		a.add(2, 3);
		a.add(2, 2.2, 3.3f);
		a.add(2, 3, 4);

	}
}
