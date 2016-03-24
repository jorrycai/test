package com.shop.vo;

/**
 * Storetostore entity. @author MyEclipse Persistence Tools
 */

public class Storetostore implements java.io.Serializable {

	// Fields

	private Integer SToSId;
	private String fromStore;
	private String toStore;

	// Constructors

	/** default constructor */
	public Storetostore() {
	}

	/** full constructor */
	public Storetostore(String fromStore, String toStore) {
		this.fromStore = fromStore;
		this.toStore = toStore;
	}

	// Property accessors

	public Integer getSToSId() {
		return this.SToSId;
	}

	public void setSToSId(Integer SToSId) {
		this.SToSId = SToSId;
	}

	public String getFromStore() {
		return this.fromStore;
	}

	public void setFromStore(String fromStore) {
		this.fromStore = fromStore;
	}

	public String getToStore() {
		return this.toStore;
	}

	public void setToStore(String toStore) {
		this.toStore = toStore;
	}

}