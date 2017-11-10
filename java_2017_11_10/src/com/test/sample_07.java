package com.test;

public class sample_07 {

	public static void main(String[] args) {
	
		//배열 사용시 주의사항
		
		//배열 생성시 사용한 자료형의 값만 저장
		
		//올바른 예
		int[] arr1 = new int[5];
		arr1[0] = 10;
		arr1[1] = Integer.MAX_VALUE;
		
		//틀린 예
		//arr1[2] = 10.0;
		//arr[3] = "TEST";
		
		//double 자료형 배열에 int 자료형 값 저장
		//->암시적 형 변환
		double[]arr2 = new double[5];
		arr2[0] = 10; //들어갈 땐 정수형, 나올 땐 실수형이다. 들어갈 땐 맘대로지만 나갈 땐 니맘대로 안 되지
		
		//참고) boolean 타입 배열 항목의 기본 초기값은 false이다.
	}
}
