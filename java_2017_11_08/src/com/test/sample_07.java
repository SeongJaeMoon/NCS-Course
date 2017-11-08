package com.test;

public class sample_07 {

	public static void main(String[] args) {
		//반복문 테스트
		//문제) 1부터 100까지의 수 중에서 3의 배수만 출력
		//1부터 100까지의 수 중에서 3의 배수를 만족하는 수를 출력
		//반복문(1부터 100까지의 수 변화) + if문(3의 배수 검사)
		//입력 - 연산 - 출력 분리시키기
		String result = "";
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				result += " " + i;
			}
		}
		System.out.print(result);
	}
}
