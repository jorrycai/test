package com.shop.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Store entity. @author MyEclipse Persistence Tools
 */

public class Store implements java.io.Serializable {

	// Fields

	private Integer SId;
	private String SName;
	private String SPhone;
	private String SAddress;
	private String SHimg;
	private String SDes;
	private Integer SIsCar;
	private String SIsTakeout;
	private String SIsDayRent;
	private short SIsOrder;
	private String SGeohash;
	private short SIsTop;
	private String SType;
	private String SScore;
	private Date SBeginTime;
	private Date SEndTime;
	private String SPic;
	private String SProvince;
	private String SCity;
	private String SDistrict;
	private String SLon;
	private String SLat;
	private Set environments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Store() {
	}

	/** full constructor */
	public Store(String SName, String SPhone, String SAddress, String SHimg,
			String SDes, Integer SIsCar, String SIsTakeout, String SIsDayRent,
			short SIsOrder, String SGeohash, short SIsTop, String SType,
			String SScore, Date SBeginTime, Date SEndTime, String SPic,
			String SProvince, String SCity, String SDistrict, String SLon,
			String SLat, Set environments) {
		this.SName = SName;
		this.SPhone = SPhone;
		this.SAddress = SAddress;
		this.SHimg = SHimg;
		this.SDes = SDes;
		this.SIsCar = SIsCar;
		this.SIsTakeout = SIsTakeout;
		this.SIsDayRent = SIsDayRent;
		this.SIsOrder = SIsOrder;
		this.SGeohash = SGeohash;
		this.SIsTop = SIsTop;
		this.SType = SType;
		this.SScore = SScore;
		this.SBeginTime = SBeginTime;
		this.SEndTime = SEndTime;
		this.SPic = SPic;
		this.SProvince = SProvince;
		this.SCity = SCity;
		this.SDistrict = SDistrict;
		this.SLon = SLon;
		this.SLat = SLat;
		this.environments = environments;
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

	public String getSPhone() {
		return this.SPhone;
	}

	public void setSPhone(String SPhone) {
		this.SPhone = SPhone;
	}

	public String getSAddress() {
		return this.SAddress;
	}

	public void setSAddress(String SAddress) {
		this.SAddress = SAddress;
	}

	public String getSHimg() {
		return this.SHimg;
	}

	public void setSHimg(String SHimg) {
		this.SHimg = SHimg;
	}

	public String getSDes() {
		return this.SDes;
	}

	public void setSDes(String SDes) {
		this.SDes = SDes;
	}

	public Integer getSIsCar() {
		return this.SIsCar;
	}

	public void setSIsCar(Integer SIsCar) {
		this.SIsCar = SIsCar;
	}

	public String getSIsTakeout() {
		return this.SIsTakeout;
	}

	public void setSIsTakeout(String SIsTakeout) {
		this.SIsTakeout = SIsTakeout;
	}

	public String getSIsDayRent() {
		return this.SIsDayRent;
	}

	public void setSIsDayRent(String SIsDayRent) {
		this.SIsDayRent = SIsDayRent;
	}

	public short getSIsOrder() {
		return this.SIsOrder;
	}

	public void setSIsOrder(short SIsOrder) {
		this.SIsOrder = SIsOrder;
	}

	public String getSGeohash() {
		return this.SGeohash;
	}

	public void setSGeohash(String SGeohash) {
		this.SGeohash = SGeohash;
	}

	public short getSIsTop() {
		return this.SIsTop;
	}

	public void setSIsTop(short SIsTop) {
		this.SIsTop = SIsTop;
	}

	public String getSType() {
		return this.SType;
	}

	public void setSType(String SType) {
		this.SType = SType;
	}

	public String getSScore() {
		return this.SScore;
	}

	public void setSScore(String SScore) {
		this.SScore = SScore;
	}

	public Date getSBeginTime() {
		return this.SBeginTime;
	}

	public void setSBeginTime(Date SBeginTime) {
		this.SBeginTime = SBeginTime;
	}

	public Date getSEndTime() {
		return this.SEndTime;
	}

	public void setSEndTime(Date SEndTime) {
		this.SEndTime = SEndTime;
	}

	public String getSPic() {
		return this.SPic;
	}

	public void setSPic(String SPic) {
		this.SPic = SPic;
	}

	public String getSProvince() {
		return this.SProvince;
	}

	public void setSProvince(String SProvince) {
		this.SProvince = SProvince;
	}

	public String getSCity() {
		return this.SCity;
	}

	public void setSCity(String SCity) {
		this.SCity = SCity;
	}

	public String getSDistrict() {
		return this.SDistrict;
	}

	public void setSDistrict(String SDistrict) {
		this.SDistrict = SDistrict;
	}

	public String getSLon() {
		return this.SLon;
	}

	public void setSLon(String SLon) {
		this.SLon = SLon;
	}

	public String getSLat() {
		return this.SLat;
	}

	public void setSLat(String SLat) {
		this.SLat = SLat;
	}

	public Set getEnvironments() {
		return this.environments;
	}

	public void setEnvironments(Set environments) {
		this.environments = environments;
	}

}