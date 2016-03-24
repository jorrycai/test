package com.shop.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;


import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shop.service.UserService;
import com.shop.utils.checkcode;
import com.shop.utils.taobao;
import com.shop.vo.User;
import com.taobao.api.ApiException;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private UserService userService;
	private User user = new User();
	private Map<Object, Object> map;
	private String json;
	
	public Map<Object, Object> getMap() {
		return map;
	}
	public void setMap(Map<Object, Object> map) {
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
		map=new HashMap<Object, Object>();
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
		return "map";
	}
	/*用户名登陆*/
	public String loginWithName(){
		String name=user.getUName().trim();
		String password =user.getUPassword().trim();
		map=new HashMap<Object, Object>();
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
	
	public String registWithPhone1(){
		// map中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据 
		map=new HashMap<Object, Object>();
		if(userService.checkUserExistsWithPhone(user)){		
			map.put("message", "用户名已被注册");	
			map.put("result", "false");
		}else{
			String code=checkcode.getcode();
			String phone=user.getUPhone();
		try {
			taobao.test1(phone, code);
			map.put("message", "验证码发送成功");
			map.put("result", "true");
			ActionContext.getContext().getSession().put(user.getUPhone(), code); 
		} catch (ApiException e) {
			map.put("message", "验证码发送失败");
			map.put("result", "false");
			e.printStackTrace();
		}
	
//	  //改动 放到 try里面     / seeion的key设置为手机号码
//		map.put("message", "验证码发送成功");
//		map.put("result", "true");
//		ActionContext.getContext().getSession().put("rand", code); 
		} 
	    return "map";	
	}
		
	public String registWithPhone2(){
		// map中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据 
		map=new HashMap<Object,Object>();
		String ver=(String) ActionContext.getContext().getSession().get(user.getUPhone());  
		if(user.getUCheckCode().equals(ver))
		{
		userService.saveUser(user);	
		map.put("message", "注册成功");
		  map.put("result", "true");
		System.out.print(map);
		}else{
			map.put("message", "废了");
			System.out.print(map);
			}
		
		return "map";
	}

}
