package com.inheritance005;

public class SubClass extends SuperClass {

	//�θ� ���� �޼ҵ� �ñ״�ó�� ������ ������ �޼ҵ� ����
	public void method() {
		super.method();
		//System.out.println("SubClass�� method() ȣ��");
	//SuperClasss�� method()�� ȣ��Ƿ��� super Ű���� ���	
	}
	public void method1() {
		
	}
	public void method2() {
		//���� ��ü�� �ٸ� ��� ���ٽ� ���
		//->this
		this.method1();
	}
}
