package com.test;

import java.util.Calendar;

public class sample_03 {

	public static void main(String[] args) {

		// 시스템의 날짜 및 요일 확인
		// java.util.Calendar 클래스 및 Week 열거자료형

		Calendar cal = Calendar.getInstance();

		// get메소드는 이용해서 시스템의 날짜, 요일 정보 확인
		int week = cal.get(cal.DAY_OF_WEEK); 
		Week today = null;
		
		//if문, switch문 대신 배열을 이용해서 열거형 값을 얻을 수 있다.
		Week[]todays = {null, Week.SUNDAY, Week.MONDAY, Week.TUESDAY,
				Week.WENDESDAY, Week.THURSDAY, Week.FRIDAY, Week.SATURDAY}; 

		System.out.printf("오늘의 요일은 %s입니다.%n", todays[week]);
		
		//열거형 자료형의 값을 모두 출력
		for(Week a : Week.values()) {
			System.out.println(a);
		}
		//values()메소드를 활용해서 열거형 인덱스에 접근
		Week[]todays1 = Week.values();
		System.out.printf("오늘의 요일은 %s입니다.", todays1[week-1]); //열거형의 첨자는 0부터 시작
	}
}