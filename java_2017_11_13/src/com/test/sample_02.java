package com.test;

import java.util.Arrays;

public class sample_02 {

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
		String [] str = {"json", "xml", "nodejs", "angularjs", "rubyonrails"};
		// 정렬 전 출력
		for (String b : str) {
			System.out.printf("%s ", b);
		}
		System.out.println();
		// 정렬 과정
		/*
		 * if(arr[n] > arr[n+1] int temp = arr[n]; arr[n] = arr[n+1]; arr[n+1] = temp;
		 * n은 0,1,2,3, ...., 마지막 값(배열 요소의 갯수 - 2)
		 * if(a[n] > a[n+1]){
		 * 
		 * }
		 * 주의) 문자열(String 자료형) 비교는 > 연산자로 비교 불가
		 */
		String temp = "";
		for(int i = 0; i < str.length; i++) {
			for(int j = i; j < str.length - 1; j++) {
				if(str[i].compareTo(str[j]) > 0){ 
					//값.compareTo("비교값") 
					//if(값 > 비교값) return 양수 
					//else if(값 < 비교값) return 음수 
					//else if(값 == 비교값) return 0 
					System.out.printf("회전: %d [%s <교환> %s]%n", i+1, str[i], str[j]);
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		/*for(int i = 1; i < str.length; ++i) {
			for(int j = 0; j < str.length - i; ++j) {
				if(str[j].compareTo(str[j+1]) > 0){ 
					//값.compareTo("비교값") 
					//if(값 > 비교값) return 양수 
					//else if(값 < 비교값) return 음수 
					//else if(값 == 비교값) return 0 
					System.out.printf("회전: %d [%s <교환> %s]%n", i+1, str[i], str[i+1]);
					String temp = str[j+1];
					str[j+1] = str[j];
					str[j] = temp;
				}
			}
		}*/
		
		for (String b : str) {
			System.out.printf("%s ", b);
		}
	}
}
