package com.mehta.applications.common.vo;

import java.util.Date;

public class PolicyVo {

	
	private Integer id;
	private String policyNumber;
	private Date policyIssueDate;
	private Date policyEffectiveDate;
	private Date policyExpiryDate;
	private String storageFolderName;
	private String policyStatus;
	private Double policyValue;
	/*private Date policyCreated;
	private Integer policyCreatedBy;
	private Date lastModified;
	private Integer lastModifiedBy;*/

	
	public PolicyVo() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPolicyNumber() {
		return policyNumber;
	}


	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}


	public Date getPolicyIssueDate() {
		return policyIssueDate;
	}


	public void setPolicyIssueDate(Date policyIssueDate) {
		this.policyIssueDate = policyIssueDate;
	}


	public Date getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}


	public void setPolicyEffectiveDate(Date policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}


	public Date getPolicyExpiryDate() {
		return policyExpiryDate;
	}


	public void setPolicyExpiryDate(Date policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}


	public String getStorageFolderName() {
		return storageFolderName;
	}


	public void setStorageFolderName(String storageFolderName) {
		this.storageFolderName = storageFolderName;
	}


	public String getPolicyStatus() {
		return policyStatus;
	}


	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}


	public Double getPolicyValue() {
		return policyValue;
	}


	public void setPolicyValue(Double policyValue) {
		this.policyValue = policyValue;
	}


}
