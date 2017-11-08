package com.test;

public class sample_08 {

	public static void main(String[] args) {
		//1부터 100까지의 수에 대에 합산을 출력하되, 아래 형태로 출력.
		// 출력예)
		/*
		 * 한 줄당 10 개씩 1부터 100까지의 합을 마지막에 나타내기
		 */
		int sum = 0;
		String result = "";
		for (int i = 1; i <= 100; i++) {
			sum += i;
			result += " " + i;
			if (i % 10 == 0) {
				result += '\n';
			}
		}
		System.out.print(result);
		System.out.print("-----------------\n");
		System.out.print("합산 결과: " + sum);
	}
}
