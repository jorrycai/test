package com.shop.vo;

/**
 * Environment entity. @author MyEclipse Persistence Tools
 */

public class Environment implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String EName;

	// Constructors

	/** default constructor */
	public Environment() {
	}

	/** full constructor */
	public Environment(String EName) {
		this.EName = EName;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEName() {
		return this.EName;
	}

	public void setEName(String EName) {
		this.EName = EName;
	}

}