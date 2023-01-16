package com.rays.exerciselambda;

public class TestEvenNumber {
	public static void main(String[] args) {
		EvenNumber n = (b)-> {
			
				if (b%2==0) {
					System.out.println("even no");
				} else {
					System.out.println("odd no");
				}
			
			
		};n.evenno(3);
		}

}
