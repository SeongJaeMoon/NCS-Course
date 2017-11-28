package com.member;

import java.util.Scanner;

//(콘솔)서비스 관련 클래스
public class MemberService {
	
	//(배열)저장소 객체
	private MemberDAO dao = new MemberDAO();
	
	public void memberAdd(Scanner sc) {
		System.out.println("------------");
		System.out.println("회원정보 입력.");
		System.out.println("------------");
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("전화번호:");
		String phone = sc.next();
		System.out.print("이메일:");
		String email = sc.next();
		System.out.print("등록일:(yyyy-MM-dd)");
		String regDate = sc.next();
		this.dao.memberAdd(name, phone, email, regDate);
	}
	
	public void memberList(){
		System.out.println("회원정보 출력");
		System.out.print(this.dao.memberList());
	}
	public void memberSearch(Scanner sc){
		System.out.println("회원정보 검색");
		String name = sc.next();
		System.out.print(this.dao.memberSearch(name));
	}
}
