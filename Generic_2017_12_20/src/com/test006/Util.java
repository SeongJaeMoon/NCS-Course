package com.test006;

public class Util {
	
	//���ϵ� ī��(?) Ÿ�� �Ű�����
	
	//�Ű����� ��Ͽ� Box<T> �ڷ����� ������ ���� ����
	//->Box<?> ���·� �ڷ��� ���� �ʿ�
	//->?�� ��� �ڷ����� �����ϴٴ� �ǹ�
	public static String getString1(Box<?> t) {
		return t.toString();
	}

	//�Ű����� ��Ͽ� Box<T> �ڷ����� ������ ���� ����
	//->Box<? extends Number> ���·� �ڷ��� ���� �ʿ�
	//->? extends Number�� ���ѵ� ������ �ڷ����� �����ϴٴ� �ǹ�
	public static String getString2(Box<? extends Number> t) {
		return t.toString();
	}

	//�Ű����� ��Ͽ� Box<T> �ڷ����� ������ ���� ����
	//->Box<? super Integer> ���·� �ڷ��� ���� �ʿ�
	//->? super Integer�� ���ѵ� ������ �ڷ����� �����ϴٴ� �ǹ�
	public static String getString3(Box<? super Integer> t) {
		return t.toString();
	}

}
