package com.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class sample_07 {

	public static void main(String[] args) {
		//�ý����� ��¥ �� �ð� ���� Ȯ��
		//java.util ��Ű���� Date, Calendar Ŭ����
		//java.time ��Ű���� LocalDateTime Ŭ����(java 8.0�̻�)
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		//�⵵
		System.out.println(date.getYear());
		//��
		System.out.println(date.getMonthValue());
		//����
		System.out.println(date.getDayOfWeek());
		//��¥
		System.out.println(date.getDayOfMonth());
		//�ð�(24�ð���)
		System.out.println(date.getHour());
		//��
		System.out.println(date.getMinute());
		//��
		System.out.println(date.getSecond());
		
		LocalDate lc = LocalDate.now();
		
		//����Ȯ��
		System.out.println(lc.isLeapYear());
		//����Ȯ��
		LocalDate lc1 = date.toLocalDate();
		System.out.println(lc1.isLeapYear());
		
		//��¥ ����
		System.out.printf("���� ��¥:%s%n", date);
		System.out.printf("���� ��¥:%s%n", date.plusDays(100));
		
		//���� ���� ������ ��¥ Ȯ��
		System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth());
		
		//��¥ �� ����
		LocalDate target = LocalDate.of(2010, 3, 11); //Ÿ�ٳ�¥ ����
		LocalDate target2 = LocalDate.of(2018, 2, 10); //Ÿ�ٳ�¥ ����
		System.out.println(date.toLocalDate().isBefore(target));//false ���簡 ����  
		System.out.println(date.toLocalDate().isBefore(target2));//true
		//���۳�¥ - Ÿ�ϳ�¥���� ���� ��¥ ����
		System.out.println(ChronoUnit.DAYS.between(date.toLocalDate(), target2));
		
		//��¥ ������ ���ڿ��� ��¥ ��ü�� ��ȯ (��¥ ������ ���ڿ��� �����Ǿ� �־�� ��!)
		LocalDate target3 = LocalDate.parse("2017-12-05");
		System.out.println(ChronoUnit.DAYS.between(date.toLocalDate(), target3));
		
		//��¥ ���� ����
		System.out.println(date);
		System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd��")));
	
	}
}