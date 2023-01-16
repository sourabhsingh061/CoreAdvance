package com.rays.exceptionss;

public class ExceptionExample {
	public static void main(String[] args) {
		try {

			int i=10,j=0;
			int s = i/j;
			System.out.println( s);
			
		} 
		 catch(ArithmeticException d) {
			 d.printStackTrace();
			System.out.println("zero se divide nhi hoga");
			
		}finally {
			System.out.println("singh");
		}
		
	}

}
