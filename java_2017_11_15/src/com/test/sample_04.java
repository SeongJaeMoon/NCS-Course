package com.test;

public class sample_04 {

	public static void main(String[] args) {
		
		int[][]array = {{95,86}, {83,92,96}, {78,83,93,87,88}};
		
		int sum = 0;
		double avg = 0.0;
		int num = 0;
		//-> 중첩 for문 사용
		//-> 요소의 갯수를 확인하는 변수 선언 추가
		for(int[]arr : array) {
			for(int a : arr) {
				++num;
				sum += a;
			}
		}
		avg = sum/(double)num;
		System.out.println(num);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}