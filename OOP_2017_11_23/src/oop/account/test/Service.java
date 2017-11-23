package oop.account.test;

public class Service {

	private DAO dao = new DAO();//DAO 객체 생성
	private Account account = new Account("1111", "홍길동", 10000); //Account 객체 생성
	
	public void accountAdd(){//프로그램 시작시 초기화 지정용 메소드 
		this.dao.accountAdd(this.account);
	}
	
	public void accountAdd(String accountNumber) { //계좌번호 추가 메소드 
		if(this.dao.accountFindOut(accountNumber)!=null) {//이미 개설된 계좌번호라면
			System.out.println("이미 개설된 계좌번호 입니다.");
		}else {
		this.account = new Account(accountNumber); //새로운 계좌객체 생성
		this.dao.accountAdd(this.account);//계좌번호 추가
		System.out.printf("계좌 %s가 추가되었습니다.%n", accountNumber);
		}
	}
	
	public boolean isFindAccount(String accountNumber){//계좌번호 존재 여부 확인용 메소드
		boolean isTrue = false; //참, 거짓 반황용 변수 선언
		if(this.dao.accountFindOut(accountNumber)!=null)//이미 존재하는 계좌번호이라면
			isTrue = true; //참 값 할당
		return isTrue; //참 거짓 판단용 값 리턴
	}
	
	public void accountAdd(int balance) { //입금용 메소드
		account.setBalanceAdd(balance);
		System.out.println(account.getAccountInfo());
		
	}
	public void accountSub(int balance) { //출금용 메소드
		account.setBalanceSub(balance);
		System.out.println(account.getAccountInfo());
	}
	
	public void accountList() { //전체 계좌목록 출력용 메소드
		System.out.println("-------");
		System.out.println("계좌정보");
		System.out.println("-------");
		for(Account a : this.dao.accountList()) {
			if(a==null)continue;
			System.out.println(a.getAccountInfo());
		}	
	}
}
