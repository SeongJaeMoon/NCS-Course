package oop.test;

import java.util.*;

public class BankApplication {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AccountService service = new AccountService();	
		//ȭ��(�޴�) �׼�
		boolean run = true;
		while(run) {
			
			System.out.println("-------------------------------------------");
			System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����.");
			System.out.println("-------------------------------------------");
			System.out.print("����>");
			
			int selectNo = sc.nextInt();
				//AccountService Ŭ������ createAccount() �޼ҵ� ȣ��
				//->�ñ״�ó �м�
				//->public static void createAccount(Scanner sc)
			//�޴� �׼�
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
		System.out.println("���α׷� ����.");
		
	}
}