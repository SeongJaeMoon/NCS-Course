package com.abstraction03;

public class Main {

	public static void main(String[] args) {
		//���� ���� ���� �׽�Ʈ
		
		//Sample ��ü���� ����� SubClass01 ��ü ����
		SubClass01 sub = new SubClass01();
		
		//�����ڸ� �̿��� Sample ��ü ����
		Sample obj = new Sample(sub);
		
		//SubClass01 ��ü Ȯ��
		System.out.println(obj.getSub());
		
		obj.method();
	}

}
