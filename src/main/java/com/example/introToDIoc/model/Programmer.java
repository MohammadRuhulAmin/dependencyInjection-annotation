package com.example.introToDIoc.model;

import javax.annotation.PreDestroy;

public class Programmer {
	private int id;
	private String name;
	private String language;
	private Machine machine;
	
	public Programmer() {
		super();
		System.out.println("No - arg Constructor Called (Programmer Class)");
	}
	public Programmer(int id, String name, String language ,Machine machine) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.machine = machine;
		System.out.println("All - arg Constructor Called (Programmer Class)");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Machine getMachine() {
		return machine;
	}
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Programmer Object Destroyed");
	}
}
