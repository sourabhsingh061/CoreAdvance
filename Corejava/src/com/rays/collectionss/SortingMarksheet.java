package com.rays.collectionss;

import java.util.ArrayList;
import java.util.List;

public class SortingMarksheet {
public static void main(String[] args) {
	TestStreamsApi l = new ArrayList();
	
	Marksheet m1 = new Marksheet();
	l.add(10);
	l.add(32);
	l.add(66);
	l.add(35);
	l.add(23);
	l.add(m1);
	  
	Marksheet m2 = new Marksheet();
	l.add(10);
	l.add(32);
	l.add(66);
	l.add(35);
	l.add(23);
	l.add(m2);
	
	System.out.println(l.contains(m1));
	System.out.println(l.remove(m1));
	


	
	
}
}
