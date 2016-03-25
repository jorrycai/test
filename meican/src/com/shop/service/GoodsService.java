package com.shop.service;

import java.util.List;

import com.shop.dao.GoodsDao;
import com.shop.dao.StoreDao;
import com.shop.vo.Goods;


import com.shop.vo.Store;
public class GoodsService {
	private GoodsDao goodsDao;
	private StoreDao storeDao;

	public StoreDao getStoreDao() {
		return storeDao;
	}
	public void setStoreDao(StoreDao storeDao) {
		this.storeDao = storeDao;
	}
	public GoodsDao getGoodsDao() {
		return goodsDao;
	}
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
	public void saveGoods(Goods goods){
		this.goodsDao.saveGoods(goods);
	}
	public Goods findByPid(Integer pid) {
		return goodsDao.findByPid(pid);
	}

	public int findSIDbyID(int GID){
		return goodsDao.findSIDbyID(GID);
	}
	public List<Store> findStorbyGID(int GID){
		int sid=goodsDao.findSIDbyID(GID);
		List<Store> store= storeDao.findBySid(sid);
		return store;
		
	}

}
