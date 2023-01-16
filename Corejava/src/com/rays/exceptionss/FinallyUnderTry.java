package com.rays.exceptionss;

public class FinallyUnderTry {
	public static void main(String[] args) {
	
		try {
			String s = "java";
			System.out.println(s.charAt(5));
			
		
		}catch (StringIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("String me itne character nhi hai");
			
		}finally {
			System.out.println("singh");
			
		}try {
			int a =10, b= 0;
			int c= a/b;
			
		} 
		catch (Exception f) {
			//f.printStackTrace();
			System.out.println("zero se divide nhi hoga");
			
			
		}
	}
	}


