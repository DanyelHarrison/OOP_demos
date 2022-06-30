package com.qa.garage;

public class Motorbike extends Vehicle {
	boolean hasSideCar;
	String purpose;
	static int numOfCylidners;

	public Motorbike(int wheels, boolean hasDoors, float engineSize, String colour, String manufacturer,
			boolean hasSideCar, String pupose, int numOfCyclinders) {
		super(wheels, hasDoors, engineSize, colour, manufacturer);
	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public static int getNumOfCylidners() {
		return numOfCylidners;
	}

	public void setNumOfCylidners(int numOfCylidners) {
		Motorbike.numOfCylidners = numOfCylidners;
	}

}
