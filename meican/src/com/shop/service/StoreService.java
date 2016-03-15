package com.shop.service;

import java.util.List;

import com.shop.dao.StoreDao;
import com.shop.vo.Store;

public class StoreService {
	private StoreDao StoreDao;
	public StoreDao getStoreDao() {
		return StoreDao;
	}
	public void setStoreDao(StoreDao StoreDao) {
		this.StoreDao = StoreDao;
	}
	public List<Store> findById(Integer s){
		return StoreDao.findBySid(s);
	}
	public List<Store> findByGeohash(String geohash){
		return StoreDao.findByGeohash(geohash);
	}

}
