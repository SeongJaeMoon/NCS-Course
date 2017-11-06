package com.test;

public class sample017 {
	
	public static void main(String[] args) {
		//복합 대입 연산자
		//+=, -=, *=, %=, &=, !=, ^=, <<=, >>=, >>>=
		//산술 연산의 결과를 자기 자신에게 다시 대입함.
		
		int a = 10;
		int b = 20;
		a +=b;
		System.out.println(a);
		a *=b;
		System.out.println(a);
		a -=b;
		System.out.println(a);
		a%=b;
		System.out.println(a);
		a^=b;
		System.out.println(a);
		a<<=b;
		System.out.println(a);
		a/=b;
		System.out.println(a);
		
	}
}
