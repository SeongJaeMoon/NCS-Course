package com.test;

public class sample_10 {

	public static void main(String[] args) {
		// 제어문 for
		// 반복문 일정한 패턴을 가진 실행문을 여러번 반복
		/*
		 * for(initialization; boolean_expression; increment){ //statement }
		 */
		// 0부터 9까지 출력
		// 0부터 x의 값이 변화 되는 횟수가 10번
		for (int x = 0; x < 10; x++) {
			System.out.print(x); // 0,2,3...9
		}
		// 0부터 10까지 출력
		// 0부터 x의 값이 변화 되는 횟수가 11번
		for (int x = 0; x <= 10; x++) {
			System.out.print(x); // 0,2,3...10
		}
		// 1부터 9까지 출력
		// 1부터 x의 값이 변화 되는 횟수가 10번
		for (int x = 1; x < 10; x++) {
			//System.out.print(x); // 1,2,3...9
		}
		/*for (int x = 1; x < 10; --x) {
			System.out.print(x); // 1,2,3...21억
		}*/
		for (int x = 10; x > 0; x--) {
			System.out.println(x); // 1,2,3...9
		}
	}
}
