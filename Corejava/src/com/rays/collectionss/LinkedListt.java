package com.rays.collectionss;

import java.util.LinkedList;

public class LinkedListt {
	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.add("sourabhj");
		l1.add("abhi");
		l1.add("aksh");
		l1.add("raj");
		System.out.println("elements of linked list"+l1);
		
		System.out.println("last index is equal"+l1.lastIndexOf("aksh"));
		System.out.println("last indext of a ="+l1.indexOf("abhi"));
		System.out.println("sublist is equal to"+l1.subList(1, 3));
	
		//System.out.println("remove element from index="+l1.remove(3));
	}

}
