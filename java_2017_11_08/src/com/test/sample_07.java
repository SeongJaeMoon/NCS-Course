package com.test;

public class sample_07 {

	public static void main(String[] args) {
		//�ݺ��� �׽�Ʈ
		//����) 1���� 100������ �� �߿��� 3�� ����� ���
		//1���� 100������ �� �߿��� 3�� ����� �����ϴ� ���� ���
		//�ݺ���(1���� 100������ �� ��ȭ) + if��(3�� ��� �˻�)
		//�Է� - ���� - ��� �и���Ű��
		String result = "";
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				result += " " + i;
			}
		}
		System.out.print(result);
	}
}
