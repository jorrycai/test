package com.shop.action;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shop.service.StoreService;
import com.shop.vo.Store;

public class StoreAction extends ActionSupport implements ModelDriven<Store> {
	private StoreService StoreService;
	private Store store = new Store();
	private Map<String, String> map;
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Store getModel() {
		return store;
	}
	public StoreService getStoreService() {
		return StoreService;
	}

	public void setStoreService(StoreService StoreService) {
		this.StoreService = StoreService;
	}
	
	
	public List<Store> findById(){
		int id=store.getSId();
		return StoreService.findById(id);	
	}
	public List<Store> findByGeohash(){
		String geohash=store.getGeohash();
		return StoreService.findByGeohash(geohash);
	}
	
	
}