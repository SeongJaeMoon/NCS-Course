package com.test;

public class sample_06 {

	public static void main(String[] args) {
		//�ݺ��� �׽�Ʈ
		//����) 1���� 100������ �� �߿��� Ȧ���� ���.
		//1���� �����ϵ�, 2�� �����ϸ鼭 ���
		//���ڰ� ���� ������ �ؼ� ���ϱ� ����(������ �켱����)
		
		for(int i = 1; i <= 100; i+=2) {
			System.out.print(" " + i);
		}
		
		System.out.print('\n');
		
		int j = 1;
		while(j <= 100) {
			System.out.print(" " + j);
			j+=2;
		}
	}
}
