package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{20+40}")
	 private int x;
	
	@Value("#{20>14?10:20}")
	 private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(45) }")
	private double sqrt;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	@Value("#{ new java.lang.String('Saroj Kumar Thakur') }")
	private String name;
	
	@Value("#{ 10<5 }")
	private boolean isActive; 
	
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public double getSqrt() {
		return sqrt;
	}
	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", sqrt=" + sqrt + ", pi=" + pi + ", name=" + name + ", isActive="
				+ isActive + "]";
	}
	 
}
