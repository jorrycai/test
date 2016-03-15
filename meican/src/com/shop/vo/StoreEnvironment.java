package com.shop.vo;

/**
 * StoreEnvironment entity. @author MyEclipse Persistence Tools
 */

public class StoreEnvironment implements java.io.Serializable {

	// Fields

	private Integer EId;
	private Integer SId;

	// Constructors

	/** default constructor */
	public StoreEnvironment() {
	}

	/** full constructor */
	public StoreEnvironment(Integer SId) {
		this.SId = SId;
	}

	// Property accessors

	public Integer getEId() {
		return this.EId;
	}

	public void setEId(Integer EId) {
		this.EId = EId;
	}

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

}