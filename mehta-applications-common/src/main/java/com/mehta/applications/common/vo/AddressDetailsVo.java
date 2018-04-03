package com.mehta.applications.common.vo;


public class AddressDetailsVo {
	private Integer id;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String 	userName;
	private String 	password;
	private String 	email;
	private Boolean active;
	
	public AddressDetailsVo() {
		super();
	}
	
	public AddressDetailsVo(String city, String state, String country, String pincode, String userName, String password,
			String email, Boolean active) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.active = active;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	

}
