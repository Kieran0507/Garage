package com.qa.vehicles;

public class Motorbike extends Vehicle {

	private int tyres = 2;
	public Motorbike(int id, float engineSize, String paintColour, String model, int tyres) {
		super(id, engineSize, paintColour, model);
		this.tyres = tyres;
		this.costMult = 150;
	}
	public int getTyres() {
		return tyres;
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	@Override
	public String toString() {
		return "Motorbike [tyres=" + tyres + "]";
	}
	
	
	
	
	
	
}
