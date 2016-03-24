package com.shop.vo;

/**
 * Pic entity. @author MyEclipse Persistence Tools
 */

public class Pic implements java.io.Serializable {

	// Fields

	private Integer PId;
	private String PUrl;
	private String PType;
	private Integer PTheId;

	// Constructors

	/** default constructor */
	public Pic() {
	}

	/** full constructor */
	public Pic(String PUrl, String PType, Integer PTheId) {
		this.PUrl = PUrl;
		this.PType = PType;
		this.PTheId = PTheId;
	}

	// Property accessors

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
	}

	public String getPUrl() {
		return this.PUrl;
	}

	public void setPUrl(String PUrl) {
		this.PUrl = PUrl;
	}

	public String getPType() {
		return this.PType;
	}

	public void setPType(String PType) {
		this.PType = PType;
	}

	public Integer getPTheId() {
		return this.PTheId;
	}

	public void setPTheId(Integer PTheId) {
		this.PTheId = PTheId;
	}

}