package com.test;

public class sample_04 {

	public static void main(String[] args) {
		// 타차원 배열(배열의 배열)
		// 1차원 배열의 요소로서 또 다른 1차원 배열이 들어있는 상태.
		// 참조형 자료를 자료를 저장하지 않으면 자동으로 null로 초기화
		//참조형 자료를 저장한 배열은 배열의 배열과 구조가 같다.
		String[]arr=new String[5];
		//자동 초기화 지원
		//[0],[1],[2],[3],[4]
		
		for(int a = 0; a < arr.length; a++) {
			System.out.println(arr[a]);
		}
		//참조형은 참조주소를 통해 문자열을 반환해줌(배열 요소에 참조주소만 저장)
		//문자열 자신은 배열과 다른 영역에 존재한다.
		
		arr[0] = "TEST";
		arr[1] = "SAMPLE";
		arr[2] = "TEST";
		arr[3] = new String("TEST");
		for(int a = 0; a < arr.length; a++) {
			System.out.println(arr[a]);
		}
		//참조 주소 비교
		System.out.println(arr[0] == arr[3]); //false
		System.out.println(arr[0] == arr[2]); //true
		
		//값 비교
		System.out.println(arr[0].equals(arr[3])); //true
		System.out.println(arr[0].equalsIgnoreCase(arr[3]));//true
	}
}
