package com.test;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class sample_05 {

	public static void main(String[] args) {

		//서식 지정 클래스
		//DecimalForamt, SimpleDateFormat, MessageFormat 클래스
		//java.text 패키지 등록 필요 -> import 구문
		
		DecimalFormat def = new DecimalFormat("##.####");
		System.out.println(def.format(10.1231213123123));
		
		double a = 12312.444;
		System.out.println(new DecimalFormat("#.######").format(a));
		System.out.println(new DecimalFormat("0.0000E0").format(a));//지수 표현
		System.out.println(new DecimalFormat("0.0").format(a));
		System.out.println(new DecimalFormat("0.000000").format(a));//원래 값에 추가로 0이 붙는다.
		
		String name = "문성재";
		String phone = "010-4318-0221";
		String email = "seongjae.m@gmail.com";
		System.out.printf(name + ", " + phone + ", " + email + "\n" );
		System.out.printf("%s, %s, %s%n", name, phone, email);
		System.out.println(String.format("%s, %s, %s", name, phone, email));
		System.out.println(MessageFormat.format("{0}, {1}, {2}", name, phone, email));
		
		StringBuffer sb = new StringBuffer("30");
		System.out.println(sb.append("str"));
		System.out.println(sb.insert(2,"str"));
	}
}
