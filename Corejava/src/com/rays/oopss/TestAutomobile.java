package com.rays.oopss;

public class TestAutomobile {
public static void main(String[] args) {
	Automobile a = new Automobile();
	a.setColor("white");
	a.setMake("Hyundai");
	a.brake(20);
	a.accelerator(50);
	/*a.brake(100);
	a.changeGear(3);
	a.accelerator(200);*/
	
	System.out.println(a.getColor());
	System.out.println(a.getMake());
	System.out.println(a.getSpeed());

}
}
