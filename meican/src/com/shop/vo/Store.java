package com.shop.vo;

/**
 * Store entity. @author MyEclipse Persistence Tools
 */

public class Store implements java.io.Serializable {

	// Fields

	private Integer SId;
	private String SName;
	private String position;
	private String SAddress;
	private String SPic;
	private String introduction;
	private String SPhone;
	private Integer EId;
	private String geohash;
	private double longitude;
	private double latitude;
	private Integer maptableid;

	// Constructors

	/** default constructor */
	public Store() {
	}
	
	/** full constructor */
	public Store(String SName, String position, String SAddress, String SPic,
			String introduction, String SPhone, Integer EId, String geohash,
			double longitude, double latitude, Integer maptableid) {
		this.SName = SName;
		this.position = position;
		this.SAddress = SAddress;
		this.SPic = SPic;
		this.introduction = introduction;
		this.SPhone = SPhone;
		this.EId = EId;
		this.geohash = geohash;
		this.longitude = longitude;
		this.latitude = latitude;
		this.maptableid = maptableid;
	}

	// Property accessors

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSAddress() {
		return this.SAddress;
	}

	public void setSAddress(String SAddress) {
		this.SAddress = SAddress;
	}

	public String getSPic() {
		return this.SPic;
	}

	public void setSPic(String SPic) {
		this.SPic = SPic;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getSPhone() {
		return this.SPhone;
	}

	public void setSPhone(String SPhone) {
		this.SPhone = SPhone;
	}

	public Integer getEId() {
		return this.EId;
	}

	public void setEId(Integer EId) {
		this.EId = EId;
	}

	public String getGeohash() {
		return this.geohash;
	}

	public void setGeohash(String geohash) {
		this.geohash = geohash;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public Integer getMaptableid() {
		return this.maptableid;
	}

	public void setMaptableid(Integer maptableid) {
		this.maptableid = maptableid;
	}

}