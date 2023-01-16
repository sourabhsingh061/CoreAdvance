package com.rays.collectionss;

import java.util.Comparator;

public class AssignmentSortingComparator implements Comparator<AssignmentSortingComparator> {
	private String fname;
	private String lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public int compare(AssignmentSortingComparator o1, AssignmentSortingComparator o2) {

		// ;return o1.fname.compareTo(o2.fname)
		if (o1.getFname()== o2.getFname()) {
			return o1.getLname().compareTo(o2.getLname());
			
		} else {
			return o1.getFname().compareTo(o2.getFname());
		}
	}

}
