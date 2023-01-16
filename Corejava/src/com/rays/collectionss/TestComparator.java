package com.rays.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparator {
	public static void main(String[] args) {
		ComparatorToSort m = new ComparatorToSort();
		m.setRollno("4");
		m.setFname("sourabh");
		m.setLname("rajput");
		m.setPhy(86);
		m.setChem(67);
		m.setMath(98);

		ComparatorToSort m1 = new ComparatorToSort();
		m1.setRollno("2");
		m1.setFname("ram");
		m1.setLname("patel");
		m1.setPhy(77);
		m1.setChem(67);
		m1.setMath(68);

		ComparatorToSort m2 = new ComparatorToSort();	
		m2.setRollno("3");
		m2.setFname("ajay");
		m2.setLname("gurjar");
		m2.setPhy(55);
		m2.setChem(97);
		m2.setMath(48);

		ComparatorToSort m3 = new ComparatorToSort();
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
		

		Collections.sort(list, new ComparatorToSort());
		Iterator it = list.iterator();
		while (it.hasNext()) {
			ComparatorToSort t  = (ComparatorToSort) it.next();
			System.out.println(t.getRollno()+" "+t.getFname()+" "+ t.getLname()+" "+ t.getPhy()+" "+t.getChem()+" "+t.getMath());
			
		}

}
}
