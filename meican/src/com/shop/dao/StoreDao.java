package com.shop.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.shop.vo.Goods;
import com.shop.vo.Store;

public class StoreDao  extends HibernateDaoSupport{
	public List<Store> findBySid(Integer sid){
		String hql = "from Store where SID= ?";
	
		List<Store> list = this.getHibernateTemplate().find(hql,sid);
		
		return list;
	}
	public List<Store> findByGeohash(String geohash){
		geohash=geohash.substring(0, 1);
		geohash+="%";
		String hql = "from Store where geohash like ?";
		List<Store> list=this.getHibernateTemplate().find(hql,geohash);
		return list;
	}
	public List<Store> findTop(){
		String hql = "from Store where SIsTop = ?";
		short i=1;
		List<Store> list = this.getHibernateTemplate().find(hql,i);
		
		return list;
	
	}
	

}
