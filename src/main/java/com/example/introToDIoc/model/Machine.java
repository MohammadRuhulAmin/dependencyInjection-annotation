package com.example.introToDIoc.model;

import javax.annotation.PreDestroy;

public class Machine {
	private String brand;
	
	public String getBrand() {
		return brand;
	}
	
	public Machine() {
		super();
		System.out.println("No - arg Constructor Called (Machine Class)");
	}
	
	public Machine(String brand) {
		super();
		this.brand = brand;
		System.out.println("All - arg Constructor Called (Machine Class)");
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Machine Object Destroyed");
	}
	
}
