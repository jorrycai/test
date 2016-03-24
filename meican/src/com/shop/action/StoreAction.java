package com.shop.action;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shop.service.StoreService;
import com.shop.vo.Store;

public class StoreAction extends ActionSupport implements ModelDriven<Store> {
	private StoreService StoreService;
	private Store store = new Store();
	private Map<Object, Object> map;
	private Map<Object, Object> map2;
	private Map<Object, Object> treeMap;
	private Set<Object> set;
	private List<Object> list;
	public Map<Object, Object> getMap() {
		return map;
	}
	public void setMap(Map<Object, Object> map) {
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
		String geohash=store.getSGeohash();
		return StoreService.findByGeohash(geohash);
	}
	//首页  显示 推荐商家图片
	public String findTop(){
		set=new HashSet<Object>();
		list=new ArrayList<Object>();
		map=new HashMap<Object, Object>();
		map2=new HashMap<Object, Object>();
		treeMap =new LinkedHashMap<Object, Object>();
		List<Store> stores= StoreService.findTop();
		
		//还没做好
		for(int i=0;i<stores.size();i++){
			treeMap =new LinkedHashMap<Object, Object>();
			treeMap.put("SID", stores.get(i).getSId());
			treeMap.put("SHimg", stores.get(i).getSHimg());
			list.add(treeMap);
			map2.put("store", list);
			map.put("info", map2);
		}
		map.put("status", 1);
		return "map";
	}
	
	public String findbyGoodsID(int GID){
		
		return "map";
	}
}