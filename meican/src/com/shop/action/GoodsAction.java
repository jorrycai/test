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
import com.shop.service.GoodsService;
import com.shop.vo.Goods;
import com.shop.vo.Store;

public class GoodsAction extends ActionSupport implements ModelDriven<Goods> {
	private GoodsService goodsService;
	private StoreAction storeAction;
	private Goods goods = new Goods();
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
	public Goods getModel() {
		return goods;
	}
	public GoodsService getGoodsService() {
		return goodsService;
	}

	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	public String findSIDbyGID(){
		map=new LinkedHashMap<Object, Object>();
		map.put("sid",goodsService.findSIDbyID(goods.getGId()) );
		return "map";
	}
	
	//根据 goods ID查询 store信息 
	public String findStorebyGID(){
		map=new LinkedHashMap<Object, Object>();
		List<Store> list=goodsService.findStorbyGID(goods.getGId());
		if(list==null||list.size()<=0){
			//查询无果
			System.out.println("查询无果！！");
			map.put("store",0);
		}else
		map.put("store",list);
		//System.out.println(goodsService.findStorbyGID(goods.getGId())+"11111");
		return "map";
	}
	
}
	