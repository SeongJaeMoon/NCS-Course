package com.test;

public class sample_10 {

	public static void main(String[] args) {
		
		//�⺻ �ڷ��� -> ���ڿ���(�����ڷ���)
		//���ڿ���(�����ڷ���)->�⺻�ڷ���
		
		//����(�����) ����ȯ�� �⺻�ڷ������� ��ȯ�� ���
		//�⺻�ڷ���1 ���� = (�⺻�ڷ���1)�⺻�ڷ���2;
		
		//���ڿ���(�����ڷ���)->�⺻�ڷ���
		//int ���� = Integer.parseInt(���ڿ���);
		//double ���� = Double.parseDouble(���ڿ���);
		//����) ���ڿ��� ���ڷ� ��ȯ ������ ���ڿ��� ��ȯ. ���� ���, "1234"�� 1234�� ������, "TEST"�� ��ȯ�� ����.
		
		String[]arr = {"10", "20", "30"};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			//���ڿ��� �⺻�ڷ����� + ������ ���ڿ�
			//���ڿ� ����� int�ڷ��� ������ ���� �� �� ����.
			sum += Integer.parseInt(arr[i]);
		}
		System.out.printf("%d", sum);
	}
}
