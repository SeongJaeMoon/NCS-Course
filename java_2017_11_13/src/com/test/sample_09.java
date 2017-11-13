package com.test;

import java.util.Arrays;

public class sample_09 {

	public static void main(String[] args) {
		
		//내림차순 정렬
		//버블정렬 알고리즘
		int[]arr = {1,3,2,4,5};
		System.out.println(Arrays.toString(arr));
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
