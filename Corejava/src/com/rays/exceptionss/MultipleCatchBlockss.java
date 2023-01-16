package com.rays.exceptionss;

public class MultipleCatchBlockss {
	public static void main(String[] args) {
		/*
		 * int a = 10, b = 0; int c = a / b;
		 */
		//String s = "java";
		try {
			String s = "java";

			System.out.println(s.length());
			System.out.println(s.charAt(6));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("catch exception no 1");
			
		} catch (NullPointerException f ) {
			
			System.out.println("catch exception no 2");
		}catch (Exception g) {
			System.out.println("catch exception no 3");
		}

	}
}
