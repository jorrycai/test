package com.shop.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer UId;
	private String UName;
	private String UEmail;
	private String UPassword;
	private String UHimg;
	private String UPhone;
	private Date URegisterTime;
	private Date ULoginTime;
	private Integer UScore;
	private boolean UIsVip;
	private short UStatus;
	private String UCheckCode;
	private Set paies = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String UName, String UEmail, String UPassword, String UHimg,
			String UPhone, Date URegisterTime, Date ULoginTime, Integer UScore,
			boolean UIsVip, short UStatus, String UCheckCode, Set paies) {
		this.UName = UName;
		this.UEmail = UEmail;
		this.UPassword = UPassword;
		this.UHimg = UHimg;
		this.UPhone = UPhone;
		this.URegisterTime = URegisterTime;
		this.ULoginTime = ULoginTime;
		this.UScore = UScore;
		this.UIsVip = UIsVip;
		this.UStatus = UStatus;
		this.UCheckCode = UCheckCode;
		this.paies = paies;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getUEmail() {
		return this.UEmail;
	}

	public void setUEmail(String UEmail) {
		this.UEmail = UEmail;
	}

	public String getUPassword() {
		return this.UPassword;
	}

	public void setUPassword(String UPassword) {
		this.UPassword = UPassword;
	}

	public String getUHimg() {
		return this.UHimg;
	}

	public void setUHimg(String UHimg) {
		this.UHimg = UHimg;
	}

	public String getUPhone() {
		return this.UPhone;
	}

	public void setUPhone(String UPhone) {
		this.UPhone = UPhone;
	}

	public Date getURegisterTime() {
		return this.URegisterTime;
	}

	public void setURegisterTime(Date URegisterTime) {
		this.URegisterTime = URegisterTime;
	}

	public Date getULoginTime() {
		return this.ULoginTime;
	}

	public void setULoginTime(Date ULoginTime) {
		this.ULoginTime = ULoginTime;
	}

	public Integer getUScore() {
		return this.UScore;
	}

	public void setUScore(Integer UScore) {
		this.UScore = UScore;
	}

	public boolean getUIsVip() {
		return this.UIsVip;
	}

	public void setUIsVip(boolean UIsVip) {
		this.UIsVip = UIsVip;
	}

	public short getUStatus() {
		return this.UStatus;
	}

	public void setUStatus(short UStatus) {
		this.UStatus = UStatus;
	}

	public String getUCheckCode() {
		return this.UCheckCode;
	}

	public void setUCheckCode(String UCheckCode) {
		this.UCheckCode = UCheckCode;
	}

	public Set getPaies() {
		return this.paies;
	}

	public void setPaies(Set paies) {
		this.paies = paies;
	}

}