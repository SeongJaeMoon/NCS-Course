package com.test;

import java.util.Arrays;

public class sample_04 {

	public static void main(String[] args) {
		
		//�迭�� ��Ұ� ä���
		//�ڵ� �ʱ�ȭ
		int []arr1 = new int[5];
		
		//���� �ڷ�� ��� ä���
		Arrays.fill(arr1, 10);
		
		//�迭 ��� ���
		System.out.println(Arrays.toString(arr1));
		
		//������ ������ ��� ä���
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*101);
		}
		System.out.println(Arrays.toString(arr1));
		
	}
}
