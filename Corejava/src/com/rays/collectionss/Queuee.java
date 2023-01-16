package com.rays.collectionss;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuee {
	public static void main(String[] args) {
		Queue f = new PriorityQueue();
		f.add(1);
		f.add(648);
		f.add(45);
		f.add(87);

		System.out.println(f);

		Queue k = new LinkedList();
		k.add(9798);
		k.add(60);
		k.add(8);
		k.add(9);
		System.out.println(k);
	}

}