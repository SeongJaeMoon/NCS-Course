package com.abstraction04;

public class Main {

	public static void main(String[] args) {
		//���� ���� ���� �׽�Ʈ
		
		//Sample ��ü���� ����� SubClass01 ��ü ����
		SubClass01 sub = new SubClass01();
		SubClass02 sub2 = new SubClass02();
		//�����ڸ� �̿��� Sample ��ü ����
		//����) Super �������̽��� ������ ��� �ڽ� Ŭ������ ��ü�� ���� ����
		Sample obj = new Sample(sub);
		Sample obj2 = new Sample(sub2);
		//SubClass01 ��ü Ȯ��
		System.out.println(obj.getSub());
		System.out.println(obj.getSub());
		obj.method();
		obj2.method();
		
		Super sub3 = new SubClass02();
		sub3.method();
		sub3.method1();
		SubClass02 sub4 = (SubClass02)sub3;
		sub4.method2();
	}
}
