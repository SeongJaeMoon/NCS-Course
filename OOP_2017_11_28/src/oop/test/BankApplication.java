package oop.test;

import java.util.*;

public class BankApplication {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AccountService service = new AccountService();	
		//화면(메뉴) 액션
		boolean run = true;
		while(run) {
			
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료.");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = sc.nextInt();
				//AccountService 클래스의 createAccount() 메소드 호출
				//->시그니처 분석
				//->public static void createAccount(Scanner sc)
			//메뉴 액션
			if (selectNo == 1) {
				service.createAccount(sc);
			} else if (selectNo == 2) {
				//accountList(sc);
			} else if (selectNo == 3) {
				//deposit(sc);
			} else if (selectNo == 4) {
				//withdraw(sc);
			} else if (selectNo == 5) {
				run = false;
			}
			
		}
		
		sc.close();
		System.out.println("프로그램 종료.");
		
	}
}