
	//화면 설계를 토대로 분석한 결과를 필드로 구성 -> getter, setter 구성
	/*
	--------------------------------
	회원관리 v1.0 (콘솔 버전)
	- 회원 정보 입력, 회원 정보 출력 액션 구현
	- 화면 설계를 토대로 항목 결정->  이름, 전화번호, 이메일, 등록일(yyyy-MM-dd) ->자료형 클래스
	- 화면 설계
	--------------------------------------------
	 */
package com.member;

import java.util.Scanner;
//메인 메뉴 액션 클래스
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberService member = new MemberService();
		boolean run = true;
		//메인 메뉴 액션
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1. 회원 정보 입력  2. 회원 정보 출력 3. 회원 정보 검색");
			System.out.println("선택(1~3, 0 quit)?");
			
			int input = sc.nextInt();
			switch(input) {
			case 0:run = false;break;
			case 1:member.memberAdd(sc);break;
			case 2:member.memberList();break;		
			case 3:member.memberSearch(sc);break;
			}
		}	
		sc.close();
		System.out.println("프로그램 종료.");
	}
}
