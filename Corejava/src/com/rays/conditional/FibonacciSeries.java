package com.rays.conditional;

public class FibonacciSeries {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int n = 10; 
	int sum;
	for ( int i=0; i<=n; i++) {
		sum = a+b;
		a = b;
		b = sum;
		System.out.println(a);
	}
}
}
