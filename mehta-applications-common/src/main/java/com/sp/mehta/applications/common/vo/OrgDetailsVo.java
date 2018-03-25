package com.sp.mehta.applications.common.vo;

public class OrgDetailsVo {

	private Integer id;
	private String name;
	private String Country;
	private Boolean active;
	private String city;
	private String state;
	private Integer pincode;
	private String userName;
	private String password;
	private String email;

	public OrgDetailsVo() {
		super();
	}

	public OrgDetailsVo(String name, String country, Boolean active, String city, String state, Integer pincode,
			String userName, String password, String email) {
		super();
		this.name = name;
		Country = country;
		this.active = active;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
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


}
