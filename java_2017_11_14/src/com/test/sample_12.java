package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sample_12 {

	public static void main(String[] args) {

		//학생수, 점수입력, 점수리스트, 분석, 종료 기능을 가진 프로그램 작성.
		//1단계) 학생의 점수 여러개를 외부에서 입력 받아서 배열에 저장하고, 점수리스트 출력 
		
		
		/*
		출력예)
		 */
		Scanner sc = new Scanner(System.in);
		
		int[]score = null;
		
		score[0]=70;
		score[1]=50;
		score[2]=30;
		score[3]=40;
		score[4]=25;
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("score[%d] : %d%n", i, score[i]);
		}
		
		while(true) {
			
		}
		
	}
}
