package com.shop.vo;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer UId;
	private String UName;
	private String UPhone;
	private String UPic;
	private String UAddress;
	private String URname;
	private String UPassword;
	private String token;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String UName, String UPhone, String UPic, String UAddress,
			String URname, String UPassword, String token) {
		this.UName = UName;
		this.UPhone = UPhone;
		this.UPic = UPic;
		this.UAddress = UAddress;
		this.URname = URname;
		this.UPassword = UPassword;
		this.token = token;
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

	public String getUPhone() {
		return this.UPhone;
	}

	public void setUPhone(String UPhone) {
		this.UPhone = UPhone;
	}

	public String getUPic() {
		return this.UPic;
	}

	public void setUPic(String UPic) {
		this.UPic = UPic;
	}

	public String getUAddress() {
		return this.UAddress;
	}

	public void setUAddress(String UAddress) {
		this.UAddress = UAddress;
	}

	public String getURname() {
		return this.URname;
	}

	public void setURname(String URname) {
		this.URname = URname;
	}

	public String getUPassword() {
		return this.UPassword;
	}

	public void setUPassword(String UPassword) {
		this.UPassword = UPassword;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}