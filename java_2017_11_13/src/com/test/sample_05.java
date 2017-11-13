package com.test;

import java.util.Arrays;

public class sample_05 {

	public static void main(String[] args) {

		// �迭�� ����
		// ���� ����(���� �ּҸ� ����� ����), ���� ����(���� �ּ� �� ���� �ڷ���� ����� ����)
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = arr1; // ���� ����

		System.out.println(arr1[0]);
		System.out.println(arr2[0]);

		++arr1[0];// arr1, arr2 0��° �迭 ���� ���� �ٲ�

		System.out.println(arr1[0]);
		System.out.println(arr2[0]);

		int[] arr3 = new int[arr1.length]; // ũ��� ���ų� Ŀ���Ѵ�.
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));

		++arr1[0];

		System.out.println(arr1[0]);
		System.out.println(arr3[0]);

		int[] arr4 = Arrays.copyOf(arr1, arr1.length);// 1���� �迭�� �� ���� ����, ������ �迭�� �� ���� ����!

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr4));

		++arr1[0];

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr4));
		
		/*
		 * ��� 
		 * 10 
		 * 10 
		 * 11 
		 * 11 
		 * [11, 20, 30, 40, 50] 
		 * [11, 20, 30, 40, 50] 
		 * 12 
		 * 11 
		 * [12, 20, 30, 40, 50] 
		 * [12, 20, 30, 40, 50] 
		 * [13, 20, 30, 40, 50] 
		 * [12, 20, 30, 40, 50]
		 */
	}
}
