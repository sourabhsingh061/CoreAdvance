package com.rays.constructor;

public class AccountConstructor {
	private String number;
	private String  accountType;
	private  double balance;
	
	
	public AccountConstructor(String number, String accountType,double balance) {
		this.number = number;
		this.accountType= accountType;
		this.balance = balance;
		
	   /*  this.balance = balance-withdrawl;
		this.balance= balance-fundTransfer;
		this.balance = balance-payBills;*/
		
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getAccountType() {
		return accountType;
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


