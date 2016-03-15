package com.shop.vo;

import java.util.Date;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer oid;
	private Integer state;
	private Integer UId;
	private Date orderTime;
	private String remark;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** full constructor */
	public Order(Integer state, Integer UId, Date orderTime, String remark) {
		this.state = state;
		this.UId = UId;
		this.orderTime = orderTime;
		this.remark = remark;
	}

	// Property accessors

	public Integer getOid() {
		return this.oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}