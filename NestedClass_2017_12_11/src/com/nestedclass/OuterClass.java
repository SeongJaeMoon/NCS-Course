package com.nestedclass;

public class OuterClass {
	//중첩 클래스
	/*
	 - 클래스 선언 내부에 또 다른 클래스 선언이 포함된 클래스
	 - 일반적으로 클래스 멤버는 필드와 메소드(생성자 포함)로 구성된다.
	 - 중첩 클래스 분류
	 
	 1. inner classes - inner class, method local inner class, anonymous inner class로 세분류
	 2. static nested class 
	 
	 */
	//인스턴스 멤버 클래스
	//- static 키워드 없이 선언된 중첩 클래스
	//- 내부에서만 사용할 목적으로 선언하기 때문에 주로 private 지정
	//- 객체 생성시 OuterClass의 객체가 생성되어야 InnerClass의 객체 생성 가능
	private class InnerClass{
		//주의)단독 객체 생성 불가
		//자기만의 고유한 필드, 메소드 구성 가능
		void innerMethod() {
			System.out.println("안녕 나는 InnerMethod라고 해~");
		}

	}
	
	public void method() {
		InnerClass inner = new InnerClass();
		inner.innerMethod();
		
		InnerClass2 inner2 = new InnerClass2();
		InnerClass2.method1();
		inner2.method2();
	}
	
	class MethodLocalInnerClass{
		//자기만의 고유한 필드, 메소드 구성
		//주의) 정적 멤버를 가질 수 없다.
		public void innerMethod() {
			System.out.println("안녕 나는 InnerMethod라고 행~");
		}
	}
	
	 static class InnerClass2{
		//인스턴스 멤버
		void method2() {
			System.out.println("InnerClass의 method2!");
		}
		//static 멤버
		static void method1() {
			System.out.println("innerClass의 static method1!");
		}
		
	}
}
