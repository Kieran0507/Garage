package com.qa.garage;

import java.util.ArrayList;

import com.qa.vehicles.Car;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Van;
import com.qa.vehicles.Vehicle;

public class Garage {

	public static ArrayList<Vehicle> garage = new ArrayList<>();

	public void addVehicle(Vehicle veh) {
		garage.add(0, veh);
	}

	public void costGetter() {
		for (int i = 0; i < garage.size(); i++) {
			Vehicle vehicle = garage.get(i);
			if (vehicle instanceof Car) {
				System.out.println(vehicle.getEngineSize() * 400);

			} else if (vehicle instanceof Van) {
				System.out.println(vehicle.getEngineSize() * 600);

			} else if (vehicle instanceof Motorbike) {
				System.out.println(vehicle.getEngineSize() * 150);
			} else {
				System.out.println("Unknown vehicle type");
			}
		}
	}

	public void clearCars() {
		for (int i = 0; i < garage.size(); i++) {
			Vehicle vehicle = garage.get(i);
			if (vehicle instanceof Car) {
				garage.remove(i);
			}
		}
	}

	public void clearVans() {
		for (int i = 0; i < garage.size(); i++) {
			Vehicle vehicle = garage.get(i);
			if (vehicle instanceof Van) {
				garage.remove(i);
			}
		}
	}

	public void clearBikes() {
		for (int i = 0; i < garage.size(); i++) {
			Vehicle vehicle = garage.get(i);
			if (vehicle instanceof Motorbike) {
				garage.remove(i);
			}
		}
	}
// Not my code Removes 2 methods
//	public <T> void clearVehicle(Class<T> vehicleType) {
//        for(int i = 0; i < garage.size(); i++){
//        	if (garage.get(i).getClass() .equals  (vehicleType)){
//        		garage.remove(i);
//        }
//    }
//}
	
	
	
	
	
	
	public void clearVehicleByID(int id) {
		for (int i = 0; i < garage.size(); i++) {
			if (garage.get(i).getId() == id) {
				garage.remove(i);
				break;
			}
		}
	}

	public void getBill(int id) {
		for (int i = 0; i < garage.size(); i++) {
			if (garage.get(i).getId() == id) {
				Vehicle vehicle = garage.get(i);
				if (vehicle instanceof Car) {
					System.out.println(vehicle.getEngineSize() * 400);

				} else if (vehicle instanceof Van) {
					System.out.println(vehicle.getEngineSize() * 600);

				} else if (vehicle instanceof Motorbike) {
					System.out.println(vehicle.getEngineSize() * 150);
				} else {
					System.out.println("Unknown vehicle type");
				}
			}
				
			}
		}
	public void clearGarage() {
		garage.clear();
	}
	}


