package com.test;

public class sample_11 {

	public static void main(String[] args) {
		//continue Ű����
		//�ݺ��� ���ο��� ���๮�� �������� �ʰ� ���� �ݺ����� �̵��� �� ���
		//�ݺ��� ����� Ư�� ������ �����ϴ� ���� ���๮���� �����Ѵ�.
		/*
		 * for(initializtion; Boolean_expression; increment){
		 * 		if(����)continue;
		 * 		//Statements;
		 * }
		 */
		
		//1���� 100������ ���� ����ϵ�, ��, 10�� ����� ����.
		//����� ���� -> �� ���� ���� ó�� ����.
		String result = "";
		for(int i = 0; i <= 100; i++) {
			if(i%10 == 0)continue;
			result += " " + i + '\n';
		}
		System.out.print(result);
		
	}
}
//��°��
/*

 */