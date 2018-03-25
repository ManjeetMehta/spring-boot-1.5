package com.sp.mehta.applications.common.vo;

import java.util.Date;

public class EmployeeVo {

	private Integer id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String storage_forder_name;
	private Date date_of_birth;
	private Date joining_date;
	private String nationality;
	private String email;
	private String passport_number;
	private String resident_permit;
	private Boolean active;
	private Integer corporate_id;
	private Date created;
	private Integer created_by;
	private Date last_modified;
	private Integer last_modified_by;
	
	
	public EmployeeVo() {
		super();
	}


	public EmployeeVo(Integer id, String first_name, String middle_name, String last_name, String storage_forder_name,
			Date date_of_birth, Date joining_date, String nationality, String email, String passport_number,
			String resident_permit, Boolean active, Integer corporate_id, Date created, Integer created_by,
			Date last_modified, Integer last_modified_by) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.storage_forder_name = storage_forder_name;
		this.date_of_birth = date_of_birth;
		this.joining_date = joining_date;
		this.nationality = nationality;
		this.email = email;
		this.passport_number = passport_number;
		this.resident_permit = resident_permit;
		this.active = active;
		this.corporate_id = corporate_id;
		this.created = created;
		this.created_by = created_by;
		this.last_modified = last_modified;
		this.last_modified_by = last_modified_by;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getMiddle_name() {
		return middle_name;
	}


	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getStorage_forder_name() {
		return storage_forder_name;
	}


	public void setStorage_forder_name(String storage_forder_name) {
		this.storage_forder_name = storage_forder_name;
	}


	public Date getDate_of_birth() {
		return date_of_birth;
	}


	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}


	public Date getJoining_date() {
		return joining_date;
	}


	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
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


	public String getPassport_number() {
		return passport_number;
	}


	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}


	public String getResident_permit() {
		return resident_permit;
	}


	public void setResident_permit(String resident_permit) {
		this.resident_permit = resident_permit;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}


	public Integer getCorporate_id() {
		return corporate_id;
	}


	public void setCorporate_id(Integer corporate_id) {
		this.corporate_id = corporate_id;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public Integer getCreated_by() {
		return created_by;
	}


	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}


	public Date getLast_modified() {
		return last_modified;
	}


	public void setLast_modified(Date last_modified) {
		this.last_modified = last_modified;
	}


	public Integer getLast_modified_by() {
		return last_modified_by;
	}


	public void setLast_modified_by(Integer last_modified_by) {
		this.last_modified_by = last_modified_by;
	}
	
	
	
	
}
