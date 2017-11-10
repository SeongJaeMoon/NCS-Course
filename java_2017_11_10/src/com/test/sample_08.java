package com.test;

public class sample_08 {

	public static void main(String[] args) {

		// 배열 사용시 주의사항
		// 초기화되지 않은 배열 사용 불가
		// 배열 선언만 하고 생성하지 않은 상태는 null을 가지고 있는 상태이다.

		int[] arr1;
		// System.out.println(arr1[0]); <- 안 되는 코드(지역 변수가 초기화 되지 않았습니다.)
		arr1 = new int[5];
		System.out.println(arr1[0]);
		arr1[0] = 10;
		System.out.println(arr1[0]);

	}
}
