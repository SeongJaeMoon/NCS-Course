package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sample_01 {

	public static void main(String[] args) {
		
		//열거타입 enum (사용자 정의 자료형)
		//한정된 값 여러개를 묶어서 하나의 자료형을 표현한 상태
		//예를 들어, 요일명(월, 화, 수, 목, 금, 토, 일)
		//열거타입 이름은 관례적으로 첫글자는 대문자로 표기, 예를 들어, (Week, Months, etc...)
		//열거타입은 물리적으로 별도 작성(.java)하고, 별도 저장한다
		//열거타입명 변수 = 열거타입.열거상수;
		/*
		 * public enum 열거타입명{
		 * 값1; -> 각각의 값을 열거상수라고 부른당! 관례적으로 대문자로만 작성하는게 관례 예를 들어, MONDAY
		 * 값2;
		 * ...
		 * 
		 * }
		 */
		//변수에 MONDAY 값을 가진 Week 객체의 참조주소가 전달된다.
		Week week1 = Week.MONDAY;
		Week week2 = Week.MONDAY;
		Week week3 = Week.WENDESDAY;
		//참조형 값을 가진 변수에 대한 == 연산은 참조주소를 비교한다.
		System.out.println(week1 == week2);//true 반환
	}
}