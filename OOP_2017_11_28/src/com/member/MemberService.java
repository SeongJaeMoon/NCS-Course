package com.member;

import java.util.Scanner;

//(�ܼ�)���� ���� Ŭ����
public class MemberService {
	
	//(�迭)����� ��ü
	private MemberDAO dao = new MemberDAO();
	
	public void memberAdd(Scanner sc) {
		System.out.println("------------");
		System.out.println("ȸ������ �Է�.");
		System.out.println("------------");
		System.out.print("�̸�:");
		String name = sc.next();
		System.out.print("��ȭ��ȣ:");
		String phone = sc.next();
		System.out.print("�̸���:");
		String email = sc.next();
		System.out.print("�����:(yyyy-MM-dd)");
		String regDate = sc.next();
		this.dao.memberAdd(name, phone, email, regDate);
	}
	
	public void memberList(){
		System.out.println("ȸ������ ���");
		System.out.print(this.dao.memberList());
	}
	public void memberSearch(Scanner sc){
		System.out.println("ȸ������ �˻�");
		String name = sc.next();
		System.out.print(this.dao.memberSearch(name));
	}
}
