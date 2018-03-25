package com.sp.mehta.applications.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "org")
public class Org {
	private int id;
	private String name;
	private String country;
	private boolean active;
	private Address address;
	
	
	public Org() {
		super();
	}


	public Org(int id, String name, String country, boolean active, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.active = active;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "id", length= 11, unique = true, nullable= false)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Column(name= "name", length= 45)
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Column(name= "country", length= 45)
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name= "active", length= 1, nullable= false)
	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}

	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name= "address_fk", nullable= false)
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
