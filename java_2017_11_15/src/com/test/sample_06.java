package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class sample_06 {

	public static void main(String[] args) {
		
		//시스템의 날짜 및 시간 정보 확인
		//java.util 패키지의 Date, Calendar 클래스
		//java.time 패키지의 LocalDateTime 클래스(java 8.0)이상
		//날짜 및 시간에 대한 서식 지정
		
		Date date = new Date();
		
		System.out.println(date.toString());
		//wed Nov 15 11:48:28 KST 2017 -> KST Korea Standard Time
		
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd 'at' HH:mm:ss a zzz");
		System.out.println(sdf.format(date));
		//수 2017/11/319 at 12:07:16 오후 KST
		
		Calendar cal = Calendar.getInstance();
		//get() 메소드의 날짜, 시간 상수를 이용해서 날짜, 시간 정보 확인
		
		//년도
		int year = cal.get(Calendar.YEAR);
		
		//월(+1 연산 필요)
		int month = cal.get(Calendar.MONTH)+1; //0부터 시작해서 +1해줘야 됨!
		
		//일
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		//요일(숫자로 출력)
		System.out.println(day);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		//오전/오후(숫자로 출력)
		int ampm = cal.get(Calendar.AM_PM);
		
		//시(12시간제, 0~11)
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);//12시간제
		
		//분
		int minute = cal.get(Calendar.MINUTE);
		
		//초
		int second = cal.get(Calendar.SECOND);
		
		//날짜 출력
		System.out.printf("%d년 %d월 %d일%n", year, month, day);
		
		//요일 출력
		String[]weeks = {"", "일", "월", "화", "수", "목", "금", "토"}; // 1,2,3,4,5,6,7 -> 0번 째 인덱스에 빈 배열 하나 넣어줘아햔다.
		System.out.printf("%s요일%n", weeks[week]);
		String[]am_pm = {"오전","오후"}; // 0, 1
		System.out.printf("%s %s:%s:%s", am_pm[ampm], (hour==0) ? 12 : hour, minute, second);
		
		//calendar 클래스는 isLeapYear 메소드를 지원하지 않는다.
		//윤년을 확인 하는 메소드
		
		  String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
			         "Oct", "Nov", "Dec"};
			      
			      int years;
			      // Create a Gregorian calendar initialized
			      // with the current date and time in the
			      // default locale and timezone.
			      
			      GregorianCalendar gcalendar = new GregorianCalendar();
			      
			      // Display current time and date information.
			      System.out.print("Date: ");
			      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
			      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
			      System.out.println(years = gcalendar.get(Calendar.YEAR));
			      System.out.print("Time: ");
			      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
			      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
			      System.out.println(gcalendar.get(Calendar.SECOND));

			      // Test if the current year is a leap year  
			      if(gcalendar.isLeapYear(years)) {
			         System.out.println("The current year is a leap year");
			      }else {
			         System.out.println("The current year is not a leap year");
			      }
	}
}