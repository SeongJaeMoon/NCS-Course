package com.polymorphism;

public class Main {

	public static void main(String[] args) {
		D d1 = new D();
		B d2 = new D();
		//IS-A 관계가 아닌 자료형 변수에 저장 불가
		//C d3 = new D();
		
		Object d4 = new D();
		
	}
}
