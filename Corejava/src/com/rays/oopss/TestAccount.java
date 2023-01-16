package com.rays.oopss;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.setAccountType("saving");
		a.setNumber("12345678");
		a.deposit(1000);
		a.withdrawl(200);
		a.fundTransfer(100);
		a.payBill(50);

		System.out.println("account number is =" + a.getNumber());
		System.out.println( " account type is = " + a.getAccountType());

		System.out.println( "total balance is =" + a.getBalance());
//System.out.println(a.deposit());
//System.out.println(a.withdrawl());
	}
}
