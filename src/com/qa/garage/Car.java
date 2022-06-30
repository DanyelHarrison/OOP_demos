package com.qa.garage;

public class Car extends Vehicle {
	static int numberOfDoors;
	static boolean hasSunRoof;

	public Car(int wheels, boolean hasDoors, float engineSize, String colour, String manufacturer, int numberOfDoors,
			boolean hasSunRoof) {
		super(wheels, hasDoors, engineSize, colour, manufacturer);

	}

	public static int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		Car.numberOfDoors = numberOfDoors;
	}

	public boolean isHasSunRoof() {
		return hasSunRoof;
	}

	public void setHasSunRoof(boolean hasSunRoof) {
		Car.hasSunRoof = hasSunRoof;
	}

}
