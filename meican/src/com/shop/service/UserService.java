package com.shop.service;


import com.shop.dao.UserDao;
import com.shop.vo.User;

public class UserService {
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void saveUser(User user){
		this.userDao.saveUser(user);
	}
	
	
	public String registWithName(User user)
	{
		
		return null;
	}
	// 按用户名查询用户的方法:
	public User findByName(String name){
		return userDao.findByName(name);
	}
	public User findByPhone(String phone){
		return userDao.findByPhone(phone);
	}
	// 用户名登录的方法
	public User loginWithname(User user) {
		return userDao.loginWithName(user);
	}	
	// 手机号码登录的方法
	public User loginWithPhone(User user) {
		return userDao.loginWithPhone(user);
	}	
	public boolean checkUserExistsWithName(User u) {
		return userDao.checkUserExistsWithName(u.getUName());
		
	}
	public boolean checkUserExistsWithNameAndPassword(String name,String password) {
		return userDao.checkUserExistsWithNameAndPassword(name,password);
	}
	public boolean checkUserExistsWithPhone(User u) {
		return userDao.checkUserExistsWithPhone(u.getUPhone());
		
	}
	
	
}
