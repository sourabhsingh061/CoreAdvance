package com.rays.collectionss;

import java.util.HashMap;
import java.util.Hashtable;

public class Maps {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1, "sourabh");
		m.put(2, "naman");
		m.put(3, "aniruddh");
		m.put(4, "ashu");
		System.out.println(m);
		
		Hashtable h = new Hashtable();
		h.put(10, "sourabh");
		h.put(2, "naman");
		h.put(34, "aniruddh");
		h.put(4, "ashu");
		//h.remove(2);
		System.out.println("remove elemnts are : "+h);
		System.out.println(h);

		

	}

}
