package oop.account.test;

import java.util.*;

public class Main {


	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in); //스캐너 객체 생성
		Service service = new Service(); //서비스 객체 생성
		service.accountAdd(); //객체 초기화
		System.out.println("초기 예금액은 10000원 입니다.");
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.입금 2.출금 3.추가 4.계좌목록");
			System.out.println("---------------------------");
			int input = sc.nextInt();
			String inputAccount = sc.nextLine();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.println("입금을 선택하였습니다. 계좌를 입력해주세요.");
				inputAccount = sc.nextLine();
				if(service.isFindAccount(inputAccount)) {
				System.out.println("입금액을 입력해주세요.");
				input = sc.nextInt();
				sc.nextLine();
				service.accountAdd(input);
				}else {
					System.out.println("계좌번호를 잘못 입력하였습니다. 다시 시도하세요.");
				}
				break;
			case 2:
				System.out.println("출금을 선택하였습니다. 계좌를 입력해주세요.");
				inputAccount = sc.nextLine();
				if(service.isFindAccount(inputAccount)) {
				System.out.println("출금액을 입력해주세요.");
				input = sc.nextInt();
				sc.nextLine();
				service.accountSub(input);
				}else {
					System.out.println("계좌번호를 잘못 입력하였습니다. 다시 시도하세요.");
				}
				break;
			case 3:
				System.out.println("추가할 계좌 번호를 입력해주세요.");
				inputAccount = sc.nextLine();
				service.accountAdd(inputAccount);
				break;
			case 4:
				service.accountList();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				sc.close();
				break;
			}
		}
	}
}
