package com.schedule;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ScheduleService service = new ScheduleService();
		
		while(true) {
			System.out.println("1.���� �Է� 2.���� ��� 3.���� �˻�");
			System.out.println("����(1~2, 0 quit)?");
			int input = sc.nextInt();
			sc.nextLine();
			if(input==0)break;
			switch (input) {
			case 1:service.scheduleAdd(sc);break;
			case 2:service.scheduleList();break;
			case 3:service.scehduleList(sc);break;
			}
		}	
		sc.close();
		System.out.println("���α׷� ����.");
	}
}
