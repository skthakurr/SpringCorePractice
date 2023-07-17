package com.springcore.stereotype.annotation;

public class Truck {
	private int wheels;
	private String model;
	private String color;
	
	
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Truck [wheels=" + wheels + ", model=" + model + ", color=" + color + "]";
	}
	
	
	
	
}
