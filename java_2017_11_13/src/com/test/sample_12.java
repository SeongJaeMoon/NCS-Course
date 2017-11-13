package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sample_12 {

	public static void main(String[] args) {

		// next() : 공백으로 구분된 문자열 입력시 사용. 문자열 자료 반환.
		// nextLine() : 공백 포함 한 줄 전체 문자열 입력시 사용. 문자열 자료 반환.
		// nextInt() : 공백으로 구분된 정수 형태의 문자열 입력시 사용. 정수 자료 반환
			
		// 주의) next(), nextInt() 와 nextLine() 메소드 혼용시 줄바꿈 문자 처리 필요.
		// 띄어쓰기 인정 못 받음 -> 다음 입력으로 처리
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.nextLine(); //next와  혼용시 중간에 껴 넣기
		int a = sc.nextInt();
		System.out.printf("%s %d", str, a);
	}
}
