package com.test003;

public class Main {

	public static void main(String[] args) {
		//���׸� Ŭ���� Box<T>�� ���� ��ü ���� �׽�Ʈ
		//->Ÿ�� �Ķ���� T�� ���� �ڷ��� ���� �ʿ�
		
		Box<String> box1 = new Box<String>();
		box1.setT("123");
		System.out.println(box1.getT()); //String
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(123);
		System.out.println(box2.getT()); //Integer
	}

}
