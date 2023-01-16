package com.rays.conditional;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUsingFormat {
	
	public static void main(String[] args) {

		Date d = new Date();
		// System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String d1 = sdf.format(d);
		System.out.println(d1);
		//int a = d.getDay();
		//int b = d.getMonth();
		//int c = d.getYear();
		Date d2 = new Date("15/09/2000");
		int a = d.getDate();
		int b = d.getMonth()+1;
		int c = d.getYear();

		int a1 = d2.getDate();
		int b1 = d2.getMonth()+1;
		int c1 = d2.getYear();
		
		
		
		System.out.println(a-a1);
		System.out.println(b-b1);
		System.out.println(c-c1);

		

	}

}
