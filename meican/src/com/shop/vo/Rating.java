package com.shop.vo;

import java.util.Date;

/**
 * Rating entity. @author MyEclipse Persistence Tools
 */

public class Rating implements java.io.Serializable {

	// Fields

	private Integer RId;
	private String RComment;
	private String RPic;
	private String RScore;
	private Date RTime;
	private String RStatus;

	// Constructors

	/** default constructor */
	public Rating() {
	}

	/** full constructor */
	public Rating(String RComment, String RPic, String RScore, Date RTime,
			String RStatus) {
		this.RComment = RComment;
		this.RPic = RPic;
		this.RScore = RScore;
		this.RTime = RTime;
		this.RStatus = RStatus;
	}

	// Property accessors

	public Integer getRId() {
		return this.RId;
	}

	public void setRId(Integer RId) {
		this.RId = RId;
	}

	public String getRComment() {
		return this.RComment;
	}

	public void setRComment(String RComment) {
		this.RComment = RComment;
	}

	public String getRPic() {
		return this.RPic;
	}

	public void setRPic(String RPic) {
		this.RPic = RPic;
	}

	public String getRScore() {
		return this.RScore;
	}

	public void setRScore(String RScore) {
		this.RScore = RScore;
	}

	public Date getRTime() {
		return this.RTime;
	}

	public void setRTime(Date RTime) {
		this.RTime = RTime;
	}

	public String getRStatus() {
		return this.RStatus;
	}

	public void setRStatus(String RStatus) {
		this.RStatus = RStatus;
	}

}