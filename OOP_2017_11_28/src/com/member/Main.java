
	//ȭ�� ���踦 ���� �м��� ����� �ʵ�� ���� -> getter, setter ����
	/*
	--------------------------------
	ȸ������ v1.0 (�ܼ� ����)
	- ȸ�� ���� �Է�, ȸ�� ���� ��� �׼� ����
	- ȭ�� ���踦 ���� �׸� ����->  �̸�, ��ȭ��ȣ, �̸���, �����(yyyy-MM-dd) ->�ڷ��� Ŭ����
	- ȭ�� ����
	--------------------------------------------
	 */
package com.member;

import java.util.Scanner;
//���� �޴� �׼� Ŭ����
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberService member = new MemberService();
		boolean run = true;
		//���� �޴� �׼�
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1. ȸ�� ���� �Է�  2. ȸ�� ���� ��� 3. ȸ�� ���� �˻�");
			System.out.println("����(1~3, 0 quit)?");
			
			int input = sc.nextInt();
			switch(input) {
			case 0:run = false;break;
			case 1:member.memberAdd(sc);break;
			case 2:member.memberList();break;		
			case 3:member.memberSearch(sc);break;
			}
		}	
		sc.close();
		System.out.println("���α׷� ����.");
	}
}
