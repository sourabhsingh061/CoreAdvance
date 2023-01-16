package com.rays.collectionss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListt {
	public static void main(String[] args) {
		TestStreamsApi l =  new ArrayList();
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(44);
		l.add(55);
		l.add(66);
		l.add(77);
		l.set(3, 886);
		
		System.out.println("array list is ="+l);
		System.out.println("last index is equal"+l.lastIndexOf(44));
		System.out.println("last indext of a ="+l.indexOf(66));
		System.out.println("sublist is equal to"+l.subList(1, 4));
		System.out.println("get index is ="+l.get(4));
		System.out.println("remove element from index="+l.remove(3));
	}
}
