package com.shop.vo;

import java.util.Date;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer GId;
	private String GName;
	private Integer GSid;
	private double GPrice;
	private String GDes;
	private String GPic;
	private String GHimg;
	private Integer GType;
	private String GIsTop;
	private Integer GIsDiscount;
	private Integer GIsTakeOut;
	private Date GBeginTime;
	private Date GEndTime;
	private Integer GIsSpecial;
	private String GStatus;

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** full constructor */
	public Goods(String GName, Integer GSid, double GPrice, String GDes,
			String GPic, String GHimg, Integer GType, String GIsTop,
			Integer GIsDiscount, Integer GIsTakeOut, Date GBeginTime,
			Date GEndTime, Integer GIsSpecial, String GStatus) {
		this.GName = GName;
		this.GSid = GSid;
		this.GPrice = GPrice;
		this.GDes = GDes;
		this.GPic = GPic;
		this.GHimg = GHimg;
		this.GType = GType;
		this.GIsTop = GIsTop;
		this.GIsDiscount = GIsDiscount;
		this.GIsTakeOut = GIsTakeOut;
		this.GBeginTime = GBeginTime;
		this.GEndTime = GEndTime;
		this.GIsSpecial = GIsSpecial;
		this.GStatus = GStatus;
	}

	// Property accessors

	public Integer getGId() {
		return this.GId;
	}

	public void setGId(Integer GId) {
		this.GId = GId;
	}

	public String getGName() {
		return this.GName;
	}

	public void setGName(String GName) {
		this.GName = GName;
	}

	public Integer getGSid() {
		return this.GSid;
	}

	public void setGSid(Integer GSid) {
		this.GSid = GSid;
	}

	public double getGPrice() {
		return this.GPrice;
	}

	public void setGPrice(double GPrice) {
		this.GPrice = GPrice;
	}

	public String getGDes() {
		return this.GDes;
	}

	public void setGDes(String GDes) {
		this.GDes = GDes;
	}

	public String getGPic() {
		return this.GPic;
	}

	public void setGPic(String GPic) {
		this.GPic = GPic;
	}

	public String getGHimg() {
		return this.GHimg;
	}

	public void setGHimg(String GHimg) {
		this.GHimg = GHimg;
	}

	public Integer getGType() {
		return this.GType;
	}

	public void setGType(Integer GType) {
		this.GType = GType;
	}

	public String getGIsTop() {
		return this.GIsTop;
	}

	public void setGIsTop(String GIsTop) {
		this.GIsTop = GIsTop;
	}

	public Integer getGIsDiscount() {
		return this.GIsDiscount;
	}

	public void setGIsDiscount(Integer GIsDiscount) {
		this.GIsDiscount = GIsDiscount;
	}

	public Integer getGIsTakeOut() {
		return this.GIsTakeOut;
	}

	public void setGIsTakeOut(Integer GIsTakeOut) {
		this.GIsTakeOut = GIsTakeOut;
	}

	public Date getGBeginTime() {
		return this.GBeginTime;
	}

	public void setGBeginTime(Date GBeginTime) {
		this.GBeginTime = GBeginTime;
	}

	public Date getGEndTime() {
		return this.GEndTime;
	}

	public void setGEndTime(Date GEndTime) {
		this.GEndTime = GEndTime;
	}

	public Integer getGIsSpecial() {
		return this.GIsSpecial;
	}

	public void setGIsSpecial(Integer GIsSpecial) {
		this.GIsSpecial = GIsSpecial;
	}

	public String getGStatus() {
		return this.GStatus;
	}

	public void setGStatus(String GStatus) {
		this.GStatus = GStatus;
	}

}