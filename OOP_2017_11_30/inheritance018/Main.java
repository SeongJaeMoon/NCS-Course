package com.inheritance018;

public class Main {

	public static void main(String[] args) {
		
		//자식 클래스 객체 생성 및 멤버 확인
		SubClass sub = new SubClass();
		
		sub.method1(); //SuperClass
		sub.method2(); //SubClass
		
	}

}
