package com.test;

public class sample015 {
	
	public static void main(String[] args) {
		//비교 연산자 주의사항
		//char, int 자료형 비교
		char  a ='A';
		int b = 65;
		char c = 'B';
		//int vs char => int vs int
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a>c);
		System.out.println(a<c);
		//boolean 자료형은 크기 비교 불가
		boolean x = true;
		boolean y = false;
		System.out.println(x==y);
		//System.out.println(x>y);
		//System.out.println(x<y);
		
	}
}
