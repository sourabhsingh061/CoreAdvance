package com.rays.exerciselambda;

public class TestMaximum {
	public static void main(String[] args) {
		
		Maximum m = (a,b)-> {
			
			if(a>b) {
	            System.out.println("a is greater");
			} else {
				System.out.println("b is greater");
			}
				
		} ; m.max(3, 7);
			
		
	}
}

