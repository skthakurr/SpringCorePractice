package com.springcore.ref;

public class Computer {
	private String cpu;
	private HardDrive hardDrive;
	private String memory;
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public HardDrive getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer(String cpu, HardDrive hardDrive, String memory) {
		super();
		this.cpu = cpu;
		this.hardDrive = hardDrive;
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", hardDrive=" + hardDrive + ", memory=" + memory + "]";
	}
	
	
}
