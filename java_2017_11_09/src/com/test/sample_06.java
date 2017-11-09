package com.test;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class sample_06 {

	public static void main(String[] args) {

		//StirngBuilder 클래스
		//일반적인 String 클래스를 이용한 문자열 결합 연산은 메모리에 쓰레기 객체를 많이 발생시킨다.
		//문자열의 불변 특성 때문이다.
		//예를 들어, "ABC + DEF" => "ABCDEF" 연산 수행시 "ABC" 문자열은 쓰레기 객체가 되고, "ABCDEF" 객체가 반환된다.
		//-> StringBuilder 클래스의 append() 메소드를 이용하는 것을 권장.
		
		StringBuilder sb = new StringBuilder();
		
		String[]arrA = {"abc","def","ghi","jkl","mno"};
		String result = "";
		
		for(int i = 0; i < arrA.length; i++) {
			result += String.format("%d %s%n", i+1, arrA[i]);
		}
		System.out.println(result);
		
		for(int i = 0; i < arrA.length; i++) {
			sb.append(String.format("%d %s%n", i+1, arrA[i]));
		}
		System.out.println(sb.toString());
	}
}
