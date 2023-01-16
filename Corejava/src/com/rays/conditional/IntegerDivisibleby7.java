package com.rays.conditional;

public class IntegerDivisibleby7 {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 100; i < 200; i++) {
			if (i % 7 == 0) {

				   j=i+j;
				System.out.println(i);
			}
		}
		   System.out.println(j);
	}

}
