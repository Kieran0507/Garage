package com.qa.runner;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Van;
import com.qa.vehicles.Vehicle;

public class Runner {

	public static void main(String[] args) {
		
		Vehicle merc = new Car(1, 2.0f, "Silver", "c220", 4, "Car", 5);
		Vehicle fiat = new Van(2, 2.0f, "White", "floop", 6, "Van","commercial");
		Vehicle kawasaki = new Motorbike(3, 1.8f, "Black", "m900", 2);
		Garage newgarage = new Garage();
		
		newgarage.addVehicle(kawasaki);
		newgarage.addVehicle(fiat);
		newgarage.addVehicle(merc);
//		newgarage.clearVehicle(Car.class);
		newgarage.costGetter();
		newgarage.clearVehicleByID(1);
		newgarage.costGetter();
	}

}
