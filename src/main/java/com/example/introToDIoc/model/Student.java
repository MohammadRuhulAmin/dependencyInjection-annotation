package com.example.introToDIoc.model;

import javax.annotation.PreDestroy;

public class Student {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private double studentCgpa;
	private Mobile mobile;
	
	public Student() {
		System.out.println("No - arg called from Student class");
	}

	public Student(int studentId, String studentName, 
			String studentEmail, double studentCgpa,Mobile mobile) {
		super();
		this.mobile = mobile;
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentCgpa = studentCgpa;
		System.out.println("Arg - called From Student Class");
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public double getStudentCgpa() {
		return studentCgpa;
	}
	
	public void setStudentCgpa(double studentCgpa) {
		this.studentCgpa = studentCgpa;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Student Object Destroyed");
	}
	
}
