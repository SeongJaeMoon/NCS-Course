package com.test;

public class sample_05 {

	public static void main(String[] args) {
		//�ݺ��� �׽�Ʈ
		//1���� 100������ ���� �ջ��� ����� ���(5050)
		//1 + 2 + ... + 100
		//�ʱ� ���� 0���� 1���� 100������ ���� �ݺ� �ջ�
		//� ���� (+ � ��) ������ �ݺ� ����
		int temp = 0;
		for(int i=1; i <=100; i++) {
			temp += i;
		}
		System.out.println(temp);
		
		int sum = 0;
		int i = 0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
