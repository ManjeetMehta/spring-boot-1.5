package com.mehta.applications.common.vo;

import java.util.Date;

public class StudentVo {

	private Integer sid;
	private String name;
	private String gender;
	private Date dob;
	private String address;
	private String mobile;
	
	
	public StudentVo() {
		super();
	}

	public StudentVo(Integer sid) {
		super();
		this.sid = sid;
	}

	public StudentVo(String name, String gender, Date dob, String address, String mobile) {
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.mobile = mobile;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
