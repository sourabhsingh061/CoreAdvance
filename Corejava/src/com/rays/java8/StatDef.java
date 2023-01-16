package com.rays.java8;

public interface StatDef {
	public static void TestStatic() {
		System.out.println("Static");
		
	}
	public default void TestDef() {
		System.out.println("Default");
	}

}
