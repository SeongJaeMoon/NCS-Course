package com.test;

import java.util.Arrays;

public class sample_08 {

	public static void main(String[] args) {
		
		//���� �������� ��Ҹ� ���� int �ڷ��� �迭���� ���� ū �� ����ϴ� �ڵ��ۼ�.
		//���� ���� �˰��� 1ȸ�� ���� ��, ���� ���� �� ��Ҹ� ��´�.
		//Arrays.sort�޼ҵ� ���� ��, ���� ���� �� ��Ҹ� ��´�.
		int [] arr = new int[5];
		//----�Է�----
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			
		}
		//----ó��----
		Arrays.sort(arr);
		//----���----
		System.out.println(Arrays.toString(arr));
		System.out.printf(String.format("�ּҰ�: %d �ִ밪: %d", arr[0], arr[4]));
	}
}
