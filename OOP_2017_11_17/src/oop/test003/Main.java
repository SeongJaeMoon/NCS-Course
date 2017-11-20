package oop.test003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * FieldInitValue initValue = new FieldInitValue();
		 * 
		 * System.out.println(initValue.intField);//0
		 * System.out.println(initValue.floatField);//0.0
		 * System.out.println(initValue.longField);//0
		 * System.out.println(initValue.stringField);//null
		 * System.out.println(initValue.arr);//null
		 */

		// 문제) 10진수 숫자를 입력 받아서, 2진수 문자열로 출력하는 코드 작성.

		/*
		 * 10진수 -> 2진수 변환 
		 * 10진수(0 exit)?15 
		 * 15(10) -> 1111(2) 
		 * 프로그램 종료.
		 */
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean run = true;
		int input;
		System.out.println("10진수 -> 2진수");
		while (run) {
			System.out.println("10진수(0 exit)?");
			input = sc.nextInt();
			sc.nextLine();
			if(input==0) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
				sc.close();
			}else {
				
				String result = ""; //문자열을 추가할 임시변수 선언
				int temp = input; //입력 값을 나타낼 임시변수 선언
				String result1 = "";//나머지를 역으로 출력할 변수 선언
					
					while(input != 1) {
						result += String.valueOf(input%2); //입력 값을 2로 나눈 나머지 값을 순서대로 더함
						input /= 2; //해당 값을 2로 나눈 값을 할당
					}
					
					result += 1;//마지막 1의 값을 구하기 전에 반복문을 빠져나오므로 1을 더해줌
					
					for(int i = result.length()-1; i >= 0; --i) {
						
						result1 += result.charAt(i); //저장된 결과값을 역순으로 재저장
					}
					
					System.out.printf("%d(10) -> %s(2)%n", temp, result); //10진수 입력값과 2진수 변환 값 출력
			}
		}
	}
}
