package com.shop.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;


import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shop.service.UserService;
import com.shop.vo.User;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private UserService userService;
	private User user = new User();
	private Map<String, String> map;
	private String json;
	
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public User getModel() {
		return user;
	}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String  getJson() {
		return json;
	}
	public void setJson(String  json) {
		this.json = json;
	}
	public String saveUser(){
		userService.saveUser(user);
		return null;
	}
	/*用户名注册*/
	public String registWithName(){
		String name=user.getUName().trim();
		String password =user.getUPassword().trim();
		// map中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		map=new HashMap<String, String>();
		if(name.equals("")){
			map.put("message", "请输入用户名");	
			map.put("result", "false");
		}else{
			if(password.equals("")){
				map.put("message", "请输入密码");	
				map.put("result", "false");
			}else{
		
				if(userService.checkUserExistsWithName(user)){		
						map.put("message", "用户名已被注册");	
						map.put("result", "false");
				}else{
					userService.saveUser(user);
					map.put("message", "注册成功");
					map.put("result", "true");
				}
			}
		}
		String string1= "[{ y: "+"55.11"+", color : "+"colors[0]"+" },{ y: "+"21.63"+", color: "+"colors[1]"+" }]";
		String  jsonArray=JSONArray.fromObject(string1).toString();
		this.setJson(jsonArray);
		System.out.println(json);
		//map.put("00", json);
		
		System.out.println("map"+JSONArray.fromObject(map));
		return "json";
	}
	/*用户名登陆*/
	public String loginWithName(){
		String name=user.getUName().trim();
		String password =user.getUPassword().trim();
		map=new HashMap<String, String>();
		if(!(userService.checkUserExistsWithNameAndPassword(name,password))){	
			map.put("message", "用户名或密码错误");
			map.put("result", "false");
			
		}else{
			map.put("message", "登陆成功");	
			map.put("result", "true");

		}
		//System.out.print(map);
		return "map";
	}

}
