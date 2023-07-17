package com.springcore.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component // by default bean name will be camelcase of class name in this case bean is car
@Component("myCar")//now bean name is myCar
@Scope("prototype")
public class Car {
	@Value("4")
	private int wheels;
	@Value("Tesla")
	private String brand;
	@Value("Electric")
	private String fuelType;
	@Value("#{color}")
	private List<String> color;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getColor() {
		return color;
	}
	public void setColor(List<String> color) {
		this.color = color;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", brand=" + brand + ", fuelType=" + fuelType + ", color=" + color + "]";
	}
	
	
}
