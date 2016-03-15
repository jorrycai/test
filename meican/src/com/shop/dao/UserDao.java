package com.shop.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.shop.vo.User;

public class UserDao extends HibernateDaoSupport {
	public void saveUser(User user){
		this.getHibernateTemplate().save(user);
	}
	
	public User findByPhone(String phone){
		String hql = "from User where u_phone = ?";
		List<User> list = this.getHibernateTemplate().find(hql, phone);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
	public User findByName(String name){
		String hql = "from User where u_name = ?";
		List<User> list = this.getHibernateTemplate().find(hql, name);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
	public void update(User existUser) {
		this.getHibernateTemplate().update(existUser);
	}
	public User loginWithName(User user) {
		String hql = "from User where u_name = ? and u_password = ?";
		List<User> list = this.getHibernateTemplate().find(hql, user.getUName(),user.getUPassword(),1);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
	public User loginWithPhone(User user) {
		String hql = "from User where u_phone = ? and u_password = ?";
		List<User> list = this.getHibernateTemplate().find(hql, user.getUPhone(),user.getUPassword(),1);
		if(list != null && list.size() > 0){
			return list.get(0);
		}                               
		return null;
	}
	public boolean checkUserExistsWithName(String name) {
		String hql = "from User where u_name = ?";
		List<User> users = this.getHibernateTemplate().find(hql,name);
		if(users != null && users.size() > 0) {
			return true;
		}
		return false;
	}
	public boolean checkUserExistsWithNameAndPassword(String name,String password) {
		String hql = "from User where u_name = ? and u_password=?";
		List<User> users = this.getHibernateTemplate().find(hql,name,password);
		if(users != null && users.size() > 0) {
			return true;
		}
		return false;
	}
}
