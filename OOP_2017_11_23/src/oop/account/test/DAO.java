package oop.account.test;

import java.util.Arrays;

	public class DAO {

		private Account[] accountArray = new Account[5]; //객체를 담을 배열 선언
		private int count = 0; //배열에 할당할 위치를 변경하기 위한 변수 선언
		

		public void accountAdd(Account a) {
			if (accountArray.length == count) //배열의 크기와 카운트가 같아진다면
				this.accountArray = Arrays.copyOf(this.accountArray, this.accountArray.length+5);//배열 복사 및 배열 크기 증가
			this.accountArray[this.count] = a; //배열에 객체 저장
			++this.count;//다음 배열에 추가하기 위해 위치값 증가
		}
		
		
		public Account accountFindOut(String accountNumber){
			Account account = null; //객체를 반환할 변수 선언
			for(Account a : accountArray) { //배열의 크기 만큼 찾기
				if(a==null)continue; //객체가 null이면 
				if(a.getAccountNumber().equals(accountNumber)) //객체의 저장된 계좌번호가 입력받은 값과 같다면
					account = a; //변수에 해당 객체 할당
			}
			return account;//객체 리턴
		}

		public Account[] accountList() {
			return this.accountArray; //배열 리턴
		}
 
}
