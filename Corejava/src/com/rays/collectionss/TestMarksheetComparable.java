package com.rays.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheetComparable {
	public static void main(String[] args) {
		Marksheet1 m = new Marksheet1();
		m.setRollno("4");
		m.setFname("sourabh");
		m.setLname("rajput");
		m.setPhy(86);
		m.setChem(67);
		m.setMath(98);

		Marksheet1 m1 = new Marksheet1();
		m1.setRollno("2");
		m1.setFname("ram");
		m1.setLname("patel");
		m1.setPhy(77);
		m1.setChem(67);
		m1.setMath(68);

		Marksheet1 m2 = new Marksheet1();
		m2.setRollno("3");
		m2.setFname("ajay");
		m2.setLname("gurjar");
		m2.setPhy(55);
		m2.setChem(97);
		m2.setMath(48);

		Marksheet1 m3 = new Marksheet1();
		m3.setRollno("1");
		m3.setFname("vijay");
		m3.setLname("yadav");
		m3.setPhy(83);
		m3.setChem(37);
		m3.setMath(58);

		ArrayList list = new ArrayList();
		list.add(m);

		list.add(m1);
		list.add(m2);
		list.add(m3);

		Collections.sort(list);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			Marksheet1 o = (Marksheet1) it.next();
			System.out.println(o.getRollno() + " " + o.getFname() + " " + o.getLname() + " " + o.getPhy() + " "
					+ o.getChem() + " " + o.getMath());
		}

	}

}
