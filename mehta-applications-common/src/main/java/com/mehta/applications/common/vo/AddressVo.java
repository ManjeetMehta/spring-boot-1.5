package com.mehta.applications.common.vo;

import java.io.Serializable;

public class AddressVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String city;
	private String state;
	private String country;
	private String pincode;
    private UserVo userVo;
	
	public AddressVo(Integer id) {
		super();
		this.id = id;
	}

	public AddressVo(String city, String state, String country, String pincode, UserVo uservo) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.setUserVo(userVo);
	}

	/*public AddressVo(Address address) {
		this.city=address.getCity();
		this.country=address.getCountry();
		this.pincode=address.getPincode();
		this.state=address.getState();
	}*/

	public AddressVo() {
		// TODO Auto-generated constructor stub
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

	public UserVo getUserVo() {
		return userVo;
	}

	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}

}
