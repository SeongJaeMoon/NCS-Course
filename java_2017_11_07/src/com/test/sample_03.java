package com.test;

import java.util.Scanner;
import java.lang.System;

public class sample_03 {

	public static void main(String[] args) {

		// if~else if~ else
		// if(boolean){조건식...}else if(boolean){조건식...}else{조건식...}
		// 연관성이 있는 조건을 사용 else if 여러번 반복 표기 가능.
		// if 구분 반드시 표기, else 생략가능
		/*
		 * if(boolean_expression){ 위 조건 참 실행 }else if(boolean_expression){ 상위 조건 거짓 위 조건
		 * 참 실행 }else if(boolean_expression){ 상위 조건 모두 거짓 위 조건 참 실행 }else{ 상위 조건 모두 거짓
		 * 실행 }
		 */
		/*
		 * int person =0; Scanner sc = new Scanner(System.in); person = sc.nextInt();
		 * if(person >=0 && person <30){ System.out.printf("num: %d\n", person);
		 * System.out.println('D'); }else if(person >= 30) {
		 * System.out.printf("num: %d\n", person); System.out.println('C'); }else
		 * if(person >= 60) { System.out.printf("num: %d\n", person);
		 * System.out.println('B'); }else { System.out.printf("num: %d\n", person);
		 * System.out.println("잘했어"); }
		 */

		System.out.println("주사위 게임을 시작합니다.");
		int x = (int) (Math.random() * 6) + 1;
		switch (x) {
		case 6:
			System.out.println("6입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		default:
			System.out.println("1입니다.");
			break;
		}

	}
}
/*----
*결과:
----*/