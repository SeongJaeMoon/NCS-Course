package com.test;

public class sample_08 {

	public static void main(String[] args) {
		//1���� 100������ ���� �뿡 �ջ��� ����ϵ�, �Ʒ� ���·� ���.
		// ��¿�)
		/*
		 * �� �ٴ� 10 ���� 1���� 100������ ���� �������� ��Ÿ����
		 */
		int sum = 0;
		String result = "";
		for (int i = 1; i <= 100; i++) {
			sum += i;
			result += " " + i;
			if (i % 10 == 0) {
				result += '\n';
			}
		}
		System.out.print(result);
		System.out.print("-----------------\n");
		System.out.print("�ջ� ���: " + sum);
	}
}
