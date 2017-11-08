package com.test;

public class sample_10 {

	public static void main(String[] args) {
		//반복문 테스트
		//break -> 특정 반복 상황에서 반복 탈출(블럭 탈출)
		//반복문 내부와 switch 구문 안에서만 사용 가능
		//중첩된 반복문인 경우 한 번의 블럭만 탈출 가능
		//일반적으로 무한반복 구문에서 특정 조건 만족시 탈출 구문으로 사용
		int count = 0;
		while(true) {
			System.out.println("무한실행 상태...");
			count++;
			if(count > 10) {
				System.out.print("블럭 탈출!");
				break;
			}
		}
		//정상적으로 프로그램 종료 가능
		//무한실행 블럭 내부에 break; 키워드가 없다면 Unreachable code
	}
}
//출력결과
/*

 */