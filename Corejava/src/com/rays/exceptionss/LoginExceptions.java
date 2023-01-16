package com.rays.exceptionss;

public class LoginExceptions extends Exception  {
	
   public LoginExceptions() {
	   super("java");
   }
   public static void main(String[] args) {
	 LoginExceptions e = new LoginExceptions();
	 
	int val = 0;
	 if (val<1) {
		System.out.println("value is less than one");
		
	}  /*else {
		System.out.println("greater than 1");
	}*/
	 
	 }
}
