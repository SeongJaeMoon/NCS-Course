package com.test;

public class sample_01 {

	public static void main(String[] args) {
		
		//중첩 for문
		//for문 내부에 또 다른 for문이 중첩된 상태
		//주의) 바깥쪽 for문 한 번 실행될 때 안쪽 for문 여러번 실행되는 상태가 된다.
		//주의) 바깥쪽 for문의 변수와 안쪽 for문의 변수는 서로 달라야 한다.
		/*
		 * for(initialize; Boolean_expression; increment){
		 * 		for(initialize; Boolean_expression; increment){
		 * 			//Statements
		 * 		}
		 * 	}
		 */
		
		for(int i = 0; i <11; i++) {
			for(int j = 0; j <11; j++) {
				//1부터 10까지의 수를 출력
				//변수 j의 값이 변화되는 횟수가 10번
				System.out.print("value of j: " + j);
			}
			System.out.print('\n');
		}
	}

}
