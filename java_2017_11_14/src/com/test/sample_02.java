package com.test;

public class sample_02 {

	public static void main(String[] args) {
		//크기 1은 바깥쪽 1차원 배열의 크기
		/*
		 * 크기2는 생략
		 * 바깥쪽 배열의 요소에 동적 생성된 1차원 배열을 저장한다.
		 * 안쪽 1차원 배열의 크기는 서로 다르게 저장한다.
		 */
		int[][] arr = new int[2][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		//자동초기화 지원
		//[0][0], [0][1], [1][0], [1][1], [1][2]
		
		//2차원 배열의 접근하기 안전한 방법 인덱스 범위가 다를경우!
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
