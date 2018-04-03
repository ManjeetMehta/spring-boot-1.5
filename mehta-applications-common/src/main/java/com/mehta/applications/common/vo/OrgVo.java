package com.mehta.applications.common.vo;

import java.io.Serializable;



public class OrgVo implements Serializable {
	private Integer id;
	private String name;
	private String country;
	private boolean active;
	AddressVo addressVo;
	
	public OrgVo()
	{
		super();
	}
	
	public OrgVo(Integer id, String name, String country, boolean active, AddressVo addressVo) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.active = active;
		this.setAddressVo(addressVo);
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
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public AddressVo getAddressVo() {
		return addressVo;
	}

	public void setAddressVo(AddressVo addressVo) {
		this.addressVo = addressVo;
	}
	
}
