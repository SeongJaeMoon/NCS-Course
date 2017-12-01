package com.polymorphism1;

//실행 테스트 클래스
public class Main {

	public static void main(String[] args) {
		SuperClass sup = new SubClass();
		sup.method1();
		
		//상위 자료형 변수에 저장된 하위 자료형 객체 접근 가능
		//->강제(명시적) 형변환
		//->하위 자료형 클래스의 메소드 접근 가능
		SubClass sub2 = (SubClass)sup;
		sub2.method1();
		sub2.method2();
		
	}
}
