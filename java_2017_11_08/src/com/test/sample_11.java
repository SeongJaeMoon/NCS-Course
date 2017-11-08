package com.test;

public class sample_11 {

	public static void main(String[] args) {
		//continue 키워드
		//반복문 내부에서 실행문을 실행하지 않고 다음 반복으로 이동할 때 사용
		//반복문 진행시 특정 조건을 만족하는 경우는 실행문에서 제외한다.
		/*
		 * for(initializtion; Boolean_expression; increment){
		 * 		if(조건)continue;
		 * 		//Statements;
		 * }
		 */
		
		//1부터 100까지의 수를 출력하되, 단, 10의 배수는 제외.
		//대안이 있음 -> 안 쓰고 조건 처리 가능.
		String result = "";
		for(int i = 0; i <= 100; i++) {
			if(i%10 == 0)continue;
			result += " " + i + '\n';
		}
		System.out.print(result);
		
	}
}
//출력결과
/*

 */