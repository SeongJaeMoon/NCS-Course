package com.test;

public class sample_03 {

	public static void main(String[] args) {
		// 타차원 배열(배열의 배열)
		// 1차원 배열의 요소로서 또 다른 1차원 배열이 들어있는 상태.
		/*
		 * 자료형[][]변수 = {{값1,값2,값3,}, {값4,값5,값6}...},...};
		 * 배열의 배열에서 크기는 안쪽 {}의 개수와 값의 개수로 결정된다. 
		 */
		int[][] arr = {{1,2,3},{4,5,6,7}};
		//바깥쪽 배열의 크기
		System.out.println(arr.length);
		
		//안쪽 배열의 크기
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		//인덱스 범위
		//[0][0], [0][1], [0][2], ...[1][3]

	}
}
