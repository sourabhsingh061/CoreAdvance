package com.rays.threads;

public class HelloRunnable implements Runnable {
	
	String name = null;

	public HelloRunnable() {

	}

	public HelloRunnable(String name) {
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i+ name );
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("time delay in 2 second");
				e.printStackTrace();
			}
		}
	}

}
