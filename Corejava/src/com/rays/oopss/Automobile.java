package com.rays.oopss;

public class Automobile {
	private String color;
	private int speed;
	private String make;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void brake(int speed) {
		if (speed > 10) {
			System.out.println("this car is breaking");
		} else {
			System.out.println("car is not breaking");
		}
	}

	/*
	 * public void changeGear(int speed) {
	 * 
	 * 
	 * }
	 */
	public void accelerator(int speed) {
		if (speed > 0) {
			System.out.println("car is accelerate");

		} else {
			System.out.println("car is not accelerating");
		}
	}

}
