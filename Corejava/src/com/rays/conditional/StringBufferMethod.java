package com.rays.conditional;

public class StringBufferMethod {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("sourabh");
	sb.append("singh rajput");
	System.out.println("length = "+ sb.length());
	System.out.println("capacity= " + sb.capacity());
	System.out.println("char at = " + sb.charAt(4));
	System.out.println("index of = " + sb.indexOf("u"));
	System.out.println("replace = "+ sb.replace(2, 5, "sourabh"));
	System.out.println("reverse = "+ sb.reverse());
}
}
