package com.test;

public class sample_10 {

	public static void main(String[] args) {
		
		//기본 자료형 -> 문자열형(참조자료형)
		//문자열형(참조자료형)->기본자료형
		
		//강제(명시적) 형변환은 기본자료형끼리 변환시 사용
		//기본자료형1 변수 = (기본자료형1)기본자료형2;
		
		//문자열형(참조자료형)->기본자료형
		//int 변수 = Integer.parseInt(문자열형);
		//double 변수 = Double.parseDouble(문자열형);
		//주의) 문자열은 숫자로 변환 가능한 문자열만 변환. 예를 들어, "1234"은 1234가 되지만, "TEST"는 변환시 오류.
		
		String[]arr = {"10", "20", "30"};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			//문자열과 기본자료형의 + 연산은 문자열
			//문자열 결과를 int자료형 변수에 대입 할 수 없다.
			sum += Integer.parseInt(arr[i]);
		}
		System.out.printf("%d", sum);
	}
}
