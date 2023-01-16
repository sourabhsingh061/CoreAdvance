package com.rays.exceptionss;

public class ExceptionFinallyNotPrint {
	public static void main(String[] args) {
		try {
			int a = 20, b = 0;
			int c = a / b;
			System.out.println(a / b);

			//System.out.println("zero se divide nhi hogaaaaa");

		} catch (Exception e) {
			 System.out.println("zero se divide nhi hoga");
				System.exit(0);

		}               
		
		finally {
			System.out.println("finally nhi chalna chahiye");
		}

	}
}
