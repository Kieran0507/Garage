package com.qa.runner;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Van;
import com.qa.vehicles.Vehicle;

public class Runner {

	public static void main(String[] args) {
		
		Vehicle merc = new Car(1, 2.0f, "Silver", "c220", 4, "Car", 5);
		Vehicle fiat = new Van(2, 2.0f, "White", "floop", 6, "Van","commercial");
		Garage newgarage = new Garage();
		
		newgarage.addVehicle(fiat);
		newgarage.addVehicle(merc);
		newgarage.clearVehicle(Car.class);
		newgarage.costGetter();
//		newgarage.clearVehicleByID(1);
//		newgarage.costGetter();
	}

}
