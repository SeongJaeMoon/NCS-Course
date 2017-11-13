package com.test;

import java.util.Arrays;

public class sample_08 {

	public static void main(String[] args) {
		
		//문제 여러개의 요소를 가진 int 자료형 배열에서 가장 큰 값 출력하는 코드작성.
		//버블 정렬 알고리즘 1회전 적용 후, 가장 오른 쪽 요소를 얻는다.
		//Arrays.sort메소드 적용 후, 가장 오른 쪽 요소를 얻는다.
		int [] arr = new int[5];
		//----입력----
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			
		}
		//----처리----
		Arrays.sort(arr);
		//----출력----
		System.out.println(Arrays.toString(arr));
		System.out.printf(String.format("최소값: %d 최대값: %d", arr[0], arr[4]));
	}
}
