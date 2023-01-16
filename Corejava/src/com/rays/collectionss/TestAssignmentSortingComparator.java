package com.rays.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class TestAssignmentSortingComparator {
	public static void main(String[] args) {
		AssignmentSortingComparator m = new AssignmentSortingComparator();
		m.setFname("Ram");
		m.setLname("Verma");
		
		AssignmentSortingComparator m1 = new AssignmentSortingComparator();
		m1.setFname("Ram");
		m1.setLname("Sharma");
		
		
		AssignmentSortingComparator m2 = new AssignmentSortingComparator();
		m2.setFname("Ramesh");
		m2.setLname("Sharma");
		
		AssignmentSortingComparator m3 = new AssignmentSortingComparator();
		m3.setFname("Ram");
		m3.setLname("Jain");
		
		ArrayList list = new ArrayList();
		list.add(m);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		Collections.sort(list ,new AssignmentSortingComparator() );
		
		   Iterator it=list.iterator();
		   while (it.hasNext()) {
			AssignmentSortingComparator o = (AssignmentSortingComparator) it.next();
			System.out.println(o.getFname()+" "+o.getLname());
		}
		
		
	}

}
