package com.rays.exceptionss;

public class TryUnderTry {
	public static void main(String[] args) {
		try {

			int i = 10, j = 2;
			int s = i / j;
			System.out.println(s);

			try {

				int a = 10, b = 0;
				int c = a / b;
				System.out.println(c);
			} catch (Exception e) {
				System.out.println("zero se divide nhi hoga");
			}
		} catch (Exception f) {
			System.out.println("zero se divide nhi hogaaaaa");
		}

	}

}
