package com.rays.conditional;

public class CopyArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] b = new int[5];
		System.arraycopy(a, 2, b, 0, 4);
		for (int v : b) {

			System.out.println(v);
		}

//System.out.println(b);
	}
}