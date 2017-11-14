package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sample_16 {

	public static void main(String[] args) {

		// 학생수, 점수입력, 점수리스트, 분석, 종료 기능을 가진 프로그램 작성.
		// 1단계) 학생의 점수 여러개를 외부에서 입력 받아서 배열에 저장하고, 점수리스트 출력
		// 2단계) 최고점수, 평균점수 추가 출력
		// 3단계) 점수를 외부 입력 받아서 배열에 저장
		// 4단계) 학생수에 대한 외부 입력 받아서 배열의 크기 지정
		// 5단계) 메뉴 출력
		// 6단계) 학생수(배열 크기)를 가변적으로 운영하도록 수정. 초기값 5, 자동확장(배열크기+5)
		/*
		 * 출력예)
		 */
		int[] score = new int[5];
		int studentNum = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 프로그램입니다.");
		while (run) {
			System.out.println("------------------------------------");
			System.out.println("2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------");
			int input = sc.nextInt();
			sc.nextLine();
			if (input == 2) {
				System.out.println("점수를 입력해주세요.");
				while (true) {
					System.out.printf("score[%d]>", studentNum);
					if(studentNum == score.length) {
						scoreCopy = Arrays.copyOf(score, score.length+5);
					}
					score[studentNum] = sc.nextInt();
					sc.nextLine();
					++studentNum;
					System.out.println("입력을 계속할까요?(y/n)");
					String xy = sc.nextLine();
					sc.nextLine();
					if (xy.equalsIgnoreCase("n")) {
						System.out.printf("선택>%s%n", xy);
						break;
					}
				}
			} else if (input == 3) {
				System.out.printf("선택>%d%n", input);
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("score[%d] : %d%n", i, score[i]);
				}
			} else if (input == 4) {
				System.out.printf("선택>%d%n", input);
				// 최고점수, 평균점수 출력
				int max = score[0];
				int sum = 0;

				for (int i = 0; i < studentNum; i++) {
					sum += scoreCopy[i];
					if (max < score[i]) {
						max = score[i];
					}
				}
				double avg = sum / (double) studentNum;
				System.out.printf("최고점수: %d, 평균점수: %.1f%n", max, avg);
			} else if (input == 5) {
				sc.close();
				System.out.println("프로그램 종료");
				run = false;
			} else {
				System.out.printf("%d, %d, %d%n", score.length, scoreCopy.length ,studentNum);
				System.out.println(Arrays.toString(score));
				System.out.println(Arrays.toString(scoreCopy));
				//System.out.println("알 수 없는 입력입니다.");
				sc.nextLine();
			}
		}
	}
}
