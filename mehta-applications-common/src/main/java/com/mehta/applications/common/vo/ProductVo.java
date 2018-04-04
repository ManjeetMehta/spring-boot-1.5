package com.mehta.applications.common.vo;

import java.io.Serializable;

public class ProductVo implements Serializable {
	private static final long serialVersionUID = -5735134631585340052L;
	private Integer id;
    private String name;
    private String description;
    private String price;
    private boolean active;
    private String type;
    OrgVo orgVo;
    
    
	public ProductVo() {
		super();
	}
	public ProductVo(Integer id, String name, String description, String price, boolean active, String type, OrgVo orgVo) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.active = active;
		this.type = type;
		this.orgVo = orgVo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public OrgVo getOrgVo() {
		return orgVo;
	}
	public void setOrgVo(OrgVo orgVo) {
		this.orgVo = orgVo;
	}
    
    

}
