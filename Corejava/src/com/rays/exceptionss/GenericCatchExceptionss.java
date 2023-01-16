package com.rays.exceptionss;

public class GenericCatchExceptionss {
public static void main(String[] args) {
	try {
		String s = "java";
		System.out.println(s.charAt(6));
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
