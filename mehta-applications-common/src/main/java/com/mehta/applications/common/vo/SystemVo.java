package com.mehta.applications.common.vo;

import java.util.Date;

public class SystemVo {
	private Integer id;	
	private String storageFolderName;
	private Date created;		
	private Long createdBy;			
	private Date lastModified;
	private Long lastModifiedBy;
	
	
	public SystemVo() {
		super();
	}


	public SystemVo(Integer id, String storageFolderName, Date created, Long createdBy, Date lastModified,
			Long lastModifiedBy) {
		super();
		this.id = id;
		this.storageFolderName = storageFolderName;
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


	public String getStorageFolderName() {
		return storageFolderName;
	}


	public void setStorageFolderName(String storageFolderName) {
		this.storageFolderName = storageFolderName;
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
	
	
	
}
