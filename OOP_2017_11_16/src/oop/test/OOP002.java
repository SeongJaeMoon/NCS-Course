package oop.test;

import java.util.Scanner;

public class OOP002 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int put;
		String color = "블랙";
		String paper = "hello World";
		int paperNum = 5;
		Printer printer = new Printer(1, paper, color, paperNum);
		System.out.println("프린트 예제 프로그램입니다.");
		while(printer.getPower()!=0) {
			System.out.println("--------------------------");
			System.out.println("1.복사 2.스캔 3.출력 4.종이추가 5.종료");
			System.out.println("--------------------------");
			put = sc.nextInt();
			sc.nextLine();
			switch(put) {
				case 1:
					paper = printer.copy("쌍용!", 2);
					break;
				case 2:
					paper = printer.scan(paper);
					break;
				case 3:
					System.out.println("색상을 선택해주세요.(블랙/컬러)");
					color = sc.nextLine();
					sc.nextLine();
					printer.setToner(color);
					printer.print(paper, printer.getToner(), 2);
					break;
				case 4:
					printer.setPaper(5);
					break;
				case 5:
					System.out.println("프로그램을 종료합니다");
					printer.setPower(0);
					sc.close();
					break;
			}
		}
	}
}
