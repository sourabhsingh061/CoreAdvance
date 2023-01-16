package com.rays.collectionss;

import java.util.Iterator;
import java.util.Vector;

public class Vectorr {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("tea");
		v.add("coffee");
		v.add("coldCofee");
		v.add(80);
		System.out.println(v);

		Iterator i = v.iterator();
		while (i.hasNext()) {
			Object o = (Object) i.next();
			System.out.println("iterator example is : " + o);

		}
	}

}
