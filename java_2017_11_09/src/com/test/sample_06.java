package com.test;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class sample_06 {

	public static void main(String[] args) {

		//StirngBuilder Ŭ����
		//�Ϲ����� String Ŭ������ �̿��� ���ڿ� ���� ������ �޸𸮿� ������ ��ü�� ���� �߻���Ų��.
		//���ڿ��� �Һ� Ư�� �����̴�.
		//���� ���, "ABC + DEF" => "ABCDEF" ���� ����� "ABC" ���ڿ��� ������ ��ü�� �ǰ�, "ABCDEF" ��ü�� ��ȯ�ȴ�.
		//-> StringBuilder Ŭ������ append() �޼ҵ带 �̿��ϴ� ���� ����.
		
		StringBuilder sb = new StringBuilder();
		
		String[]arrA = {"abc","def","ghi","jkl","mno"};
		String result = "";
		
		for(int i = 0; i < arrA.length; i++) {
			result += String.format("%d %s%n", i+1, arrA[i]);
		}
		System.out.println(result);
		
		for(int i = 0; i < arrA.length; i++) {
			sb.append(String.format("%d %s%n", i+1, arrA[i]));
		}
		System.out.println(sb.toString());
	}
}
