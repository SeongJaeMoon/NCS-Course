package com.test;

public class sample_06 {

	public static void main(String[] args) {
		//반복문 테스트
		//문제) 1부터 100까지의 수 중에서 홀수만 출력.
		//1부터 증가하되, 2씩 증가하면서 출력
		//문자가 먼저 나오게 해서 더하기 연산(연산자 우선순위)
		
		for(int i = 1; i <= 100; i+=2) {
			System.out.print(" " + i);
		}
		
		System.out.print('\n');
		
		int j = 1;
		while(j <= 100) {
			System.out.print(" " + j);
			j+=2;
		}
	}
}
