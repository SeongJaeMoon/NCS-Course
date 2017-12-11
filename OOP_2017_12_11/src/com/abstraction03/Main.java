package com.abstraction03;

public class Main {

	public static void main(String[] args) {
		//강한 결합 설정 테스트
		
		//Sample 객체에서 사용할 SubClass01 객체 생성
		SubClass01 sub = new SubClass01();
		
		//생성자를 이용한 Sample 객체 전달
		Sample obj = new Sample(sub);
		
		//SubClass01 객체 확인
		System.out.println(obj.getSub());
		
		obj.method();
	}

}
