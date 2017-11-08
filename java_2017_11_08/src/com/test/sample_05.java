package com.test;

public class sample_05 {

	public static void main(String[] args) {
		//반복문 테스트
		//1부터 100까지의 수를 합산한 결과를 출력(5050)
		//1 + 2 + ... + 100
		//초기 값에 0에서 1부터 100까지의 수를 반복 합산
		//어떤 수에 (+ 어떤 값) 연산을 반복 수행
		int temp = 0;
		for(int i=1; i <=100; i++) {
			temp += i;
		}
		System.out.println(temp);
		
		int sum = 0;
		int i = 0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
