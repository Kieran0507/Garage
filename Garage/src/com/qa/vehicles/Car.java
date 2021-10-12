package com.qa.vehicles;

public class Car extends Vehicle{

	
	private int tyres;
	private String vehType;
	private int numDoors;
	public Car(int id, float engineSize, String paintColour, String model, int tyres, String vehType, int numDoors) {
		super(id, engineSize, paintColour, model);
		this.tyres = tyres;
		this.vehType = vehType;
		this.numDoors = numDoors;
		this.costMult = 400;
	}
	public int getTyres() {
		return tyres;
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	public String getVehType() {
		return vehType;
	}
	public void setVehType(String vehType) {
		this.vehType = vehType;
	}
	public int getNumDoors() {
		return numDoors;
	}
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	
	
	@Override
	public String toString() {
		return "Car [tyres=" + tyres + ", vehType=" + vehType + ", numDoors=" + numDoors + "]";
	}
	
	
	
	

	

}
