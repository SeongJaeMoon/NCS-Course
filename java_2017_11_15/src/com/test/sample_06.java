package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class sample_06 {

	public static void main(String[] args) {
		
		//�ý����� ��¥ �� �ð� ���� Ȯ��
		//java.util ��Ű���� Date, Calendar Ŭ����
		//java.time ��Ű���� LocalDateTime Ŭ����(java 8.0)�̻�
		//��¥ �� �ð��� ���� ���� ����
		
		Date date = new Date();
		
		System.out.println(date.toString());
		//wed Nov 15 11:48:28 KST 2017 -> KST Korea Standard Time
		
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd 'at' HH:mm:ss a zzz");
		System.out.println(sdf.format(date));
		//�� 2017/11/319 at 12:07:16 ���� KST
		
		Calendar cal = Calendar.getInstance();
		//get() �޼ҵ��� ��¥, �ð� ����� �̿��ؼ� ��¥, �ð� ���� Ȯ��
		
		//�⵵
		int year = cal.get(Calendar.YEAR);
		
		//��(+1 ���� �ʿ�)
		int month = cal.get(Calendar.MONTH)+1; //0���� �����ؼ� +1����� ��!
		
		//��
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		//����(���ڷ� ���)
		System.out.println(day);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		//����/����(���ڷ� ���)
		int ampm = cal.get(Calendar.AM_PM);
		
		//��(12�ð���, 0~11)
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);//12�ð���
		
		//��
		int minute = cal.get(Calendar.MINUTE);
		
		//��
		int second = cal.get(Calendar.SECOND);
		
		//��¥ ���
		System.out.printf("%d�� %d�� %d��%n", year, month, day);
		
		//���� ���
		String[]weeks = {"", "��", "��", "ȭ", "��", "��", "��", "��"}; // 1,2,3,4,5,6,7 -> 0�� ° �ε����� �� �迭 �ϳ� �־�����h��.
		System.out.printf("%s����%n", weeks[week]);
		String[]am_pm = {"����","����"}; // 0, 1
		System.out.printf("%s %s:%s:%s", am_pm[ampm], (hour==0) ? 12 : hour, minute, second);
		
		//calendar Ŭ������ isLeapYear �޼ҵ带 �������� �ʴ´�.
		//������ Ȯ�� �ϴ� �޼ҵ�
		
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