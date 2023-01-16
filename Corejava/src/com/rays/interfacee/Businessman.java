package com.rays.interfacee;

public class Businessman extends Person implements Richman,SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("help to other");
	}

	@Override
	public void earnMoney() {
		System.out.println("to earn money");
	}

	@Override
	public void donation() {
		System.out.println("to donation");
	}

	@Override
	public void party() {
		System.out.println("to party");
	}
	public static void main(String[] args) {
		Businessman b= new Businessman();
		Richman r = new Businessman();
		SocialWorker s = new Businessman();
	    Person p = new Person();
	    p.setAddress("indore mhow naka");
	    p.setName("sourabh singh");
		b.donation();
		b.earnMoney();
		b.helpToOthers();
		b.party();
		r.donation();
		r.earnMoney();
		r.party();
		System.out.println(p.getAddress());
		System.out.println(p.getName());
	}



}
