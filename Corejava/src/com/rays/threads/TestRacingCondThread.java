package com.rays.threads;

public class TestRacingCondThread {
	public static void main(String[] args) {
		RacingCondThread t1 = new RacingCondThread("ram");
		RacingCondThread t2 = new RacingCondThread("shyam");
		
		t1.start();
		t2.start();

	}

}
