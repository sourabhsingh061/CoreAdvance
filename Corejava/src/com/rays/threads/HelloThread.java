package com.rays.threads;

public class HelloThread extends Thread {
	String name = null;
	
	public HelloThread() {

	}
	public HelloThread(String name) {
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + name);
		}
		
	}
	
}