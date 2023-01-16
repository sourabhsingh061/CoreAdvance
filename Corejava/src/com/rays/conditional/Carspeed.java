package com.rays.conditional;

public class Carspeed {
	public static void main(String[] args) {
		int speed = 80;
		if(speed > 60) {
			System.out.println(" 6th gear");
		} else if (speed > 50) {
			 System.out.println(" 5th gear");
		} else if (speed> 40) {
			 System.out.println(" 4th gear");
		} else if ( speed > 30) {
			 System.out.println("3rd gear");
		} else if (speed > 20 ) {
			 System.out.println(" 2nd gear");
		} else if (speed > 10) {
			 System.out.println(" 1st gear");
		} else {
			 System.out.println("neutral");
		}
	}

}
