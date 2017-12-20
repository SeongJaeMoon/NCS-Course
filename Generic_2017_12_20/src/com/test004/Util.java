package com.test004;


public class Util {
	
	//���׸� �޼ҵ�
	/*
	- �⺻ ����(�޼ҵ��� ���)
	- ��ȯ�ڷ���, �Ű����� ��Ͽ� Ÿ�� �Ķ���� ǥ���� �ִ� ���
	public <T> ��ȯ�ڷ���<T> �޼ҵ��(T ������) {
	}
	*/
	
	public static <T> Box<T> boxing(T t) {
		
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
		
	}
	
	
	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		//Ű�� ���� ��� ���� ��츸 ���� ��ü�� ����
		return keyCompare && valueCompare;
		
	}

}