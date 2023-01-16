package com.rays.java8;

public class TestSocialworker {
	public static void main(String[] args) {
		Socialworker s = new Socialworker() {

			@Override
			public void helpToOther() {
				System.out.println("ram");
			}
		};		s.helpToOther();

	}
}