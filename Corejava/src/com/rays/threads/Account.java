package com.rays.threads;

public class Account {
	private int balance = 0;

	public int getbalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		this.balance = balance;
	}
	public synchronized void deposit(String msg , int amt) {
		int bal = getbalance();
		bal = bal + amt;
		setBalance(bal);
		System.out.println(msg + "new balance"+ bal);
	}

}
