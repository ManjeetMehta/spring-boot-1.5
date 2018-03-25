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
@Table(name= "product")
public class Product 
{
	private int id;
    private String name;
    private String description;
    private String price;
    private boolean active;
    private String type;
    private Org org;
    
    public Product() {
		super();
	}

	public Product(int id, String name, String description, String price, boolean active, String type, Org org) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.active = active;
		this.type = type;
		this.org = org;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id", nullable= false, length=11, unique= true)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="name", length=45)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name= "description", length= 45)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name= "price")
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Column(name= "active", length=1)
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name="type", length= 45)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name= "org_fk", nullable= false)
	public Org getOrg() {
		return org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}
    
}
