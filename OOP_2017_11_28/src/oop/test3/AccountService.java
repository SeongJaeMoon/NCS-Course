package oop.test3;

import java.util.Scanner;

public class AccountService {
	
	private AccountDAO dao = new AccountDAO();
	//계좌생성
	public void createAccount(Scanner sc) {
		
		//외부 입력->계좌번호, 계좌주, 초기입금액
		//계좌 생성(Account 객체 생성) 및 (배열)저장소에 저장 -> 메소드 호출
		//메시지 출력
		
		//next() - 한 단어 단위 입력. 공백 기준으로 단어 구분. nextLine() 메소드와 혼용시 줄바꿈 문자 처리 필요.
		//nextLine() - 한 문장 단위 입력. 
		
		System.out.println("------------");
		System.out.println("계좌 생성");
		System.out.println("------------");
		System.out.print("계좌번호:");
		String ano = sc.next();
		System.out.print("계좌주:");
		String owner = sc.next();
		System.out.print("초기입금액:");
		int balance = sc.nextInt();
		System.out.println("계좌가 생성되었습니다.");
		//계좌 객체 생성 및 (배열)저장소 저장
		//->AccountDAO 클래스의 createAccount() 메소드 호출
		//->메소드 시그니처 분석
		//->public static void createAccount(String ano, String owner, int balance)
		this.dao.createAccount(ano, owner, balance);
	}

	//입금 메소드
	public void deposit(Scanner sc) {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("예금액 : ");
		int balance = sc.nextInt();
		System.out.println("결과:예금이 성공되었습니다.");
		this.dao.deposit(ano, balance);
	}

	//출금 메소드
	public void withdraw(Scanner sc) {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("출금액 : ");
		int balance = sc.nextInt();
		System.out.println("결과:출금이 성공되었습니다.");
		this.dao.withdraw(ano, balance);
	}
	
	public void accountList() { //전체 계좌목록 출력용 메소드
		System.out.println("-------");
		System.out.println("계좌정보");
		System.out.println("-------");
		System.out.println(this.dao.accountList());
	}
}
