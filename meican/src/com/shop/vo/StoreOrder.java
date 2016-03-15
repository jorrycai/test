package com.shop.vo;

/**
 * StoreOrder entity. @author MyEclipse Persistence Tools
 */

public class StoreOrder implements java.io.Serializable {

	// Fields

	private StoreOrderId id;
	private boolean dining;

	// Constructors

	/** default constructor */
	public StoreOrder() {
	}

	/** minimal constructor */
	public StoreOrder(StoreOrderId id) {
		this.id = id;
	}

	/** full constructor */
	public StoreOrder(StoreOrderId id, boolean dining) {
		this.id = id;
		this.dining = dining;
	}

	// Property accessors

	public StoreOrderId getId() {
		return this.id;
	}

	public void setId(StoreOrderId id) {
		this.id = id;
	}

	public boolean getDining() {
		return this.dining;
	}

	public void setDining(boolean dining) {
		this.dining = dining;
	}

}