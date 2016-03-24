package com.shop.utils;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

public class taobao {
	public static void test1(String phone,String code) throws ApiException{

	String product="美餐";
	String s="{\"code\":\""+code+"\",\"product\":\""+product+"\"}";
	TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest","23329474","9102e79111e44468225348fadd45be88");
    AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
    req.setSmsType("normal");
    
    req.setSmsFreeSignName("注册验证");
    req.setSmsParamString(s);
    
    req.setRecNum(phone);
    req.setSmsTemplateCode("SMS_6305469");
    AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
    System.out.println(rsp.getBody());
	}
	
}
