package com.rays.exercise;

public class ReverseNumber {


public static void main(String[] args) {
	int rev = 0 ;
	int rem ;
	int n = 1234;
	for(n = 1234; n!=0;) {
	rem = n%10;
	rev = rev*10+rem;
	n = n/10;
	//System.out.println(rev);
	}
	System.out.println(rev);
}
}

