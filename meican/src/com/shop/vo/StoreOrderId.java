package com.shop.vo;

/**
 * StoreOrderId entity. @author MyEclipse Persistence Tools
 */

public class StoreOrderId implements java.io.Serializable {

	// Fields

	private Integer OId;
	private Integer SId;

	// Constructors

	/** default constructor */
	public StoreOrderId() {
	}

	/** full constructor */
	public StoreOrderId(Integer OId, Integer SId) {
		this.OId = OId;
		this.SId = SId;
	}

	// Property accessors

	public Integer getOId() {
		return this.OId;
	}

	public void setOId(Integer OId) {
		this.OId = OId;
	}

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StoreOrderId))
			return false;
		StoreOrderId castOther = (StoreOrderId) other;

		return ((this.getOId() == castOther.getOId()) || (this.getOId() != null
				&& castOther.getOId() != null && this.getOId().equals(
				castOther.getOId())))
				&& ((this.getSId() == castOther.getSId()) || (this.getSId() != null
						&& castOther.getSId() != null && this.getSId().equals(
						castOther.getSId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getOId() == null ? 0 : this.getOId().hashCode());
		result = 37 * result
				+ (getSId() == null ? 0 : this.getSId().hashCode());
		return result;
	}

}