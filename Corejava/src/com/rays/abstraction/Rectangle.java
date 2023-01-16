package com.rays.abstraction;


public class Rectangle extends Shape {
	private int len;
	private int wid;
	
	 public Rectangle() {
		 
	 }
	 public Rectangle(int len) {
		 this.len = len;
		
	 }
	 public Rectangle(int len, int wid) {
		 this.len = len;
		 this.wid = wid;
	 
	 }
	 public int getlen() {
		 return len;
	 }
	 public int getwid() {
		 return wid;
		 
	 }
	 public double area() {
		 double d = len*wid;
		

		 return d;
	 }
	 
	 

}
