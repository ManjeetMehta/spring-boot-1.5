package com.sp.mehta.applications.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "system")
public class System {

	private Integer id;	
	private String storageFolderName;
	private Date created;		
	private Long createdBy;			
	private Date lastModified;
	private Long lastModifiedBy;
	
	public System() {
		super();
	}

	public System(String storageFolderName, Date created, Long createdBy, Date lastModified,
			Long lastModifiedBy) {
		super();
		this.storageFolderName = storageFolderName;
		this.created = created;
		this.createdBy = createdBy;
		this.lastModified = lastModified;
		this.lastModifiedBy = lastModifiedBy;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id", nullable= false, length= 11, unique=true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="storage_folder_name", length=45)
	public String getStorageFolderName() {
		return storageFolderName;
	}

	public void setStorageFolderName(String storageFolderName) {
		this.storageFolderName = storageFolderName;
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

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Column(name= "last_modified_by")
	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	
	
}
