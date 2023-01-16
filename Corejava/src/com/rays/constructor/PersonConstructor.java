package com.rays.constructor;

import java.util.Date;

public class PersonConstructor {
	private String name;
	private String address;
	private Date dob;

	public PersonConstructor(String name, String address, Date dob) {
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public String getname() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public String getaddress() {
		return address;
	}

}
