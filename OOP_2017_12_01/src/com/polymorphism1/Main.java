package com.polymorphism1;

//���� �׽�Ʈ Ŭ����
public class Main {

	public static void main(String[] args) {
		SuperClass sup = new SubClass();
		sup.method1();
		
		//���� �ڷ��� ������ ����� ���� �ڷ��� ��ü ���� ����
		//->����(�����) ����ȯ
		//->���� �ڷ��� Ŭ������ �޼ҵ� ���� ����
		SubClass sub2 = (SubClass)sup;
		sub2.method1();
		sub2.method2();
		
	}
}
