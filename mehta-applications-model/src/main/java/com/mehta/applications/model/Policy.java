package com.mehta.applications.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "policy")
public class Policy {
	private Integer id;
	private String policyNumber;
	private Date policyIssueDate;
	private Date policyEffectiveDate;
	private Date policyExpiryDate;
	private String storageFolderName;
	private String policyStatus;
	private Double policyValue;
	
	public Policy() {
		super();
	}


	@Id
	@Column(name= "id", nullable = false, length= 11, unique= true)
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Column(name= "policy_number")
	public String getPolicyNumber() {
		return policyNumber;
	}


	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}


	@Column(name= "policy_issue_date")
	public Date getPolicyIssueDate() {
		return policyIssueDate;
	}


	public void setPolicyIssueDate(Date policyIssueDate) {
		this.policyIssueDate = policyIssueDate;
	}


	@Column(name= "policy_effective_date")
	public Date getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}


	public void setPolicyEffectiveDate(Date policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}


	@Column(name= "policy_expiry_date")
	public Date getPolicyExpiryDate() {
		return policyExpiryDate;
	}


	public void setPolicyExpiryDate(Date policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}


	@Column(name= "storage_folder_name")
	public String getStorageFolderName() {
		return storageFolderName;
	}


	public void setStorageFolderName(String storageFolderName) {
		this.storageFolderName = storageFolderName;
	}


	@Column(name = "policy_status")
	public String getPolicyStatus() {
		return policyStatus;
	}


	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}


	@Column(name= "policy_value")
	public Double getPolicyValue() {
		return policyValue;
	}


	public void setPolicyValue(Double policyValue) {
		this.policyValue = policyValue;
	}


	/*@Column(name= "policy_created")
	public Date getPolicyCreated() {
		return policyCreated;
	}


	public void setPolicyCreated(Date policyCreated) {
		this.policyCreated = policyCreated;
	}


	@Column(name= "policy_created_by")
	public Integer getPolicyCreatedBy() {
		return policyCreatedBy;
	}


	public void setPolicyCreatedBy(Integer policyCreatedBy) {
		this.policyCreatedBy = policyCreatedBy;
	}


	@Column(name= "last_modified")
	public Date getLastModified() {
		return lastModified;
	}


	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}


	@Column(name= "last_modified_by")
	public Integer getLastModifiedBy() {
		return lastModifiedBy;
	}


	public void setLastModifiedBy(Integer lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
*/
	
}
