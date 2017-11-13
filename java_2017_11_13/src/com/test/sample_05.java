package com.test;

import java.util.Arrays;

public class sample_05 {

	public static void main(String[] args) {

		// 배열의 복사
		// 얕은 복사(참조 주소만 복사된 상태), 깊은 복사(참조 주소 및 실제 자료까지 복사된 상태)
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = arr1; // 얕은 복사

		System.out.println(arr1[0]);
		System.out.println(arr2[0]);

		++arr1[0];// arr1, arr2 0번째 배열 값이 같이 바뀜

		System.out.println(arr1[0]);
		System.out.println(arr2[0]);

		int[] arr3 = new int[arr1.length]; // 크기는 같거나 커야한다.
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));

		++arr1[0];

		System.out.println(arr1[0]);
		System.out.println(arr3[0]);

		int[] arr4 = Arrays.copyOf(arr1, arr1.length);// 1차원 배열일 땐 깊은 복사, 다차원 배열일 땐 얕은 복사!

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr4));

		++arr1[0];

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr4));
		
		/*
		 * 출력 
		 * 10 
		 * 10 
		 * 11 
		 * 11 
		 * [11, 20, 30, 40, 50] 
		 * [11, 20, 30, 40, 50] 
		 * 12 
		 * 11 
		 * [12, 20, 30, 40, 50] 
		 * [12, 20, 30, 40, 50] 
		 * [13, 20, 30, 40, 50] 
		 * [12, 20, 30, 40, 50]
		 */
	}
}
