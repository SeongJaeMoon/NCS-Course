package oop.test2;

public class Service {

	
	// ->입력, 출력, 처리 등을 독립적인 메소드
	// ->공통 자료 -> 필드로 구성

	private DAO dao = new DAO();
	
	// 계좌 정보 생성
	// instance method
	public void accountAdd() {
		Account hong = new Account();
		
		hong.setAccountName("홍길동");
		hong.setAccountNumber("111-1111");
		hong.setBalance(10000);
		
		Account park = new Account();
		
		park.setAccountName("박길동");
		park.setAccountNumber("222-2222");
		park.setBalance(20000);
		
		//계좌 객체를 저장소에 저장하는 instance 메소드 호출
		this.dao.accountAdd(hong);
		this.dao.accountAdd(park);
	}

	// 계좌 정보 출력
	// instance method
	public void accountList() {
		
		System.out.println("------");
		System.out.println("계좌정보");
		System.out.println("------");
		
		for(Account a : this.dao.accountList()) {
			if(a==null)continue;
			System.out.println(a.getAccountInfo());
		}
	}
}
