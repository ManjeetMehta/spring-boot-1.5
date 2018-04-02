package com.sp.mehta.applications.common.vo;

import java.util.Date;

public class GeoLocationVo {

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
	
	
	public GeoLocationVo() {
		super();
	}


	public GeoLocationVo(Integer id, String country, String state, String city, String zip, String area, String street,
			String branch, Date created, Long createdBy, Date lastModified, Long lastModifiedBy, Long createdByTaskId) {
		super();
		this.id = id;
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


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public Long getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}


	public Date getLastModified() {
		return lastModified;
	}


	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}


	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}


	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}


	public Long getCreatedByTaskId() {
		return createdByTaskId;
	}


	public void setCreatedByTaskId(Long createdByTaskId) {
		this.createdByTaskId = createdByTaskId;
	}
	
	

	
}
