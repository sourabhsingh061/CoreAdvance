package com.rays.java8;

public class TestSocialwoker1 {

	public static void main(String[] args) {

		SocialWorker1 add = (a,b) -> {
			int c = a + b;
			System.out.println("addition is " + c);
			return c;
		}; add.HelpToOther(10,20 );
		
		SocialWorker1 sub = (a,b)->{
			int c = a-b;
			System.out.println("substraction is "+ c);
			return c;
		} ; sub.HelpToOther(80, 30);
		
		SocialWorker1 mul = (a,b) -> {
			int c = a*b;
			System.out.println("multiply is "+ c);
			return c;
		}; mul.HelpToOther(5, 7);
		
	}
}
