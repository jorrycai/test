package com.shop.vo;

import java.util.Date;

/**
 * Pay entity. @author MyEclipse Persistence Tools
 */

public class Pay implements java.io.Serializable {

	// Fields

	private Integer payId;
	private User user;
	private Date payTime;
	private String payStatus;
	private String payMethod;
	private String payMoneyCount;

	// Constructors

	/** default constructor */
	public Pay() {
	}

	/** full constructor */
	public Pay(User user, Date payTime, String payStatus, String payMethod,
			String payMoneyCount) {
		this.user = user;
		this.payTime = payTime;
		this.payStatus = payStatus;
		this.payMethod = payMethod;
		this.payMoneyCount = payMoneyCount;
	}

	// Property accessors

	public Integer getPayId() {
		return this.payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayMethod() {
		return this.payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getPayMoneyCount() {
		return this.payMoneyCount;
	}

	public void setPayMoneyCount(String payMoneyCount) {
		this.payMoneyCount = payMoneyCount;
	}

}