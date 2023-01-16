package com.rays.exceptionss;

public class ParentCatchExceptions {
	public static void main(String[] args) {

		try {
			String s = "java";

			//System.out.println(s.length());
			System.out.println(s.charAt(6));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("catch exception no 1");
		} catch (RuntimeException f) {
			System.out.println("catch exception no 2");
		//}finally {
		//	System.out.println("thi is final");
		//
	  }
	}
}