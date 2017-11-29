package com.score002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ScoreService service = new ScoreService();
		boolean run = true;
		while(run) {
			System.out.println("1. 성적 정보 입력  2. 성적 정보 출력");
			System.out.println("선택(1~2, 0 quit)?");
			int input = sc.nextInt();
			switch(input) {
			case 0 : run = false;break;
			case 1 : service.scoreAdd(sc);break;
			case 2 : service.scoreList();break;
			
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
}
