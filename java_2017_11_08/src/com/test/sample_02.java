package com.test;

public class sample_02 {

	public static void main(String[] args) {
		
		//�ݺ��� while
		//�ݺ��� : ������ ������ ���� ���๮�� ������ �ݺ� �����ϰ��� �� �� ���.
		/*
		 * for(initialize; Boolean_expression; increment){
		 * 	//statements
		 * }
		 * initialization;
		 * while(Boolean_expression){
		 * 	//statements
		 * 	update;
		 * }
		 */
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1~100������ �� :"+ sum);
		
	}
}
