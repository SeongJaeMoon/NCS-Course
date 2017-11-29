package com.inheritance005;

public class SubClass extends SuperClass {

	//부모가 가진 메소드 시그니처와 동일한 상태의 메소드 선언
	public void method() {
		super.method();
		//System.out.println("SubClass의 method() 호출");
	//SuperClasss의 method()가 호출되려면 super 키워드 사용	
	}
	public void method1() {
		
	}
	public void method2() {
		//현재 객체의 다른 멤버 접근시 사용
		//->this
		this.method1();
	}
}
