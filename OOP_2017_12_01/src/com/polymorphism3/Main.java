package com.polymorphism3;

//���� �׽�Ʈ Ŭ����
public class Main {

	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
		sub.add(10);
		sub.add(12.34);
		sub.add(20);
		System.out.println(sub.list());
	}
}
