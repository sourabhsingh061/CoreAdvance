package com.rays.constructor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class TestConstructor {
	public static void main(String[] args) throws ParseException  {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dob = sdf.parse("20/07/2000");
		
		Constructorr c = new Constructorr("sourabh singh", "indore");
		System.out.println(c.getname());
		System.out.println(c.getAddress());
		System.out.println(c.PI);
		
		
		PersonConstructor p = new PersonConstructor("sourabh singh rajput", "mhow naka", dob);
		System.out.println();
		System.out.println(p.getname());
		System.out.println(p.getaddress());
		System.out.println(sdf.format(p.getDob()));
		
		
		AccountConstructor a = new AccountConstructor ("saving","12345",2000);
		a.deposit(200);
		a.withdrawl(400);
		a.fundTransfer(100);
		a.payBill(300);
		System.out.println();
		System.out.println(a.getAccountType());
		System.out.println(a.getNumber());
		System.out.println(a.getBalance());
	
	}

}
