package com.test;

public class sample_12 {

	public static void main(String[] args) {
		// 문제
		// 주사위를 던져서 나온 수의 합이 일정 수가 아니면 무한 반복 및 출력, 5이면 무한 반복 탈출

		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			int diceSum = dice1 + dice2;
			System.out.println("first: " + dice1 + ", second: " + dice2 + " = " + diceSum);
			if (diceSum == 5) {
				break;
			}
		}
	}
}
// 출력결과
/*
first :  ~, second : ~ = diceSum 
 */