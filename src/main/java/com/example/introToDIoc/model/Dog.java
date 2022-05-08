package com.example.introToDIoc.model;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Dog {
	
	public Dog() {
		System.out.println("Dog Object Created");
	}
	public void petInfo() {
		System.out.println("This is a German Shepherd Dog");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Dog Object is destroyed");
	}
}
