package com.schedule;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

//메뉴 액션 진행을 위한 서비스 클래스
public class ScheduleService {
	
	//(컬렉션) 저장소 접근을 위한 공용 변수 -> 현재 클래스 내부에서 사용될 예정
	private ScheduleDAO dao = new ScheduleDAO();
	
	//스케줄 자료 등록 -> Scanner 객체 필요
	//공백이 포함된 입력을 받을 때는 nextLine() 메소드 사용이당!
	public void scheduleAdd(Scanner sc) {
		System.out.print("날짜(YYYY-MM-DD)?");
		String date = sc.next();
		System.out.print("내용(200자 이내)?");
		String content = sc.nextLine();
		sc.nextLine();
		this.dao.scheduleAdd(date, content);
		System.out.println("일정이 추가되었습니다.");
	}
	
	//스케줄 자료 전체 출력
	public void scheduleList() {
		System.out.println(this.dao.scheduleList());
	}
	
	//스케줄 검색 출력
	/*
	 --- 일정 출력(서브메뉴) ---
	1. 오늘 일정
	2. 특정 일 일정
	3. 특정 월 일정
	4. 특정 단어 포함 일정
	5. 전체 일정  
	 */
	public void scehduleList(Scanner sc) {
		// 오늘 날짜(YYYY-MM-DD)기준 검색
		while (true) {
			System.out.println("---일정 출력(서브 메뉴)---");
			System.out.printf("1. 오늘 일정%n2. 특정 일 일정%n3. 특정 월 일정%n4. 특정 단어 포함 일정%n5. 전체 일정%n");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:System.out.print(this.todayList());break;
			case 2:System.out.print(this.dayList(sc));break;
			case 3:System.out.print(this.dayList(sc));break;
			case 4:System.out.print(this.wordList(sc));break;
			case 5:System.out.print(this.dao.scheduleList());break;
			}
		}
	}
	
	private String sidList(int value) {
		return this.dao.scheduleSearch("번호", String.valueOf(value));
	}
	private String todayList() {
		LocalDateTime date = LocalDateTime.now();
		String value = (date.format(DateTimeFormatter.ISO_LOCAL_DATE)).toString();
		return this.dao.scheduleSearch("날짜", value);
	}
	private String dayList(Scanner sc) {
		System.out.print("날짜(YYYY-MM)");
		String value = sc.next();
		return this.dao.scheduleSearch("날짜", value);
	}
	private String monthList(Scanner sc) {
		System.out.print("날짜(YYYY-MM-DD");
		String value = sc.next();
		return this.dao.scheduleSearch("날짜", value);
	}
	private String wordList(Scanner sc) {
		System.out.print("특정 단어?");
		String value = sc.next();
		return this.dao.scheduleSearch("내용", value);
	}
}
