package com.test;

public class sample_13 {

	public static void main(String[] args) {
		// x, y는 1~10 사이의 정수
		// 4x+5y=60을 만족하는 해를 구해서 출력
		// (x, y)는 (1,1), (1,2), ...(10,10)를 모두 대입!
		String result = "";
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if ((4 * i) + (5 * j) == 60) {
					result += " (" + i + "," + j +") " +'\n';
				}
			}
		}
		System.out.print(result);
	}
}
// 출력결과
/*
(5,8)
(10,4)
 */