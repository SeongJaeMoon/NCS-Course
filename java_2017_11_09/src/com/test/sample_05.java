package com.test;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class sample_05 {

	public static void main(String[] args) {

		//���� ���� Ŭ����
		//DecimalForamt, SimpleDateFormat, MessageFormat Ŭ����
		//java.text ��Ű�� ��� �ʿ� -> import ����
		
		DecimalFormat def = new DecimalFormat("##.####");
		System.out.println(def.format(10.1231213123123));
		
		double a = 12312.444;
		System.out.println(new DecimalFormat("#.######").format(a));
		System.out.println(new DecimalFormat("0.0000E0").format(a));//���� ǥ��
		System.out.println(new DecimalFormat("0.0").format(a));
		System.out.println(new DecimalFormat("0.000000").format(a));//���� ���� �߰��� 0�� �ٴ´�.
		
		String name = "������";
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
