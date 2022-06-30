package com.qa.garage;

public class Van extends Vehicle {
	static float bootSize;
	boolean threeFrontSeats;
	boolean slideyDoor;

	public Van(int wheels, boolean hasDoors, float engineSize, String colour, String manufacturer, float bootSize,
			boolean threeFrontSeats, boolean slideyDoor) {
		super(wheels, hasDoors, engineSize, colour, manufacturer);
	}

	public static float getBootSize() {
		return bootSize;
	}

	public void setBootSize(float bootSize) {
		Van.bootSize = bootSize;
	}

	public boolean isThreeFrontSeats() {
		return threeFrontSeats;
	}

	public void setThreeFrontSeats(boolean threeFrontSeats) {
		this.threeFrontSeats = threeFrontSeats;
	}

	public boolean isSlideyDoor() {
		return slideyDoor;
	}

	public void setSlideyDoor(boolean slideyDoor) {
		this.slideyDoor = slideyDoor;
	}

}
