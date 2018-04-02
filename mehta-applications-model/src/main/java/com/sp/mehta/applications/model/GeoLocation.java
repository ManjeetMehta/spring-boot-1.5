package com.sp.mehta.applications.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "geo_location")
public class GeoLocation {

	private Integer id;
	private String country;
	private String state;
	private String city;
	private String zip;
	private String area;
	private String street;
	private String branch;
	private Date created;
	private Long createdBy;
	private Date lastModified;
	private Long lastModifiedBy;
	private Long createdByTaskId;
	
	public GeoLocation() {
		super();
	}



	
	public GeoLocation(String country, String state, String city, String zip, String area, String street, String branch,
			Date created, Long createdBy, Date lastModified, Long lastModifiedBy, Long createdByTaskId) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.area = area;
		this.street = street;
		this.branch = branch;
		this.created = created;
		this.createdBy = createdBy;
		this.lastModified = lastModified;
		this.lastModifiedBy = lastModifiedBy;
		this.createdByTaskId = createdByTaskId;
	}




	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	@Column(name= "country", length= 45)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	@Column(name= "state", length=45)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	@Column(name= "city", length=45)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	@Column(name= "zip")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	
	@Column(name="area")
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	
	@Column(name="street")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	
	@Column(name= "branch")
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	@Column(name= "created")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	
	@Column(name= "created_by")
	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	
	@Column(name= "last_modified")
	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastMdified) {
		this.lastModified = lastMdified;
	}

	@Column(name= "last_modified_by")
	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}




	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}



	

	
	@Column(name= "created_by_task_id")
	public Long getCreatedByTaskId() {
		return createdByTaskId;
	}





	public void setCreatedByTaskId(Long createdByTaskId) {
		this.createdByTaskId = createdByTaskId;
	}
	
	
	
	
}
