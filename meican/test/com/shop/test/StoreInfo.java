package com.shop.test;

public class StoreInfo  implements java.io.Serializable,Comparable{
	
	
	private Integer SId;
	private String SName;
	private String SAddress;
	private String SPic;
	private String introduction;
	private String SPhone;
	private String geohash;
	private double longitude;
	private double latitude;
	private Integer maptableid;
	private double distance;
	public Integer getSId() {
		return SId;
	}
	public void setSId(Integer sId) {
		SId = sId;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSAddress() {
		return SAddress;
	}
	public void setSAddress(String sAddress) {
		SAddress = sAddress;
	}
	public String getSPic() {
		return SPic;
	}
	public void setSPic(String sPic) {
		SPic = sPic;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getSPhone() {
		return SPhone;
	}
	public void setSPhone(String sPhone) {
		SPhone = sPhone;
	}
	public String getGeohash() {
		return geohash;
	}
	public void setGeohash(String geohash) {
		this.geohash = geohash;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public Integer getMaptableid() {
		return maptableid;
	}
	public void setMaptableid(Integer maptableid) {
		this.maptableid = maptableid;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
//	public int compare(Object o1, Object o2) {  
//		 StoreInfo p1 = (StoreInfo)o1;  
//		 StoreInfo p2 = (StoreInfo)o2; 
//		 int i=(int)-(p1.getDistance()- p2.getDistance());
//
//		 return i;  
//	 }
	public int compareTo(Object o) {
		StoreInfo s = (StoreInfo)o;  
		int i=(int)(this.getDistance()- s.getDistance());
		
		//按距离 远到近 排序
		return i;
	}  

}
