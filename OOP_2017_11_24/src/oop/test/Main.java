package oop.test;

public class Main {

	public static void main(String[] args) {
		
		//��ǥ���� static �ʵ��� ��� �׽�Ʈ
		//Math Ŭ������ ����� PI�� ���
		//Ŭ������.�ʵ��
		//->new �����ڿ� ���� ��ü ���� ���ʿ�
		System.out.println(Math.PI);
		
		//Math Ŭ������ ��ǥ���� static �޼ҵ� �׽�Ʈ
		//Ŭ������.�޼ҵ��()
		//->new �����ڿ� ���� ��ü ���� ���ʿ�
		//0.0�̻� ~ 1.0 �̸��� �Ǽ� ����
		System.out.println(Math.random());
		//->���� ���� ���� Ŭ���� java.util.Random Ŭ���� ��� ����
		
		//Sample Ŭ������ static �޼ҵ� �׽�Ʈ
		//->�ñ״�ó �м� -> public static void method()
		Sample.method();
	}
}
