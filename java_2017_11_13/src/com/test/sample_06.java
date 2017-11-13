package com.test;

import java.util.Arrays;

public class sample_06 {

	public static void main(String[] args) {

		// 배열의 복사
		// 원본 배열의 일부 요소만 복사
		// Arrays.copyOfRange()메소드 사용

		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = Arrays.copyOfRange(arr1, 0, 5);// 원본배열, 시작인덱스, 끝인덱스(끝 인덱스는 포함하지 않는다.)
		String [] str = {"json", "xml", "nodejs", "angularjs", "rubyonrails"};

		int temp = 20;
		int idx = -1;
		for(int i = 0; i < arr1.length; i++) {
			if(temp == arr1[i]) {
				idx = i;
				break;
			}
		}
		System.out.println(idx);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		++arr1[0];
	
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		Arrays.sort(arr1);
		Arrays.sort(str);
		
		int index = Arrays.binarySearch(arr1, 20);//binarySearch 사용 전 정렬부터 필요!, 음수 -> 값이 존재x, 양수 -> 값이 존재o
		int index2 = Arrays.binarySearch(str, "json");
		
		System.out.println(index);
		System.out.println(index2);
		
	}
}
