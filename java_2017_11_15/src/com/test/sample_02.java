package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sample_02 {

	public static void main(String[] args) {

		// �ý����� ��¥ �� ���� Ȯ��
		// java.util.Calendar Ŭ���� �� Week �����ڷ���

		Calendar cal = Calendar.getInstance();

		// get�޼ҵ�� �̿��ؼ� �ý����� ��¥, ���� ���� Ȯ��
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		// 1,2,3,4,5,6,7
		// �� �� ȭ �� �� �� ��
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
		System.out.printf("���� ������ %s�Դϴ�.", today.name());//.name�� ���ڿ�, today�� ����Ÿ��
															 //.ordinal -> �ڵ��� ����
	}
}