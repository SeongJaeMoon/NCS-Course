package com.test;

public class sample_09 {

	public static void main(String[] args) {
		//배열 사용시 주의사항
		//메소드 매개변수로 배열 객체 전달시 값목록에 의한 배열은 전달 불가.
		// -> new 연산자 사용
		
		//올바른 예
		int[]score;
		score = new int[]{10, 20, 30};
		//사용자가 준비한 메소드 호출 및 매개변수 값 전달
		int sum = add(score);
		System.out.printf("%d%n", sum);
		
		//틀린 예, 문법 에러
		//add({10, 20, 30});
		int sum1 = add(new int[] {10, 20, 30});
		System.out.printf("%d%n", sum1);
	}
	
	public static int add(int[]a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
