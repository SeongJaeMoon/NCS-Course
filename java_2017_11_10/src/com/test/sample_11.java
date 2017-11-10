package com.test;

public class sample_11 {

	public static void main(String[] args) {
		//향상된 for문.
		//배열 또는 컬렉션 객체 탐색 전용 반복문.
		//배열 객체를 순차적으로 탐색해서 요소를 임시변수에 저장한다.
		/*
			for(자료형 변수명 : 배열객체){
			}
		 */
		//일반 for문
		int []a = {10, 20, 30, 40, 50};
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] : %d%n", i, a[i]);
		}
		//향상된 for문
		for(int i : a) { //각 인덱스에 맞게 배열 a의 값을 변수 i에 넣어준다. (i(값)의 탐색 및 출력)
			System.out.println(i); //인덱스에 접근 할 수 없다. 
		}
	}
}
