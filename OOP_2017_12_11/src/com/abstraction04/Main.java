package com.abstraction04;

public class Main {

	public static void main(String[] args) {
		//강한 결합 설정 테스트
		
		//Sample 객체에서 사용할 SubClass01 객체 생성
		SubClass01 sub = new SubClass01();
		SubClass02 sub2 = new SubClass02();
		//생성자를 이용한 Sample 객체 전달
		//주의) Super 인터페이스를 구현한 모든 자식 클래스를 객체로 전달 가능
		Sample obj = new Sample(sub);
		Sample obj2 = new Sample(sub2);
		//SubClass01 객체 확인
		System.out.println(obj.getSub());
		System.out.println(obj.getSub());
		obj.method();
		obj2.method();
		
		Super sub3 = new SubClass02();
		sub3.method();
		sub3.method1();
		SubClass02 sub4 = (SubClass02)sub3;
		sub4.method2();
	}
}
