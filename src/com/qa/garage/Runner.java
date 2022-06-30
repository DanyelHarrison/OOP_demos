package com.qa.garage;

public class Runner {

	public static void main(String[] args) {

		Garage garage = new Garage();

		Car c = new Car(4, true, 1.8f, "Blue", "Ford", 5, false);
		Motorbike b = new Motorbike(2, false, 2.0f, "Green", "Kawasaki", false, "Track", 6);

		garage.addVehicle(c);
		garage.addVehicle(b);

		garage.print();

		garage.calculateCost();

	}
}
