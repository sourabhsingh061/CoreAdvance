package com.rays.oopss;

public class Account {
	private String number;
	private String  accountType;
	private  double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void  deposit(double amount) {
		balance = amount + balance;
	}
	public void withdrawl(double amount) {
		balance =  balance - amount;
	}
	public void fundTransfer(double amount) {
		balance = balance - amount;
	}
	 public void payBill(double amount){
	 balance = balance - amount;
	}
	
	

}
