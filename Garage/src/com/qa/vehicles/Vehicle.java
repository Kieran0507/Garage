package com.qa.vehicles;

public abstract class Vehicle {
	protected int costMult;
	private int id;
	private float engineSize;
	private String paintColour;
	private String model;
	public Vehicle(int id, float engineSize, String paintColour, String model) {
		super();
		this.id = id;
		this.engineSize = engineSize;
		this.paintColour = paintColour;
		this.model = model;
	}
	
	
		
	public abstract void getBill();
		
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}
	public String getPaintColour() {
		return paintColour;
	}
	public void setPaintColour(String paintColour) {
		this.paintColour = paintColour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", engineSize=" + engineSize + ", paintColour=" + paintColour + ", model=" + model
				+ "]";
	}
	
	
	

	

}
