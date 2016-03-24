package com.shop.vo;

import java.util.Date;

/**
 * Environment entity. @author MyEclipse Persistence Tools
 */

public class Environment implements java.io.Serializable {

	// Fields

	private Integer EId;
	private Store store;
	private String EPic;
	private String EType;
	private long EPrice;
	private String EComment;
	private Date EBeginTime;
	private Date EEndTime;
	private String EHimg;
	private String EScore;
	private boolean EIsTop;

	// Constructors

	/** default constructor */
	public Environment() {
	}

	/** full constructor */
	public Environment(Store store, String EPic, String EType, long EPrice,
			String EComment, Date EBeginTime, Date EEndTime, String EHimg,
			String EScore, boolean EIsTop) {
		this.store = store;
		this.EPic = EPic;
		this.EType = EType;
		this.EPrice = EPrice;
		this.EComment = EComment;
		this.EBeginTime = EBeginTime;
		this.EEndTime = EEndTime;
		this.EHimg = EHimg;
		this.EScore = EScore;
		this.EIsTop = EIsTop;
	}

	// Property accessors

	public Integer getEId() {
		return this.EId;
	}

	public void setEId(Integer EId) {
		this.EId = EId;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getEPic() {
		return this.EPic;
	}

	public void setEPic(String EPic) {
		this.EPic = EPic;
	}

	public String getEType() {
		return this.EType;
	}

	public void setEType(String EType) {
		this.EType = EType;
	}

	public long getEPrice() {
		return this.EPrice;
	}

	public void setEPrice(long EPrice) {
		this.EPrice = EPrice;
	}

	public String getEComment() {
		return this.EComment;
	}

	public void setEComment(String EComment) {
		this.EComment = EComment;
	}

	public Date getEBeginTime() {
		return this.EBeginTime;
	}

	public void setEBeginTime(Date EBeginTime) {
		this.EBeginTime = EBeginTime;
	}

	public Date getEEndTime() {
		return this.EEndTime;
	}

	public void setEEndTime(Date EEndTime) {
		this.EEndTime = EEndTime;
	}

	public String getEHimg() {
		return this.EHimg;
	}

	public void setEHimg(String EHimg) {
		this.EHimg = EHimg;
	}

	public String getEScore() {
		return this.EScore;
	}

	public void setEScore(String EScore) {
		this.EScore = EScore;
	}

	public boolean getEIsTop() {
		return this.EIsTop;
	}

	public void setEIsTop(boolean EIsTop) {
		this.EIsTop = EIsTop;
	}

}