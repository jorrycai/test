package com.shop.testUtil;

import java.util.Random;

///生成验证码     6位数字
public class checkcode {
	public static void main(String[] args) {
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
