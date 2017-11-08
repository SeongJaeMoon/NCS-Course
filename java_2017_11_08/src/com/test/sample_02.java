package com.test;

public class sample_02 {

	public static void main(String[] args) {
		
		//반복문 while
		//반복문 : 일정한 패턴을 가진 실행문을 여러번 반복 실행하고자 할 때 사용.
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
		System.out.println("1~100까지의 합 :"+ sum);
		
	}
}
