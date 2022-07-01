package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	int carCost = 200;
	int vanCost = 300;
	int bikeCost = 100;
	int cost;
	int count = 0;
	private ArrayList<Vehicle> garage = new ArrayList<>();

	// method to add a specific vehicle to the arrayList
	public void addVehicle(Vehicle v) {
		this.garage.add(v);
	}

	// method to remove a selected vehicle from the arrayList
	public void removeVehicle(Vehicle v) {
		this.garage.remove(v);
	}

	// method to calculate the cost of each vehicle based on a sub-type specific
	// attribute
	public int calculateCost() {
		for (Vehicle v : garage) {
			Vehicle found = v;
			if (v instanceof Car) {
				cost = (int) (carCost * v.getEngineSize());

			} else if (v instanceof Van) {
				cost = (int) (vanCost * v.getEngineSize());

			} else if (v instanceof Motorbike) {
				cost = (int) (bikeCost * v.getEngineSize());

			} else {
				System.out.println("No Vehicle of this type exists");
			}
			System.out.println(
					found.getColour() + " " + found.getManufacturer() + " " + "will cost: £" + cost + " " + " to fix");

		}
		// returning the total cost after calculation
		return cost;

	}

	// method to remove all vehicles of a given type
	// Iterating over a clone of the array, to not break the enhanced for loop.
	public void removeVehicle(String type) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : this.garage) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(v);
			}
		}
		this.garage.removeAll(toRemove);
	}

	// methods to remove all vehicles of a specific type taking no input
	public void removeAllCars() {
		for (Vehicle v : new ArrayList<>(garage)) {
			if (v instanceof Car) {
				garage.remove(v);
			}
		}
	}

	public void removeAllVans() {
		for (Vehicle v : new ArrayList<>(garage)) {
			if (v instanceof Van) {
				garage.remove(v);
			}
		}
	}

	public void removeAllMotorBikes() {
		for (Vehicle v : new ArrayList<>(garage)) {
			if (v instanceof Motorbike) {
				garage.remove(v);
			}
		}
	}

	// method to print out all elements of the Garage
	public void print() {
		for (int i = 0; i < garage.size(); i++) {
			Vehicle found = garage.get(i);
			System.out.println(found.getColour() + " " + found.getManufacturer());
		}
	}

	// method to clear the garage by removing all vehicles held
	public void emptyGarage() {
		garage.clear();
	}
}
