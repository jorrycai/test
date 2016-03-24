package com.shop.service;

import com.shop.dao.GoodsDao;
import com.shop.vo.Goods;

public class GoodsService {
	private GoodsDao goodsDao;

	public GoodsDao getGoodsDao() {
		return goodsDao;
	}
	public Goods findByPid(Integer pid) {
		return goodsDao.findByPid(pid);
	}

	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
	public void saveGoods(Goods goods){
		this.goodsDao.saveGoods(goods);
	}
	public int findSIDbyID(int GID){
		return goodsDao.findSIDbyID(GID);
	}

}
