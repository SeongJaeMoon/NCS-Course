package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sample_01 {

	public static void main(String[] args) {
		
		//����Ÿ�� enum (����� ���� �ڷ���)
		//������ �� �������� ��� �ϳ��� �ڷ����� ǥ���� ����
		//���� ���, ���ϸ�(��, ȭ, ��, ��, ��, ��, ��)
		//����Ÿ�� �̸��� ���������� ù���ڴ� �빮�ڷ� ǥ��, ���� ���, (Week, Months, etc...)
		//����Ÿ���� ���������� ���� �ۼ�(.java)�ϰ�, ���� �����Ѵ�
		//����Ÿ�Ը� ���� = ����Ÿ��.���Ż��;
		/*
		 * public enum ����Ÿ�Ը�{
		 * ��1; -> ������ ���� ���Ż����� �θ���! ���������� �빮�ڷθ� �ۼ��ϴ°� ���� ���� ���, MONDAY
		 * ��2;
		 * ...
		 * 
		 * }
		 */
		//������ MONDAY ���� ���� Week ��ü�� �����ּҰ� ���޵ȴ�.
		Week week1 = Week.MONDAY;
		Week week2 = Week.MONDAY;
		Week week3 = Week.WENDESDAY;
		//������ ���� ���� ������ ���� == ������ �����ּҸ� ���Ѵ�.
		System.out.println(week1 == week2);//true ��ȯ
	}
}