package com.test;

import java.util.Arrays;

public class sample_07 {

	public static void main(String[] args) {
		
		//���� �������� ��Ҹ� ���� int �ڷ��� �迭���� ���� ū �� ����ϴ� �ڵ��ۼ�.
		//���� ���� �˰��� 1ȸ�� ���� ��, ���� ���� �� ��Ҹ� ��´�.
		//Arrays.sort�޼ҵ� ���� ��, ���� ���� �� ��Ҹ� ��´�.
		int [] arr = new int[5];
		StringBuilder sb = new StringBuilder();
		//----�Է�----
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);

		}
		//----ó��----
		int temp = 0;
		for(int i = 0; i < arr.length-1; i++ ) {
			if(arr[i] > arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
			}
		}
		//----���----
		System.out.println(Arrays.toString(arr));
		System.out.printf("�ִ밪 : %d", arr[4]);
	}
}
