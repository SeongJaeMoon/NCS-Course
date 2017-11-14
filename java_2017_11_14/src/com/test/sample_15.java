package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sample_15 {

	public static void main(String[] args) {

		// 학생수, 점수입력, 점수리스트, 분석, 종료 기능을 가진 프로그램 작성.
		// 1단계) 학생의 점수 여러개를 외부에서 입력 받아서 배열에 저장하고, 점수리스트 출력
		// 2단계) 최고점수, 평균점수 추가 출력
		// 3단계) 점수를 외부 입력 받아서 배열에 저장
		// 4단계) 학생수에 대한 외부 입력 받아서 배열의 크기 지정
		// 5단계) 메뉴 출력
		/*
		 * 출력예)
		 */
		int[] score = null;
		int studentNum = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 프로그램입니다.");
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-----------------------------------------");
			int input = sc.nextInt();
			sc.nextLine();
			if(input == 1){
				System.out.printf("선택>%d",input);
				// 외부 입력
				studentNum = sc.nextInt();
				sc.nextLine();
				score = new int[studentNum];
			}
			else if(input == 2) {
				System.out.println("점수를 입력해주세요.");
				for (int i = 0; i < score.length; i++) {
					System.out.printf("score[%d]>", i);
					score[i] = sc.nextInt();
					sc.nextLine();
				}

			}else if(input == 3) {
				System.out.printf("선택>%d",input);
				for (int i = 0; i < score.length; i++) {
					System.out.printf("score[%d] : %d%n", i, score[i]);
				}
			}else if(input == 4) {
				System.out.printf("선택>%d",input);
				// 최고점수, 평균점수 출력
				int max = score[0];
				int sum = 0;

				for (int i = 0; i < score.length; i++) {
					sum += score[i];
					if (max < score[i]) {
						max = score[i];
					}
				}
				double avg = sum / (double) studentNum;
				System.out.printf("최고점수: %d, 평균점수: %.1f%n", max, avg);
			}else if(input == 5) {
				sc.close();
				System.out.println("프로그램 종료");
				run = false;
			}else {
				System.out.println("알 수 없는 입력입니다.");
			}
		}
	}
}
