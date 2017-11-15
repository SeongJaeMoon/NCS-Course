package com.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Scanner;

public class sample_09 {

	public static void main(String[] args) {
		// 문제) 중복되지 않은 난수 여러개를 얻는 프로그램 코드 작성.
		// 로또 숫자 범위의 난수(1~45) 6개를 얻을 때 중복된 숫자가 없는 상태로 얻어야 한다.
		// 로또 숫자 6개를 한 번에 여러개 얻는 경우
		// 6개 숫자를 출력시 정렬된 상태로 출력 -> 오름차순
		// 최대 구매 범위 10장
		/*
		 * 츨력예) 원하는 장수(1~n) ex.5 중복이 없어야 된다.
		 */

		int rottoNum = (int) (Math.random()) * 45 + 1;
		Scanner input = new Scanner(System.in);
		int max = 0;
		boolean isOk = true;
		boolean run = true;
		System.out.println("로또 출력하는 행위 입니다.");
		while (run) {
			System.out.println("로또 장수를 클릭해주세요(선택제한 :10)");
			int size = input.nextInt();
			input.nextLine();
			int[][] rottoArray = new int[size][6];
			int[] colum = new int[size * 6];
			System.out.println(colum.length);
			if (size > 10) {
				System.out.println("장수 제한은 10장입니다.");
			} else {
				
			}
		}
		input.close();
	}
}
