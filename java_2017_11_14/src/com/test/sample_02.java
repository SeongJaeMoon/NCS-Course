package com.test;

public class sample_02 {

	public static void main(String[] args) {
		//ũ�� 1�� �ٱ��� 1���� �迭�� ũ��
		/*
		 * ũ��2�� ����
		 * �ٱ��� �迭�� ��ҿ� ���� ������ 1���� �迭�� �����Ѵ�.
		 * ���� 1���� �迭�� ũ��� ���� �ٸ��� �����Ѵ�.
		 */
		int[][] arr = new int[2][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		//�ڵ��ʱ�ȭ ����
		//[0][0], [0][1], [1][0], [1][1], [1][2]
		
		//2���� �迭�� �����ϱ� ������ ��� �ε��� ������ �ٸ����!
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
