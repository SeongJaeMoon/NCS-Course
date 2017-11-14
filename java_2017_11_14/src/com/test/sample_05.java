package com.test;

public class sample_05 {

	public static void main(String[] args) {
		// 타차원 배열(배열의 배열)
		// 배열의 배열
		
		/*
		     1  2  3  4  5
  			 6  7  8  9 10
 			11 12 13 14 15
 			16 17 18 19 20
 			21 22 23 24 25
		 */
		
		int[][] arr = new int[5][5];
		
		//배열의 초기화
		//1부터 25까지의 수를 순차적으로 초기화
		
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++num;
			}
		}
		
		//배열의 배열을 2차원 구조로 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j= 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
	}
}
