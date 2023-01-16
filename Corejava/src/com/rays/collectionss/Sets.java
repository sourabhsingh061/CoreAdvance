package com.rays.collectionss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		Set s = new HashSet<>();
		s.add(1);
		s.add(4);
		s.add("soirabh");
		s.add(7);
		System.out.println(s);
		
		
		Set a = new TreeSet<>();
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(8);
		System.out.println(a);
		
		Set c = new LinkedHashSet();
		c.add(3);
		c.add(45);
		c.add(12);
		c.add(856);
		System.out.println(c);
	}

}
