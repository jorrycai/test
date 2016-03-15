package com.shop.vo;

/**
 * OrderMenu entity. @author MyEclipse Persistence Tools
 */

public class OrderMenu implements java.io.Serializable {

	// Fields

	private Integer OId;
	private Integer MId;
	private Integer number;

	// Constructors

	/** default constructor */
	public OrderMenu() {
	}

	/** full constructor */
	public OrderMenu(Integer MId, Integer number) {
		this.MId = MId;
		this.number = number;
	}

	// Property accessors

	public Integer getOId() {
		return this.OId;
	}

	public void setOId(Integer OId) {
		this.OId = OId;
	}

	public Integer getMId() {
		return this.MId;
	}

	public void setMId(Integer MId) {
		this.MId = MId;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}