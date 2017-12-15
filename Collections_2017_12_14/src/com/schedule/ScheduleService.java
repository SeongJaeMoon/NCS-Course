package com.schedule;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

//�޴� �׼� ������ ���� ���� Ŭ����
public class ScheduleService {
	
	//(�÷���) ����� ������ ���� ���� ���� -> ���� Ŭ���� ���ο��� ���� ����
	private ScheduleDAO dao = new ScheduleDAO();
	
	//������ �ڷ� ��� -> Scanner ��ü �ʿ�
	//������ ���Ե� �Է��� ���� ���� nextLine() �޼ҵ� ����̴�!
	public void scheduleAdd(Scanner sc) {
		System.out.print("��¥(YYYY-MM-DD)?");
		String date = sc.next();
		System.out.print("����(200�� �̳�)?");
		String content = sc.nextLine();
		sc.nextLine();
		this.dao.scheduleAdd(date, content);
		System.out.println("������ �߰��Ǿ����ϴ�.");
	}
	
	//������ �ڷ� ��ü ���
	public void scheduleList() {
		System.out.println(this.dao.scheduleList());
	}
	
	//������ �˻� ���
	/*
	 --- ���� ���(����޴�) ---
	1. ���� ����
	2. Ư�� �� ����
	3. Ư�� �� ����
	4. Ư�� �ܾ� ���� ����
	5. ��ü ����  
	 */
	public void scehduleList(Scanner sc) {
		// ���� ��¥(YYYY-MM-DD)���� �˻�
		while (true) {
			System.out.println("---���� ���(���� �޴�)---");
			System.out.printf("1. ���� ����%n2. Ư�� �� ����%n3. Ư�� �� ����%n4. Ư�� �ܾ� ���� ����%n5. ��ü ����%n");
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
		return this.dao.scheduleSearch("��ȣ", String.valueOf(value));
	}
	private String todayList() {
		LocalDateTime date = LocalDateTime.now();
		String value = (date.format(DateTimeFormatter.ISO_LOCAL_DATE)).toString();
		return this.dao.scheduleSearch("��¥", value);
	}
	private String dayList(Scanner sc) {
		System.out.print("��¥(YYYY-MM)");
		String value = sc.next();
		return this.dao.scheduleSearch("��¥", value);
	}
	private String monthList(Scanner sc) {
		System.out.print("��¥(YYYY-MM-DD");
		String value = sc.next();
		return this.dao.scheduleSearch("��¥", value);
	}
	private String wordList(Scanner sc) {
		System.out.print("Ư�� �ܾ�?");
		String value = sc.next();
		return this.dao.scheduleSearch("����", value);
	}
}
