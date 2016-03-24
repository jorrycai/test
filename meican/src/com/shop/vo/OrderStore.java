package com.shop.vo;

/**
 * OrderStore entity. @author MyEclipse Persistence Tools
 */

public class OrderStore implements java.io.Serializable {

	// Fields

	private Integer OSId;
	private Integer orderId;
	private Integer SId;
	private String SType;

	// Constructors

	/** default constructor */
	public OrderStore() {
	}

	/** full constructor */
	public OrderStore(Integer orderId, Integer SId, String SType) {
		this.orderId = orderId;
		this.SId = SId;
		this.SType = SType;
	}

	// Property accessors

	public Integer getOSId() {
		return this.OSId;
	}

	public void setOSId(Integer OSId) {
		this.OSId = OSId;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public String getSType() {
		return this.SType;
	}

	public void setSType(String SType) {
		this.SType = SType;
	}

}