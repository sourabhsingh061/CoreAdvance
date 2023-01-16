package com.rays.conditional;

public class MethodCalling {
	int a = 10;
	int b = 20;
	public void add() {
		//public static void add(){
	//public int add() {
		int a = 10;
		int b = 20;

		int c = a + b;
		System.out.println("add=" + c);
	//	return c;

	}

	public static void main(String[] args) {
	MethodCalling m = new MethodCalling();
		m.add();
	}
}
