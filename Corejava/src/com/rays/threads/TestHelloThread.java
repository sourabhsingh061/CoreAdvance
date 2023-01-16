package com.rays.threads;

import com.rays.basics.Hello;

public class TestHelloThread {
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread("Ram");
		HelloThread t2 = new HelloThread("shyam");
		
		t1.start();
		t2.start();
				
	}

}
