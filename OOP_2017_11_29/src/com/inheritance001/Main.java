package com.inheritance001;

public class Main {

	public static void main(String[] args) {
		//�ڽ� Ŭ������ ��ü ����
		SubClass sub = new SubClass();

		//�ڽ� Ŭ������ ��ü�� ������ instance ��� Ȯ�� -> dot(.)������
		//toString() - ��ü�� ������ ��ȯ�ϴ� �޼ҵ�
		//����� ������ ���� �޼ҵ� Ȯ�� -> Object Ŭ����
		System.out.println(sub.toString());
		
		//method() - SuperClass�� ���� ���
		//����� ���� 
		sub.method();
	}

}
