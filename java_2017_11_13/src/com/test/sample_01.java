package com.test;

import java.util.Arrays;

public class sample_01 {

	public static void main(String[] args) {

		// 배열 요소 정렬
		// 정렬 : 요소를 크기순으로 나열하는 행위, (오름차순 or 내림차순)
		// 정렬 알고리즘(Bubble)을 적용한 정렬
		// Arrays 클래스의 sort() 메소드

		/*
		 * 1. 배열 요소에 정렬되지 않은 기본자료형 요소 준비 -> 5개. 2. 두 인접한 요소를 비교. 3. (if 오름차순인 경우, 왼쪽 요소가
		 * 크고, 오른쪽 요소가 작은 경우 교환). 그렇지 않은 경우 통과. 4. 비교와 교환 액션을 배열 요소 전체에 대해서 적용할 때까지 반복.
		 * 0-1, 1-2, 2-3, 3-4, ... 5. 배열 요소 전체에 대한 비교, 교환 액션 한 번 진행한 상태를 1회전. 6. 배열 요소
		 * 중에서 가장 큰 값이 가장 오른쪽에 위치한다. 7. 2번~6번 과정을 반복. 단, 가장 오른쪽 끝 값은 제외(정렬이 끝난 값은 제외).
		 * 8. 비교 대상이 없어지면 반복 종료.
		 */
		int[] a = {5,3,2,1,4};
		// 정렬 전 출력
		for (int b : a) {
			System.out.print(b);
		}
		System.out.println();
		// 정렬 과정
		/*
		 * if(arr[n] > arr[n+1] int temp = arr[n]; arr[n] = arr[n+1]; arr[n+1] = temp;
		 * n은 0,1,2,3, ...., 마지막 값(배열 요소의 갯수 - 2)
		 * if(a[n] > a[n+1]){
		 * 	int temp = arr[n+1];
		 * 	arr[n+1] = arr[n];
		 * 	arr[n] = temp;
		 * }
		 */
		int temp = 0;
		for (int i = 0; i < a.length-1; i++) {// 회전수
			for (int j = i; j < a.length; j++) {//회전당 값 비교해서 스왑
				// System.out.printf("i[%d]: %d, j[%d]: %d%n",i, a[i], j, a[j]);
				if (a[i] > a[j]) {
					System.out.printf("회전: %d [%d <교환> %d]%n", i+1, a[i], a[j]);
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

		/*for(int i = 1; i < a.length; ++i) {
			for(int j = 0; j < a.length-i; ++j) {
				if (a[j] > a[j+1]) {
					//System.out.printf("회전: %d [%d <교환> %d]%n", i, a[i], a[j]);
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}*/
		
		// 정렬 후 출력
		for (int b : a) {
			System.out.print(b);
		}
	}
}
