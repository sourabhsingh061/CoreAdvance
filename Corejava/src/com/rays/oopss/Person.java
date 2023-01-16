package com.rays.oopss;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String address;


	// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public void setname(String a) {
		name = a;
	}

	public String getname() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setaddress(String c) {
		address = c;
	}

	public String getaddress() {
		return address;
	}
	
	

}
