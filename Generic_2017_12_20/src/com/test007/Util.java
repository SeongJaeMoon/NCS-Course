package com.test007;

public class Util<T> {
	
	private T[] array;
	
	public T[] getArray(int size) {
		
		//Ÿ�� �Ķ���� �ڷ����� ������ �迭 �����
		//new T[ũ��] ���·� �������� ���ϰ�,
		//(T[])(new Object[ũ��]) ���·� �����ؾ� �Ѵ�.
		this.array = (T[])(new Object[size]);
		return this.array;
	}

}
