package com.rays.collectionss;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSets {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add(2);
		s.add(40);
		s.add(63);
		s.add(84);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		//System.out.println(s.headSet(40));
		System.out.println(s.tailSet(40));
		//System.out.println(s.subSet(2, 6));

		
	}

}
