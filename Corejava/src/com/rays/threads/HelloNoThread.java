package com.rays.threads;

public class HelloNoThread {
	String name = null;
	public HelloNoThread() {
		
	}
	public HelloNoThread(String name) {
		this.name= name;
	}
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + name);
			
		}
	}
	
}
