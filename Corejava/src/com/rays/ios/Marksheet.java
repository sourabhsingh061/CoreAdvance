package com.rays.ios;

import java.io.Serializable;

public class Marksheet implements Serializable {
	private int id;
	private String name;
	private String subject;
	
	public Marksheet() {

	}
	public Marksheet(int id) {
		this.name=name;
	}
	public Marksheet(int id,String name) {
		this.name=name;
		this.id=id;
	}
	public Marksheet(int id,String name,String subject) {
		this.name=name;
		this.id=id;
		this.subject=subject;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	
	}
