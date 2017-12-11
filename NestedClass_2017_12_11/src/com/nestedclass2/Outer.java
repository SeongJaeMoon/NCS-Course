package com.nestedclass2;

public class Outer {
	
	public void method1() {
		System.out.println("OuterClass의 method1");
	}
	
	public static void method2() {
		System.out.println("OuterClass의 static method2");
	}
	
	//인스턴스 멤버 클래스
	//- static 키워드가 존재하면 안 된다.
	//- 멤버 구성시 정적 멤버 구성 불가
	class InstanceInnerClass{
		
		//OuterClass의 멤버 접근 테스트
		//->OuterClass의 모든 멤버 접근 가능
		void method() {
			method1();
			method2();
		}
	}
	
	//정적 멤버 클래스
	//-static 키워드가 존재 할 수 있다.
	//-멤버 구성시 정적 멤버 구성 가능
	static class StaticInnerClass{
		
		//OuterClass의 멤버 접근 테스트
		//->OuterCLass의 정적 멤버만 접근 가능
		static void method() {
			method2();
		}
	}
}
