package com.shop.vo;

import java.util.Date;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer OId;
	private String OStatus;
	private String OEatStore;
	private String OIsFood;
	private String OIsTakeOut;
	private Date OOrderTime;
	private String OEatTime;
	private Date OUseTime;
	private String OIsDayRent;
	private String OIsDiscount;
	private String OPeopleCount;
	private String OIsEnvironment;
	private String OMoneyCount;
	private String ORealMoneyCount;
	private String OUser;
	private String ORemark;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** full constructor */
	public Order(String OStatus, String OEatStore, String OIsFood,
			String OIsTakeOut, Date OOrderTime, String OEatTime, Date OUseTime,
			String OIsDayRent, String OIsDiscount, String OPeopleCount,
			String OIsEnvironment, String OMoneyCount, String ORealMoneyCount,
			String OUser, String ORemark) {
		this.OStatus = OStatus;
		this.OEatStore = OEatStore;
		this.OIsFood = OIsFood;
		this.OIsTakeOut = OIsTakeOut;
		this.OOrderTime = OOrderTime;
		this.OEatTime = OEatTime;
		this.OUseTime = OUseTime;
		this.OIsDayRent = OIsDayRent;
		this.OIsDiscount = OIsDiscount;
		this.OPeopleCount = OPeopleCount;
		this.OIsEnvironment = OIsEnvironment;
		this.OMoneyCount = OMoneyCount;
		this.ORealMoneyCount = ORealMoneyCount;
		this.OUser = OUser;
		this.ORemark = ORemark;
	}

	// Property accessors

	public Integer getOId() {
		return this.OId;
	}

	public void setOId(Integer OId) {
		this.OId = OId;
	}

	public String getOStatus() {
		return this.OStatus;
	}

	public void setOStatus(String OStatus) {
		this.OStatus = OStatus;
	}

	public String getOEatStore() {
		return this.OEatStore;
	}

	public void setOEatStore(String OEatStore) {
		this.OEatStore = OEatStore;
	}

	public String getOIsFood() {
		return this.OIsFood;
	}

	public void setOIsFood(String OIsFood) {
		this.OIsFood = OIsFood;
	}

	public String getOIsTakeOut() {
		return this.OIsTakeOut;
	}

	public void setOIsTakeOut(String OIsTakeOut) {
		this.OIsTakeOut = OIsTakeOut;
	}

	public Date getOOrderTime() {
		return this.OOrderTime;
	}

	public void setOOrderTime(Date OOrderTime) {
		this.OOrderTime = OOrderTime;
	}

	public String getOEatTime() {
		return this.OEatTime;
	}

	public void setOEatTime(String OEatTime) {
		this.OEatTime = OEatTime;
	}

	public Date getOUseTime() {
		return this.OUseTime;
	}

	public void setOUseTime(Date OUseTime) {
		this.OUseTime = OUseTime;
	}

	public String getOIsDayRent() {
		return this.OIsDayRent;
	}

	public void setOIsDayRent(String OIsDayRent) {
		this.OIsDayRent = OIsDayRent;
	}

	public String getOIsDiscount() {
		return this.OIsDiscount;
	}

	public void setOIsDiscount(String OIsDiscount) {
		this.OIsDiscount = OIsDiscount;
	}

	public String getOPeopleCount() {
		return this.OPeopleCount;
	}

	public void setOPeopleCount(String OPeopleCount) {
		this.OPeopleCount = OPeopleCount;
	}

	public String getOIsEnvironment() {
		return this.OIsEnvironment;
	}

	public void setOIsEnvironment(String OIsEnvironment) {
		this.OIsEnvironment = OIsEnvironment;
	}

	public String getOMoneyCount() {
		return this.OMoneyCount;
	}

	public void setOMoneyCount(String OMoneyCount) {
		this.OMoneyCount = OMoneyCount;
	}

	public String getORealMoneyCount() {
		return this.ORealMoneyCount;
	}

	public void setORealMoneyCount(String ORealMoneyCount) {
		this.ORealMoneyCount = ORealMoneyCount;
	}

	public String getOUser() {
		return this.OUser;
	}

	public void setOUser(String OUser) {
		this.OUser = OUser;
	}

	public String getORemark() {
		return this.ORemark;
	}

	public void setORemark(String ORemark) {
		this.ORemark = ORemark;
	}

}