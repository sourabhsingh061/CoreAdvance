package com.rays.collectionss;

import java.util.Comparator;

public class SortByFname implements Comparator<Marksheet1>{
	
		
	

	

	@Override
	public int compare(Marksheet1 o1, Marksheet1 o2) {
		
			if (o1.getFname()== o2.getFname()){
				return o1.getLname().compareTo(o2.getLname());
				
			} else {
				return o1.getFname().compareTo(o2.getFname());
			}



		}
	} 


