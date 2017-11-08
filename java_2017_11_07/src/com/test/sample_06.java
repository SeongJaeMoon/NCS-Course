package com.test;

public class sample_06 {

	public static void main(String[] args) {
		// 문제: 과목 3개의 총점을 가지고 합격, 불합격, 과락을 구분해서 출력하는 코드 작성.
		// 합격 - 평균이 60점 이상이면서(합격 조건), 과목당 점수가 모두 40점 이상(과락 조건)

		int scoreA = (int) (Math.random() * 101); //0~100
		int scoreB = (int) (Math.random() * 101);
		int scoreC = (int) (Math.random() * 101);
		int average = (scoreA + scoreB + scoreC) / 3;
		String result = null;
		
		//long start = System.currentTimeMillis();
		if (average < 60) {
			result = "불합격입니다.";
		} else {
			if (scoreA < 40 || scoreB < 40 || scoreC < 40) {
				result = "불합격입니다.";
			} else {
				result = "합격입니다.";
			}
		}
		System.out.println("각각 점수는 " + "ScoreA:" + scoreA + "+" + "ScoreB:" + scoreB + "+" + "ScoreC:" + scoreC
				+ ", 평균은:" + average + ", 결과는: " + result);
		long end = System.currentTimeMillis();
		//System.out.println("걸린 시간은 :"+(end-start)*1000.0);
	}
}
/*----
*결과:
----*/