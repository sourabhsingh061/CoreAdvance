package com.rays.oopss;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dob = sdf.parse("29/07/2000");
		//String b = sdf.format(dob);
		//Date d1 = sdf.parse(dob);
	

		p.setname("sourabh singh");
		p.setDob(dob);
		p.setaddress("indore");

	    
		System.out.println(p.getaddress());
		System.out.println(p.getname());
		System.out.println(sdf.format(p.getDob()));
		
		/*Account a = new Account();
		a.setAccountType("saving");
		a.setNumber("12345678");
		a.deposit(1000);
		a.fundTransfer(200);
		a.payBill(300);
		a.withdrawl(100);
		
		System.out.println();
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
		System.out.println(a.getNumber());*/
	}
	

}
