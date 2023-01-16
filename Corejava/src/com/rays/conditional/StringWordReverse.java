package com.rays.conditional;

public class StringWordReverse {
public static void main(String[] args) {
	
	String a = "sourabh singh rajput";
	String[] b = a.split(" ");
	for (  int i=0; i<=b.length-1; i++ ) {
	
       for(int j= b[i].length()-1 ; j>=0; j--) {
        	System.out.print(b[i].charAt(j));
        	
        }
    //    System.out.print("/t");
}
}
}
//System.out.println(name.length());
	//System.out.pr