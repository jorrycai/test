package com.shop.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import com.alibaba.fastjson.JSON;
import com.shop.vo.User;

public class testFastJson {
	 public static void main(String[] args) {
         User User1 = new User();
         User1.setUName("address1");
         User1.setUPassword("ddd1");
        
         
         User User2 = new User();
         User2.setUName("address2");
         User2.setUPassword("ddd2");
        
         
         List<User> lp = new ArrayList<User>();
         lp.add(User1);
         lp.add(User2);
         //Map<List<User>,String> map=new Map<List<User>,String>;
         Map<String, List<User>> hashmap = new HashMap<String,  List<User>>();
         List<String> ls=new ArrayList<String>();
         hashmap.put("user", lp);
         //hashmap.put("2", ls);
         String string=JSON.toJSONString(hashmap);
         Map<String, String> hm = new HashMap<String, String>();
         hm.put("message", string);
         hm.put("result", null);
         System.out.println(JSON.toJSONString(hm));
         System.out.println(JSON.toJSON(hm));
     }
}
