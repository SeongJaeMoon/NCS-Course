package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sample_11 {

	public static void main(String[] args) {
		// 문제) 여러명의 이름, 점수를 외부 입력 받고, 출력시 이름(오름차순) 또는 점수(내림차순)를 통해 정렬
		// 조건 : 배열을 이름 저장용, 점수 저장용 따로 준비하고, 이름, 점수를 매칭하기 위해서 동일 index를 사용

		String[] names = new String[5];
		int[] scores = new int[5];
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}
		
		 System.out.println("점수를 입력하세요."); 
		 for(int i = 0; i < names.length; i++) {
			 scores[i] = sc.nextInt();
		 }
		String []namesCopy = Arrays.copyOf(names, names.length); 
		int []scoresCopy = Arrays.copyOf(scores, scores.length);  
		System.out.println();

		while (run) {
			System.out.println("이름으로 오름차순 : 1, 점수로 내림차순 : 2, 종료 : 0");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("정렬전");
				System.out.println(Arrays.toString(namesCopy));
				System.out.println(Arrays.toString(scoresCopy));
				for (int i = 1; i < names.length; i++) {
					for (int j = 0; j < names.length - i; j++) {
						if (names[j].compareTo(names[j + 1]) > 0) {
							String temp1 = names[j];
							names[j] = names[j + 1];
							names[j + 1] = temp1;
							int temp = scores[j];
							scores[j] = scores[j + 1];
							scores[j + 1] = temp;
						}
					}
				}
				System.out.println("정렬 후");
				for(int a = 0; a < names.length; a++) {
					System.out.printf("이름 : %s, 점수 : %d %n", names[a], scores[a] );
				}
				break;
			case 2:
				System.out.println("정렬 전");
				System.out.println(Arrays.toString(namesCopy));
				System.out.println(Arrays.toString(scoresCopy));
				for (int i = 1; i < scores.length; i++) {
					for (int j = 0; j < scores.length - i; j++) {
						if (scores[j] < scores[j + 1]) {
							int temp = scores[j];
							scores[j] = scores[j + 1];
							scores[j + 1] = temp;
							String temp1 = names[j];
							names[j] = names[j + 1];
							names[j + 1] = temp1;
						}
					}
				}
				System.out.println("정렬 후");
				for(int a = 0; a < names.length; a++) {
					System.out.printf("이름 : %s, 점수 : %d %n ", names[a], scores[a] );
				}
				break;
			default:
				run = false;
				sc.close();
				break;
			}
		}
	}
}
