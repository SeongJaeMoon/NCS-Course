package com.nestedclass2;

public class Outer {
	
	public void method1() {
		System.out.println("OuterClass�� method1");
	}
	
	public static void method2() {
		System.out.println("OuterClass�� static method2");
	}
	
	//�ν��Ͻ� ��� Ŭ����
	//- static Ű���尡 �����ϸ� �� �ȴ�.
	//- ��� ������ ���� ��� ���� �Ұ�
	class InstanceInnerClass{
		
		//OuterClass�� ��� ���� �׽�Ʈ
		//->OuterClass�� ��� ��� ���� ����
		void method() {
			method1();
			method2();
		}
	}
	
	//���� ��� Ŭ����
	//-static Ű���尡 ���� �� �� �ִ�.
	//-��� ������ ���� ��� ���� ����
	static class StaticInnerClass{
		
		//OuterClass�� ��� ���� �׽�Ʈ
		//->OuterCLass�� ���� ����� ���� ����
		static void method() {
			method2();
		}
	}
}
