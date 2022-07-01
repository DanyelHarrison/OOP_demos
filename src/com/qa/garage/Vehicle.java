package com.qa.garage;

public abstract class Vehicle {

	private int wheels;
	private boolean hasDoors;
	private float engineSize;
	private String colour;
	private String manufacturer;
	private int id = 1;
	private static int count;

	public Vehicle(int wheels, boolean hasDoors, float engineSize, String colour, String manufacturer) {
		super();
		this.wheels = wheels;
		this.hasDoors = hasDoors;
		this.engineSize = engineSize;
		this.colour = colour;
		this.manufacturer = manufacturer;
		id = count;
		count++;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public boolean isHasDoors() {
		return hasDoors;
	}

	public void setHasDoors(boolean hasDoors) {
		this.hasDoors = hasDoors;
	}

	public float getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicle.count = count;
	}

}
