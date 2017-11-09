package com.test;

public class sample_02 {

	public static void main(String[] args) {
		/*
		 * 문자는 char, 문자열은 String
		 * 문자는 'A', 문자열은 "TEST"
		 * 클래스는 메소드를 지원한다.
		 * 객체가 저장된 변수.메소드()
		 */
		
		char a = 'A';
		System.out.println(a);
		
		String b= "A";
		System.out.println(b.toString());
		
		//charAt() 메소드 : 특정 위치(Index, 0부터 시작) 문자 반환
		String e = "abcdef";
		String f = "I do love you!";
		char result = e.charAt(5);
		System.out.println(result);
		result = f.charAt(5);
		System.out.println(result);
		
	}
}
