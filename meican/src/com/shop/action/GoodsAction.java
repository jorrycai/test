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

public class GoodsAction extends ActionSupport implements ModelDriven<Goods> {
	private GoodsService goodService;
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
		return goodService;
	}

	public void setGoodsService(GoodsService goodService) {
		this.goodService = goodService;
	}
	public String findSIDbyID(){
		map=new LinkedHashMap<Object, Object>();
		map.put("sid",goodService.findSIDbyID(goods.getGId()) );
		return "map";
	}

}
	