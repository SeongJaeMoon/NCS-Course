package com.test;

import java.util.Calendar;

public class sample_03 {

	public static void main(String[] args) {

		// �ý����� ��¥ �� ���� Ȯ��
		// java.util.Calendar Ŭ���� �� Week �����ڷ���

		Calendar cal = Calendar.getInstance();

		// get�޼ҵ�� �̿��ؼ� �ý����� ��¥, ���� ���� Ȯ��
		int week = cal.get(cal.DAY_OF_WEEK); 
		Week today = null;
		
		//if��, switch�� ��� �迭�� �̿��ؼ� ������ ���� ���� �� �ִ�.
		Week[]todays = {null, Week.SUNDAY, Week.MONDAY, Week.TUESDAY,
				Week.WENDESDAY, Week.THURSDAY, Week.FRIDAY, Week.SATURDAY}; 

		System.out.printf("������ ������ %s�Դϴ�.%n", todays[week]);
		
		//������ �ڷ����� ���� ��� ���
		for(Week a : Week.values()) {
			System.out.println(a);
		}
		//values()�޼ҵ带 Ȱ���ؼ� ������ �ε����� ����
		Week[]todays1 = Week.values();
		System.out.printf("������ ������ %s�Դϴ�.", todays1[week-1]); //�������� ÷�ڴ� 0���� ����
	}
}