package oop.test2;

import java.util.Arrays;

//(배열)저장소 관리 클래스
public class DAO {

	private Account[] accountArray = new Account[5];
	private int count = 0;
	// 매개변수를 통해서 전달되는 계좌 객체를 저장소에 저장하는 메소드
	// instance 메소드

	public void accountAdd(Account a) {
		// 두 개 이상의 객체 저장을 위해서 인덱스 관리 필요
		// 저장소 부족시 자동 증가 프로그램
		if (accountArray.length == count)
			this.accountArray = Arrays.copyOf(this.accountArray, this.accountArray.length+5);

		this.accountArray[this.count] = a;
		++this.count;

	}

	public Account[] accountList() {
		return this.accountArray;
	}
}
