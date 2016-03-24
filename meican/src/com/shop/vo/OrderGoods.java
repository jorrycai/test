package com.shop.vo;

/**
 * OrderGoods entity. @author MyEclipse Persistence Tools
 */

public class OrderGoods implements java.io.Serializable {

	// Fields

	private Integer OGId;
	private Integer OId;
	private Integer GId;
	private String GType;
	private Integer GCount;

	// Constructors

	/** default constructor */
	public OrderGoods() {
	}

	/** full constructor */
	public OrderGoods(Integer OId, Integer GId, String GType, Integer GCount) {
		this.OId = OId;
		this.GId = GId;
		this.GType = GType;
		this.GCount = GCount;
	}

	// Property accessors

	public Integer getOGId() {
		return this.OGId;
	}

	public void setOGId(Integer OGId) {
		this.OGId = OGId;
	}

	public Integer getOId() {
		return this.OId;
	}

	public void setOId(Integer OId) {
		this.OId = OId;
	}

	public Integer getGId() {
		return this.GId;
	}

	public void setGId(Integer GId) {
		this.GId = GId;
	}

	public String getGType() {
		return this.GType;
	}

	public void setGType(String GType) {
		this.GType = GType;
	}

	public Integer getGCount() {
		return this.GCount;
	}

	public void setGCount(Integer GCount) {
		this.GCount = GCount;
	}

}