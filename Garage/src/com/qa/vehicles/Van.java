package com.qa.vehicles;

public class Van extends Vehicle {

	private int tyres;
	private String vehType;
	private String vanType;
	public Van(int id, float engineSize, String paintColour, String model, int tyres, String vehType, String vanType) {
		super(id, engineSize, paintColour, model);
		this.tyres = tyres;
		this.vehType = vehType;
		this.vanType = vanType;
		this.costMult = 600;
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
	public String getVanType() {
		return vanType;
	}
	public void setVanType(String vanType) {
		this.vanType = vanType;
	}
	@Override
	public String toString() {
		return "Van [tyres=" + tyres + ", vehType=" + vehType + ", vanType=" + vanType + "]";
	}
	
	

}
