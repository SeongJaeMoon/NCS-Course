package com.nestedclass;

public class OuterClass {
	//��ø Ŭ����
	/*
	 - Ŭ���� ���� ���ο� �� �ٸ� Ŭ���� ������ ���Ե� Ŭ����
	 - �Ϲ������� Ŭ���� ����� �ʵ�� �޼ҵ�(������ ����)�� �����ȴ�.
	 - ��ø Ŭ���� �з�
	 
	 1. inner classes - inner class, method local inner class, anonymous inner class�� ���з�
	 2. static nested class 
	 
	 */
	//�ν��Ͻ� ��� Ŭ����
	//- static Ű���� ���� ����� ��ø Ŭ����
	//- ���ο����� ����� �������� �����ϱ� ������ �ַ� private ����
	//- ��ü ������ OuterClass�� ��ü�� �����Ǿ�� InnerClass�� ��ü ���� ����
	private class InnerClass{
		//����)�ܵ� ��ü ���� �Ұ�
		//�ڱ⸸�� ������ �ʵ�, �޼ҵ� ���� ����
		void innerMethod() {
			System.out.println("�ȳ� ���� InnerMethod��� ��~");
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
		//�ڱ⸸�� ������ �ʵ�, �޼ҵ� ����
		//����) ���� ����� ���� �� ����.
		public void innerMethod() {
			System.out.println("�ȳ� ���� InnerMethod��� ��~");
		}
	}
	
	 static class InnerClass2{
		//�ν��Ͻ� ���
		void method2() {
			System.out.println("InnerClass�� method2!");
		}
		//static ���
		static void method1() {
			System.out.println("innerClass�� static method1!");
		}
		
	}
}
