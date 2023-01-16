package com.rays.threads;

public class TestHelloRunnable {
	public static void main(String[] args) {
		 
		Thread t1 = new Thread( new HelloRunnable("ram"));
		Thread t2 = new Thread( new HelloRunnable("shyam"));
		//t1.setPriority(8);
		
		t1.start();
		t2.start();

	}

}
