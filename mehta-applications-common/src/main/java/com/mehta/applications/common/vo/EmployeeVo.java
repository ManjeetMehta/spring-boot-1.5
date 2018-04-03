package com.mehta.applications.common.vo;

import java.util.Date;

public class EmployeeVo {

	private Integer id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String storageForderName;
	private Date dateOfBirth;
	private Date joiningDate;
	private String nationality;
	private String email;
	private String passportNumber;
	private String residentPermit;
	private Boolean active;
	private Integer corporateId;
	private Date created;
	private Integer createdBy;
	private Date lastModified;
	private Integer lastModifiedBy;
	
	
	public EmployeeVo() {
		super();
	}


	public EmployeeVo(Integer id, String firstName, String middleName, String lastName, String storageForderName,
			Date dateOfBirth, Date joiningDate, String nationality, String email, String passportNumber,
			String residentPermit, Boolean active, Integer corporateId, Date created, Integer createdBy,
			Date lastModified, Integer lastModifiedBy) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.storageForderName = storageForderName;
		this.dateOfBirth = dateOfBirth;
		this.joiningDate = joiningDate;
		this.nationality = nationality;
		this.email = email;
		this.passportNumber = passportNumber;
		this.residentPermit = residentPermit;
		this.active = active;
		this.corporateId = corporateId;
		this.created = created;
		this.createdBy = createdBy;
		this.lastModified = lastModified;
		this.lastModifiedBy = lastModifiedBy;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getStorageForderName() {
		return storageForderName;
	}


	public void setStorageForderName(String storageForderName) {
		this.storageForderName = storageForderName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassportNumber() {
		return passportNumber;
	}


	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}


	public String getResidentPermit() {
		return residentPermit;
	}


	public void setResidentPermit(String residentPermit) {
		this.residentPermit = residentPermit;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}


	public Integer getCorporateId() {
		return corporateId;
	}


	public void setCorporateId(Integer corporateId) {
		this.corporateId = corporateId;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public Integer getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}


	public Date getLastModified() {
		return lastModified;
	}


	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}


	public Integer getLastModifiedBy() {
		return lastModifiedBy;
	}


	public void setLastModifiedBy(Integer lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	
	
}
