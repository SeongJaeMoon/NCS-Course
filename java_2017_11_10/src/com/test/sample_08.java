package com.test;

public class sample_08 {

	public static void main(String[] args) {

		// �迭 ���� ���ǻ���
		// �ʱ�ȭ���� ���� �迭 ��� �Ұ�
		// �迭 ���� �ϰ� �������� ���� ���´� null�� ������ �ִ� �����̴�.

		int[] arr1;
		// System.out.println(arr1[0]); <- �� �Ǵ� �ڵ�(���� ������ �ʱ�ȭ ���� �ʾҽ��ϴ�.)
		arr1 = new int[5];
		System.out.println(arr1[0]);
		arr1[0] = 10;
		System.out.println(arr1[0]);

	}
}
