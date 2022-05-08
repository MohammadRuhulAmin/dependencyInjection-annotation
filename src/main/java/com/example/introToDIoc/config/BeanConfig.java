package com.example.introToDIoc.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.introToDIoc.model.Machine;
import com.example.introToDIoc.model.Mobile;
import com.example.introToDIoc.model.Programmer;
import com.example.introToDIoc.model.Student;

/*
 * java based setter injection Example
 * 
 * */

@Configuration
public class BeanConfig {
	@Bean
	public Programmer programmer(@Qualifier("machine") Machine machine) {
		Programmer programmer = new Programmer();
		programmer.setId(1121);
		programmer.setName("Md Ruhul Amin");
		programmer.setLanguage("Spring Boot ");
		
		programmer.setMachine(machine);
		return programmer;
	}
	@Bean
	public Machine machine() {
		Machine machine = new Machine();
		machine.setBrand("Samsung");
		return machine;
	}
	@Bean
	public Mobile mobile() {
		Mobile mobile = new Mobile();
		mobile.setMobileId(112);
		mobile.setMobileBrand("Samsung");
		mobile.setMobileNo("01322352864");
		return mobile;
	}
	@Bean
	public Student student(@Qualifier("mobile") Mobile mobile) {
		Student student = new Student();
		student.setMobile(mobile);
		student.setStudentCgpa(3.44);
		student.setStudentEmail("ruhul@gmail.com");
		student.setStudentName("Md Ruhul Amin");
		student.setStudentId(1121);
		return student;
	}
	
	
	
}
