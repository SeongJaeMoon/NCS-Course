package com.test;

public class sample_02 {

	public static void main(String[] args) {
		/*
		 * ���ڴ� char, ���ڿ��� String
		 * ���ڴ� 'A', ���ڿ��� "TEST"
		 * Ŭ������ �޼ҵ带 �����Ѵ�.
		 * ��ü�� ����� ����.�޼ҵ�()
		 */
		
		char a = 'A';
		System.out.println(a);
		
		String b= "A";
		System.out.println(b.toString());
		
		//charAt() �޼ҵ� : Ư�� ��ġ(Index, 0���� ����) ���� ��ȯ
		String e = "abcdef";
		String f = "I do love you!";
		char result = e.charAt(5);
		System.out.println(result);
		result = f.charAt(5);
		System.out.println(result);
		
	}
}
