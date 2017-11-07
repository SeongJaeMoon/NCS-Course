package com.test;

public class sample_08 {

	
	public static void main(String[] args) {
		//char 자료형
		//0->48
		//A->65
		//a->97
		int a = 'b';
		//대문자 범위 (65~90), 소문자 범위 (97~122), 숫자 범위(48~57), 기타 문자 구분
		//char + int => int형 자동 형변환
		if(a>=65&&a<=90) {
			System.out.println("대문자 범위 안에 있습니다.");
		}else if(a>=97&&a<=122) {
			System.out.println("소문자 범위 안에 있습니다.");
		}else if(a>=48 && a<=57) {
			System.out.println("숫자 범위 안에 있습니다.");
		}else{
			System.out.println("모르는 범위 안에 있습니다.");
		}
	}
}
/*----
*결과:
----*/