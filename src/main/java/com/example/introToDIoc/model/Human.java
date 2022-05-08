package com.example.introToDIoc.model;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component // means it is a bean class
@Scope("prototype") // it is not singleton it creates multiple object
//Scope("singleton") // it creates only one object
public class Human {
	
	@Autowired
	Dog dog;
	public Human() {
		System.out.println("Human Object Created");
	}
	
	public void petInfo() {
		dog.petInfo();
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("Human Object Has been destroyed");
	}
}
