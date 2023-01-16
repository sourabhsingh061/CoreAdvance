package com.rays.constructor;

public class Constructorr {
	private String name;
	private String address;
	public static final float PI=3.14f;
	
	
	public Constructorr() {
		System.out.println("this is a default constructor");
	}
	
	public Constructorr(String name, String address) {
	this.name  = name;
	this.address=address;
	}
	
	public String getname() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	

}
