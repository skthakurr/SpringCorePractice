package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Phone {
	private String model;
	private double price;
	public Phone() {
		super();
	}
	public Phone(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		System.out.println("Setting model..");
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("Setting price..");
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [model=" + model + ", price=" + price + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Init method using annotation : Phone");
	}
	@PreDestroy
	public void end() {
		System.out.println("destroy method using annotation : Phone");
	}
	
}
