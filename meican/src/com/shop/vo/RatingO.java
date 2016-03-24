package com.shop.vo;

/**
 * RatingO entity. @author MyEclipse Persistence Tools
 */

public class RatingO implements java.io.Serializable {

	// Fields

	private Integer RSId;
	private Integer SId;
	private Integer UId;
	private Integer RId;
	private String SType;
	private Integer OId;
	private Integer EId;

	// Constructors

	/** default constructor */
	public RatingO() {
	}

	/** full constructor */
	public RatingO(Integer SId, Integer UId, Integer RId, String SType,
			Integer OId, Integer EId) {
		this.SId = SId;
		this.UId = UId;
		this.RId = RId;
		this.SType = SType;
		this.OId = OId;
		this.EId = EId;
	}

	// Property accessors

	public Integer getRSId() {
		return this.RSId;
	}

	public void setRSId(Integer RSId) {
		this.RSId = RSId;
	}

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public Integer getRId() {
		return this.RId;
	}

	public void setRId(Integer RId) {
		this.RId = RId;
	}

	public String getSType() {
		return this.SType;
	}

	public void setSType(String SType) {
		this.SType = SType;
	}

	public Integer getOId() {
		return this.OId;
	}

	public void setOId(Integer OId) {
		this.OId = OId;
	}

	public Integer getEId() {
		return this.EId;
	}

	public void setEId(Integer EId) {
		this.EId = EId;
	}

}