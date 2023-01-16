package com.rays.exceptionss;

public class CatchUnderTry {
	public static void main(String[] args) {

		try {
			int a = 20, b = 0;
			int c = a / b;
			System.out.println(a / b);
		

		} catch (Exception e) {
			System.out.println("zero se divide nb=hi hoga");
		}
			try {
				String s = "java";
				System.out.println(s.charAt(5));
		} catch (Exception e2) {
				System.out.println("itni string hi nhi hai");
		}
	}
}

			

		

	

