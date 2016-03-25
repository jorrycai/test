package com.shop.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



import com.shop.vo.Goods;



public class GoodsDao extends HibernateDaoSupport{
	public void saveGoods(Goods goods){
		this.getHibernateTemplate().save(goods);
	}
	
	// 根据商品ID查询商品
		public Goods findByPid(Integer pid) {
			return this.getHibernateTemplate().get(Goods.class, pid);
		}
		
		//根据商品id查询 商店id
		public int findSIDbyID(int GID) {
			String hql = "from Goods where G_ID=?";
			List<Goods> list = this.getHibernateTemplate().find(hql,GID);
			System.out.print(list.toString());
			if(list != null && list.size() > 0){
				return list.get(0).getGSid();
			}else
			return 0;
		}
}

