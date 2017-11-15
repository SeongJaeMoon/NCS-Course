package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sample_02 {

	public static void main(String[] args) {

		// 시스템의 날짜 및 요일 확인
		// java.util.Calendar 클래스 및 Week 열거자료형

		Calendar cal = Calendar.getInstance();

		// get메소드는 이용해서 시스템의 날짜, 요일 정보 확인
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		// 1,2,3,4,5,6,7
		// 일 월 화 수 목 금 토
		Week today = null;
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.printf("오늘 요일은 %s입니다.", today.name());//.name은 문자열, today는 열거타입
															 //.ordinal -> 코딩된 순번
	}
}