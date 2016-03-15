package com.shop.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import net.sf.json.JSONArray;

import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;

import com.alibaba.fastjson.JSON;
import com.shop.service.StoreService;
import com.shop.service.UserService;
import com.shop.utils.Distance;
import com.shop.vo.Store;
import com.shop.vo.User;
import com.shop.test.StoreInfo;

public class UserTest extends SpringUtils{
	@Test
	public void testSaveUser(){
		UserService userService=(UserService)context.getBean("userService");
		User user =new User();
		user.setUName("h");
		user.setUAddress("haerb");
		userService.saveUser(user);
	}
	@Test
	public void testUserAction(){
		context.getBean("userAction");
	}
	//Stroe Test
	@Test
	public void testfind(){
		StoreService storeService=(StoreService)context.getBean("storeService");
		Store store=new Store();
		store.setSId(1);
		storeService.findById(1);
	}
	@Test
	public void testfindg(){
		StoreService storeService=(StoreService)context.getBean("storeService");
		Store store=new Store();
		String geohash="yb4h8h9b7dpv";
		List<Store> list=storeService.findByGeohash(geohash);
		List<Object> listup = new ArrayList<Object>();
		Map<String, List<Store>> map=new HashMap<String, List<Store>>();
		Map<Map<List<Store>, String>, String> map2=new HashMap<Map<List<Store>,String>, String>();
		ArrayList<Map<String, List<Store>>>  al=new ArrayList<Map<String,List<Store>>>();
		
		ArrayList<Map<String, List<Store>>>  al2=new ArrayList<Map<String,List<Store>>>();
		Map<String,String> mss=new HashMap<String, String>();
		Map<String, Object> mso=new HashMap<String, Object>();
		Set<Object> so=new TreeSet<Object>();
//		for(Store s : list){
//			double lon1=s.getLongitude();  
//	  	    double lat1=s.getLatitude();
//	  	    
//	  	    double lon2=109.0145193757;  
//	  	    double lat2=34.236080797698;
//	  	    double d=Distance.GetDistance(lon1, lat1, lon2, lat2);
//			
//			System.out.println(s.getSName());
//			System.out.println("lon1......"+lon1);
//			System.out.println("lat1......"+lat1);
//			System.out.println("distance......"+d);
//		}
		
//		Iterator<Store> it1 = list.iterator();
//		
//        while(it1.hasNext()){
//            System.out.println(it1.next());
//        }
		for(int i=0;i<list.size();i++){
			map=new HashMap<String, List<Store>>();
			al=new ArrayList<Map<String,List<Store>>>();
			double lon1=list.get(i).getLongitude();  
	  	    double lat1=list.get(i).getLatitude();
	  	    
	  	    double lon2=109.0145193757;  
	  	    double lat2=34.236080797698;
	  	    double d=Distance.GetDistance(lon1, lat1, lon2, lat2);
	  	    
	  	    
	  	    String dString="distance:"+d;
	  	    
	  	    map.put( dString,list);
	  	    
			
			System.out.println(list.get(i).getSName());
			System.out.println("lon1......"+lon1);
			System.out.println("lat1......"+lat1);
			System.out.println("distance......"+d);
			System.out.println(list.get(i).getSName());		
		}
		al.add(map);
		String string1= "[{ y: \"55.11\", color : \"colors[0]\" },{ y: \"21.63\", color: \"colors[1]\" }]";
		
		String s=JSON.toJSONString(map);
		JSONArray jsonArr = JSONArray.fromObject(string1);
		String jsonArr1=jsonArr.toString();
		mss.put("00", string1);
		mss.put("11", jsonArr1);
		mso.put("0", list);
		mso.put("1", "00");
		System.out.println(list);
		System.out.println("list------"+JSON.toJSONString(list));
		System.out.println("map-------"+JSON.toJSONString(map));
		System.out.println("map2-------"+JSON.toJSONString(map2));
		System.out.println("mss-------"+JSON.toJSONString(mss));
		System.out.println("mss-------"+JSON.toJSONString(mso));
		
		System.out.println("arraylist-----"+JSON.toJSONString(al));
		System.out.println("String1-----"+JSON.toJSONString(string1));
		System.out.println("String1-----"+JSON.toJSON(string1));
		System.out.println("jsonArr-----"+jsonArr+"-------"+JSON.toJSONString(jsonArr)+jsonArr.toString());
	}
	@Test
	public void testfindg0(){
		StoreService storeService=(StoreService)context.getBean("storeService");
		Store store=new Store();
		String geohash="yb4h8h9b7dpv";
		List<Store> list=storeService.findByGeohash(geohash);
		List<Object> lo2 = new ArrayList<Object>();
		ArrayList<Object>  al=new ArrayList<Object>();
		ArrayList<Map<String, List<Store>>>  al2=new ArrayList<Map<String,List<Store>>>();
		List<Object> lo= new ArrayList<Object>();
		Map<String,String> mss=new HashMap<String, String>();
		Map<String, Object> mso=new HashMap<String, Object>();
		Map<String, Object> mso2=new HashMap<String, Object>();
		Map<String, Object> mso3=new HashMap<String, Object>();
		Map<String, Object> mso4=new TreeMap<String, Object>();
		List<StoreInfo> lsi= new ArrayList<StoreInfo>();
		List<StoreInfo> lsi2;
		Set<Object> so=new TreeSet<Object>( new mycomp());
		 Set ss=new TreeSet(new ArrayList());
		 Set<Object> sso=new TreeSet<Object>();
		
		for(int i=0;i<list.size();i++){
			StoreInfo si=new StoreInfo();
			
			double lon1=list.get(i).getLongitude();  
	  	    double lat1=list.get(i).getLatitude();
	  	    
	  	    double lon2=109.0145193757;  
	  	    double lat2=34.236080797698;
	  	    double d=Distance.GetDistance(lon1, lat1, lon2, lat2);
	  	    
	  	    
	  	   
	  	    mso.put("store", list);
	  	    mso.put("distance", d);
	  	    
			System.out.println("lon1......"+lon1);
			System.out.println("lat1......"+lat1);
			System.out.println("distance......"+d);
			System.out.println(list.get(i).getSName());	
			System.out.println(mso);
			mso2.put(i+"", mso);
			lo.add(mso);
			al.add(mso);
			mso4=new HashMap<String, Object>();
//			mso4.put("sid", list.get(i).getSId());
//			mso4.put("sname", list.get(i).getSName());
//			mso4.put("saddress", list.get(i).getSAddress());
//			mso4.put("sphone", list.get(i).getSPhone());
//			mso4.put("pic", list.get(i).getSPic());
//			mso4.put("latitude", list.get(i).getLatitude());
//			mso4.put("longitude", list.get(i).getLongitude());
//			mso4.put("distance",d);
			si.setDistance(d);
			si.setGeohash(list.get(i).getGeohash());
			si.setIntroduction(list.get(i).getIntroduction());
			si.setLatitude(list.get(i).getLatitude());
			si.setLongitude(list.get(i).getLongitude());
			si.setSAddress(list.get(i).getSAddress());
			si.setSId(list.get(i).getSId());
			si.setSName(list.get(i).getSName());
			si.setSPhone(list.get(i).getSPhone());
			//si.setSPic(list.get(i).getSPic());
			
			
			mso3.put("1", mso4);
			lo2.add(mso4);
			sso.add(si);
			
		}
		
		
		System.out.println("mso--------"+JSON.toJSONString(mso));
		System.out.println("mso2--------"+JSON.toJSONString(mso2));
		System.out.println("al--------"+JSON.toJSONString(al));
		
		net.sf.json.JSON js=JSONArray.fromObject(al);
		System.out.println("js--------"+JSON.toJSONString(js));
		System.out.println("lo--------"+JSON.toJSONString(lo));
		System.out.println("lo2--------"+JSON.toJSONString(lo2));
		System.out.println("mso3--------"+JSON.toJSONString(mso3));
		System.out.println("mso4--------"+JSON.toJSONString(mso4));
		System.out.println("sso--------"+JSON.toJSONString(sso));
		System.out.println(mso4.get("distance"));
	}
}
class mycomp implements Comparator  
{  
  
 public int compare(Object o1, Object o2) {  
	 StoreInfo p1 = (StoreInfo)o1;  
	 StoreInfo p2 = (StoreInfo)o2; 
	 int i=(int)-(p1.getDistance()- p2.getDistance());

	 return i;  
 }  
}  
