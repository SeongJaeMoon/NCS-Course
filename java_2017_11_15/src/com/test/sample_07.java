package com.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class sample_07 {

	public static void main(String[] args) {
		//시스템의 날짜 및 시간 정보 확인
		//java.util 패키지의 Date, Calendar 클래스
		//java.time 패키지의 LocalDateTime 클래스(java 8.0이상)
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		//년도
		System.out.println(date.getYear());
		//월
		System.out.println(date.getMonthValue());
		//요일
		System.out.println(date.getDayOfWeek());
		//날짜
		System.out.println(date.getDayOfMonth());
		//시간(24시간제)
		System.out.println(date.getHour());
		//분
		System.out.println(date.getMinute());
		//초
		System.out.println(date.getSecond());
		
		LocalDate lc = LocalDate.now();
		
		//윤년확인
		System.out.println(lc.isLeapYear());
		//윤년확인
		LocalDate lc1 = date.toLocalDate();
		System.out.println(lc1.isLeapYear());
		
		//날짜 연산
		System.out.printf("현재 날짜:%s%n", date);
		System.out.printf("연산 날짜:%s%n", date.plusDays(100));
		
		//현재 월의 마지막 날짜 확인
		System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth());
		
		//날짜 비교 연산
		LocalDate target = LocalDate.of(2010, 3, 11); //타겟날짜 설정
		LocalDate target2 = LocalDate.of(2018, 2, 10); //타겟날짜 설정
		System.out.println(date.toLocalDate().isBefore(target));//false 현재가 기준  
		System.out.println(date.toLocalDate().isBefore(target2));//true
		//시작날짜 - 타켓날짜까지 남은 날짜 리턴
		System.out.println(ChronoUnit.DAYS.between(date.toLocalDate(), target2));
		
		//날짜 형식의 문자열을 날짜 객체로 변환 (날짜 형식의 문자열로 구성되어 있어야 됨!)
		LocalDate target3 = LocalDate.parse("2017-12-05");
		System.out.println(ChronoUnit.DAYS.between(date.toLocalDate(), target3));
		
		//날짜 서식 지정
		System.out.println(date);
		System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
	
	}
}