package com.shop.test;

import java.text.DecimalFormat;
import java.util.Random;
import org.junit.Test;


import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

public class TaobaoTest {

	public void test1() throws ApiException{
	
		String url="http://gw.api.taobao.com/router/rest";
		String appkey="23327101";
		String secret="d5e8953069af1c8aae5d85ecfec96e14";
		String code="2145";
		String product="美餐";
		String s1="{\"code\":\""+code+"\",\"product\":\""+product+"\"}";
		String phone="13199516870";
		
		
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setSmsType("normal");
		req.setSmsFreeSignName("注册验证");
		req.setSmsParam(s1);
		req.setRecNum(phone);
		req.setSmsTemplateCode("SMS_6115382");
		AlibabaAliqinFcSmsNumSendResponse response = client.execute(req);
	
		System.out.println(response.getBody());
	}
	
	public void test() throws ApiException{
		int code=8888;
		String product="美餐";
		String s1="{\"code\":\""+code+"\",\"product\":\""+product+"\"}";
		
		//System.out.println(s1);
		//System.out.println("aaaaaaaaaaaa");	
	}
	public static void main(String[] args) {
//		Random rd1=new Random();
//		Random rd2=new Random();
//		int r1=rd1.nextInt(9);
//		int r2=rd2.nextInt(99);
//		int r3=rd2.nextInt(99);
//		
//		String str = String.format("%04d", r3);
//		
//		DecimalFormat df1 = new DecimalFormat("###.00");
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r3);
//		System.out.println(df1.format(r3));
//		System.out.println(str);
		Random rd=new Random();
		int r1=rd.nextInt(9);
		int r2=rd.nextInt(8);
		int r3=rd.nextInt(9);
		int r4=rd.nextInt(9);
		int r5=rd.nextInt(9);
		int r6=rd.nextInt(9);
		String sss=r1+""+r2+r3+r4+r5+r6;
		System.out.println(sss);
		
	}
	

}
