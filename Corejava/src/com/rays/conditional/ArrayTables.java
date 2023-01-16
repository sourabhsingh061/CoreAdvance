package com.rays.conditional;

public class ArrayTables {
	public static void main(String[] args) {
		int[][] table = new int[11][11];
		for (int i = 1; i < table.length; i++) {
			for (int j = 2; j < table[i].length; j++) {
				System.out.print(i*j+"\t");
			}		
			System.out.println();
		}
		//System.out.println();
		
	}

}
