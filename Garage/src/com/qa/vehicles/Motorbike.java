package com.qa.vehicles;

public class Motorbike extends Vehicle {

	private int tyres = 2;
	private String vehType = "Bike";
	public Motorbike(int id, float engineSize, String paintColour, String model, int tyres, String vehType) {
		super(id, engineSize, paintColour, model);
		this.tyres = tyres;
		this.vehType = vehType;
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
	@Override
	public String toString() {
		return "Motorbike [tyres=" + tyres + ", vehType=" + vehType + "]";
	}
	
	
}
