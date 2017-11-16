package oop.test;

import java.util.Scanner;

public class OOP002 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int put;
		String color = "��";
		String paper = "hello World";
		int paperNum = 5;
		Printer printer = new Printer(1, paper, color, paperNum);
		System.out.println("����Ʈ ���� ���α׷��Դϴ�.");
		while(printer.getPower()!=0) {
			System.out.println("--------------------------");
			System.out.println("1.���� 2.��ĵ 3.��� 4.�����߰� 5.����");
			System.out.println("--------------------------");
			put = sc.nextInt();
			sc.nextLine();
			switch(put) {
				case 1:
					paper = printer.copy("�ֿ�!", 2);
					break;
				case 2:
					paper = printer.scan(paper);
					break;
				case 3:
					System.out.println("������ �������ּ���.(��/�÷�)");
					color = sc.nextLine();
					sc.nextLine();
					printer.setToner(color);
					printer.print(paper, printer.getToner(), 2);
					break;
				case 4:
					printer.setPaper(5);
					break;
				case 5:
					System.out.println("���α׷��� �����մϴ�");
					printer.setPower(0);
					sc.close();
					break;
			}
		}
	}
}
