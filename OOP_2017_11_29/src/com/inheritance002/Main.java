package com.inheritance002;

public class Main {

	public static void main(String[] args) {
		
		//�ڽ� Ŭ������ ��ü ���� �� ��� Ȯ��
		SubClass sub = new SubClass();
		System.out.println(sub.field1);//SuperClass
		System.out.println(sub.field2);
		sub.method1();//SuperClass
		sub.method2();
	}

}
