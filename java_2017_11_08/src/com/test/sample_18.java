package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class sample_18 {

	public static void main(String[] args) throws IOException {
		// 키보드 입력
		// 키보드를 이용해서 문자 또는 문자열을 프로그램 내부로 읽어들일 수 있다.
		// Enter키 한 번은 문자 2개 입력과 같음
		// System.in.read();
		// (주의사항) 예외 처리 필요, 특정 문자 입력 후 Enter 키 입력.
		// Enter키에 해당하는 문자(13,10)도 입력 처리가 된다. -> 메뉴선택이 여러번 반복해서 출력 됨.
		int a = 0;
		boolean run = true;
		
		while (run) {
			//키보드 문자 입력을 반복문 처리하는 경우
			//Enter키에 해당하는 문자(13,10)도 입력 처리가 된다.
			//->"메뉴 선택?" 문자열이 여러번 출력된다.
			//-> Enter키인 경우가 아닐 때만 "메뉴 선택?" 문자열 출력
			if(a!=10&&a!=13)
			System.out.print("==메뉴를 선택해주세요!== \n1.예금출금\n2.예금입금\n3.예금조회\n4.프로그램종료\n");
			a = System.in.read();
			char b = (char)a;
			switch (b) {
			case '1':
				System.out.print("==예금 출금==\n");
				break;
			case '2':
				System.out.print("==예금 입금==\n");
				break;
			case '3':
				System.out.print("==예금 조회==\n");
				break;
			case '4':
				System.out.print("==프로그램 종료==\n");
				run = false;
				break;
			default:
				//System.out.print("==실행할 수 없는 호출입니다.==\n");
				break;
			}
		}
	}
}
// 출력결과
/*
 * 
 */
