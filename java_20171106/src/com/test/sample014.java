package com.test;

public class sample014 {
	
	public static void main(String[] args) {
		//비교 연산자
		// ==, !=, >, <, >=, <=
		int a = 10;
		int b = 10;
		int c = 15;
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		//비교 연산자 주의사항
		//double과 float 자료형의 비교
		
		 float fl=0.1f;
		 double dou = 0.1;
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(fl==dou);
		 System.out.println(fl==(float)dou);
		 System.out.println((int)fl == (int)dou);
	}
}
