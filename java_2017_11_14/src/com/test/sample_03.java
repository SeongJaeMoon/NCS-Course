package com.test;

public class sample_03 {

	public static void main(String[] args) {
		// Ÿ���� �迭(�迭�� �迭)
		// 1���� �迭�� ��ҷμ� �� �ٸ� 1���� �迭�� ����ִ� ����.
		/*
		 * �ڷ���[][]���� = {{��1,��2,��3,}, {��4,��5,��6}...},...};
		 * �迭�� �迭���� ũ��� ���� {}�� ������ ���� ������ �����ȴ�. 
		 */
		int[][] arr = {{1,2,3},{4,5,6,7}};
		//�ٱ��� �迭�� ũ��
		System.out.println(arr.length);
		
		//���� �迭�� ũ��
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		//�ε��� ����
		//[0][0], [0][1], [0][2], ...[1][3]

	}
}
