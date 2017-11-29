package com.inheritance005;

public class Main {
	
	public static void main(String[]args) {
		
		//자식 클래스의 객체 생성 및 멤버 호출
		SubClass sub = new SubClass();
		
		//SubClass 메소드 호출
		sub.method(); //SubClass의 method()호출
	}
}
