package com.shop.test;

import com.alibaba.fastjson.JSON;

public class testing {
		public static void main(String[] args) {
			Boolean sso=true;
			String string=JSON.toJSONString(sso);
			System.out.println("sso--------"+JSON.toJSONString(sso));
		
		}
	}


