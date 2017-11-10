package com.test;

public class sample_06 {

	public static void main(String[] args) {
	
		//배열에 임의의 수(난수 0~100) 여러개(5개)를 준비하고, 합, 평균 계산해서 출력하는 코드 작성.
		//입력 -> 처리 -> 출력 구분 짓기
		int []arr1 = new int[5];
		StringBuilder sb = new StringBuilder();
		//----입력과정----
		for(int i = 0; i < arr1.length; i++) {
			int temp = (int)(Math.random()*101);
			arr1[i] = temp;
			sb.append(String.format("arr1[%d] : %d %n", i, arr1[i]));
		}
		int max = arr1[0];
		//----처리과정----
		for(int i = 0; i < arr1.length; i++) {
			if(max < arr1[i])
				max = arr1[i];
		}
		//----출력과정----
		System.out.println("------------");
		System.out.println("최대값 구하기");
		System.out.printf(sb.toString());
		System.out.printf("최대 값 : %d ", max);
		
	}
}
