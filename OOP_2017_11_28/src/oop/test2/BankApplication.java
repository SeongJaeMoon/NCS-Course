package oop.test2;

import java.util.*;

public class BankApplication {


	public static void main(String[] args) {
		//Local variable
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
			//->case 구문에 실행문을 한 문장 이상 넣는 것은 권장하지 않는다.
			switch(selectNo) {
			case 1:service.createAccount(sc);break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:run = false;break;
			}
		}
		//자바 내부 자원이 아닌 외부 자원(운영체제) 사용시 close() 메소드 호출!
		sc.close();
		System.out.println("프로그램 종료.");	
	}
}