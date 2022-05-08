package com.example.introToDIoc.model;

import javax.annotation.PreDestroy;

public class Mobile {
	private int mobileId;
	private String mobileBrand;
	private String mobileNo;
	
	public Mobile() {
		System.out.println("No Arg - called from Mobile Class");
	}

	public Mobile(int mobileId, String mobileBrand, String mobileNo) {
		super();
		this.mobileId = mobileId;
		this.mobileBrand = mobileBrand;
		this.mobileNo = mobileNo;
		System.out.println("Arg- called From Mobile Class");
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@PreDestroy
	public void destroyed() {
		System.out.println("Mobile Object Destroyed");
	}
}
