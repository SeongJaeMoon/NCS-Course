package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sample_13 {

	public static void main(String[] args) {

		//학생수, 점수입력, 점수리스트, 분석, 종료 기능을 가진 프로그램 작성.
		//1단계) 학생의 점수 여러개를 외부에서 입력 받아서 배열에 저장하고, 점수리스트 출력 
		//2단계) 최고점수, 평균점수 추가 출력
		
		/*
		출력예)
		 */
		Scanner sc = new Scanner(System.in);
		int studentNum = 5;
		int[]score = null;
		score = new int[studentNum];
		score[0]=70;
		score[1]=50;
		score[2]=30;
		score[3]=40;
		score[4]=25;
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("score[%d] : %d%n", i, score[i]);
		}
		//최고점수, 평균점수 출력
		int max = score[0];
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if(max < score[i]) {
				max = score[i];
			}
		}
		double avg = sum / (double)studentNum;
		System.out.printf("최고점수: %d, 평균점수: %.1f%n", max, avg);
		
	}
}
