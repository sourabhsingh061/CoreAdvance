package com.rays.collectionss;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCollection {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("sourabhj");
		l1.add("abhi");
		l1.add("aksh");
		l1.add("raj");
		// l1.clear();
		System.out.println("size of the given list is : " + l1.size());
		l1.add(2, "Ankit");

		System.out.println("collection is empty or not : " + l1.isEmpty());
		System.out.println("elements of linked list" + l1);

		ArrayList l2 = new ArrayList();
		l2.add("adarsh");
		l2.add("ani");
		l2.add("ashu");
		l2.add("pankaj");
		System.out.println("elements of linked list" + l2);
		l1.addAll(l2);
		System.out.println("add elemnts pf l1 and l2" + l1);

		System.out.println("contain elemnets are : " + l2.containsAll(l1));

	}

}
