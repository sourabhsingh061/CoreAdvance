package com.rays.conditional;

public class Grading {
	public static void main(String[] args) {
		int  marks = 64;
		if ( marks > 90) {
			System.out.println("grade is A+");
			
		} else if (marks > 80) {
			System.out.println("grade is A");
		} else if( marks > 70) {
			System.out.println("grade is B+");
		} else if( marks> 60) {
			System.out.println("grade is b");
		} else if( marks > 50) {
			System.out.println(" grade is c +");
		} else if ( marks > 40) {
			System.out.println(" grade is c");
		} else if( marks > 33) {
			System.out.println(" grade is d");
		} else {
			System.out.println(" fail");
		}
	}

}
