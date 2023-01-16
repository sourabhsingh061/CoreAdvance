package com.rays.conditional;

public class GradeUsingSwitchcase {
	public static void main(String[] args) {
		int marks = 80;

		switch (marks) {

		case 90:
			System.out.println("A grade");
			break;
		case 80:
			System.out.println(" B grade");
			break;
		case 70:
			System.out.println("c grade");

			break;

		default:
			System.out.println("fail");
			break;
		}
	}
}
