package com.test;

public class sample_05 {

	public static void main(String[] args) {
	
		//배열에 임의의 수(난수 0~100) 여러개(5개)를 준비하고, 합, 평균 계산해서 출력하는 코드 작성.
		//입력 -> 처리 -> 출력 구분 짓기 
		int [] arr1 = new int[5];
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			int random1 = (int)(Math.random()*101);
			arr1[i] = random1;
			sum += arr1[i];
			System.out.printf("arr1[%d] : %d%n", i ,arr1[i]);	
		}
		System.out.printf("%n 배열 요소의 합은 : %d%n 평균은 : %.1f", sum, sum/(double)arr1.length);	
	}
}
