package com.test;

import java.util.Arrays;

public class sample_01 {

	public static void main(String[] args) {

		// �迭 ��� ����
		// ���� : ��Ҹ� ũ������� �����ϴ� ����, (�������� or ��������)
		// ���� �˰���(Bubble)�� ������ ����
		// Arrays Ŭ������ sort() �޼ҵ�

		/*
		 * 1. �迭 ��ҿ� ���ĵ��� ���� �⺻�ڷ��� ��� �غ� -> 5��. 2. �� ������ ��Ҹ� ��. 3. (if ���������� ���, ���� ��Ұ�
		 * ũ��, ������ ��Ұ� ���� ��� ��ȯ). �׷��� ���� ��� ���. 4. �񱳿� ��ȯ �׼��� �迭 ��� ��ü�� ���ؼ� ������ ������ �ݺ�.
		 * 0-1, 1-2, 2-3, 3-4, ... 5. �迭 ��� ��ü�� ���� ��, ��ȯ �׼� �� �� ������ ���¸� 1ȸ��. 6. �迭 ���
		 * �߿��� ���� ū ���� ���� �����ʿ� ��ġ�Ѵ�. 7. 2��~6�� ������ �ݺ�. ��, ���� ������ �� ���� ����(������ ���� ���� ����).
		 * 8. �� ����� �������� �ݺ� ����.
		 */
		int[] a = {5,3,2,1,4};
		// ���� �� ���
		for (int b : a) {
			System.out.print(b);
		}
		System.out.println();
		// ���� ����
		/*
		 * if(arr[n] > arr[n+1] int temp = arr[n]; arr[n] = arr[n+1]; arr[n+1] = temp;
		 * n�� 0,1,2,3, ...., ������ ��(�迭 ����� ���� - 2)
		 * if(a[n] > a[n+1]){
		 * 	int temp = arr[n+1];
		 * 	arr[n+1] = arr[n];
		 * 	arr[n] = temp;
		 * }
		 */
		int temp = 0;
		for (int i = 0; i < a.length-1; i++) {// ȸ����
			for (int j = i; j < a.length; j++) {//ȸ���� �� ���ؼ� ����
				// System.out.printf("i[%d]: %d, j[%d]: %d%n",i, a[i], j, a[j]);
				if (a[i] > a[j]) {
					System.out.printf("ȸ��: %d [%d <��ȯ> %d]%n", i+1, a[i], a[j]);
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

		/*for(int i = 1; i < a.length; ++i) {
			for(int j = 0; j < a.length-i; ++j) {
				if (a[j] > a[j+1]) {
					//System.out.printf("ȸ��: %d [%d <��ȯ> %d]%n", i, a[i], a[j]);
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}*/
		
		// ���� �� ���
		for (int b : a) {
			System.out.print(b);
		}
	}
}
