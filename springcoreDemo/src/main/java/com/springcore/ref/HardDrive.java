package com.springcore.ref;

public class HardDrive {
	private String hardDrive1;
	private String hardDrive2;
	
	public HardDrive() {
		super();
		
	}
	
	public HardDrive(String hardDrive1, String hardDrive2) {
		super();
		this.hardDrive1 = hardDrive1;
		this.hardDrive2 = hardDrive2;
	}

	public String getHardDrive1() {
		return hardDrive1;
	}
	public void setHardDrive1(String hardDrive1) {
		this.hardDrive1 = hardDrive1;
	}
	public String getHardDrive2() {
		return hardDrive2;
	}
	
	public void setHardDrive2(String hardDrive2) {
		this.hardDrive2 = hardDrive2;
	}
	
	@Override
	public String toString() {
		return "HardDrive [hardDrive1=" + hardDrive1 + ", hardDrive2=" + hardDrive2 + "]";
	}
	
	
}
