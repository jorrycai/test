package com.shop.vo;

/**
 * Menu entity. @author MyEclipse Persistence Tools
 */

public class Menu implements java.io.Serializable {

	// Fields

	private Integer MId;
	private float price;
	private String MName;
	private boolean specialty;
	private Integer SId;
	private String pic;

	// Constructors

	/** default constructor */
	public Menu() {
	}

	/** full constructor */
	public Menu(float price, String MName, boolean specialty, Integer SId,
			String pic) {
		this.price = price;
		this.MName = MName;
		this.specialty = specialty;
		this.SId = SId;
		this.pic = pic;
	}

	// Property accessors

	public Integer getMId() {
		return this.MId;
	}

	public void setMId(Integer MId) {
		this.MId = MId;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMName() {
		return this.MName;
	}

	public void setMName(String MName) {
		this.MName = MName;
	}

	public boolean getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(boolean specialty) {
		this.specialty = specialty;
	}

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

}