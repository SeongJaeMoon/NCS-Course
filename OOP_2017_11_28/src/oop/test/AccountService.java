package oop.test;

import java.util.Scanner;

public class AccountService {
	
	AccountDAO dao = new AccountDAO();
	
	public void createAccount(Scanner sc) {
		
		//�ܺ� �Է�->���¹�ȣ, ������, �ʱ��Աݾ�
		//���� ����(Account ��ü ����) �� (�迭)����ҿ� ���� -> �޼ҵ� ȣ��
		//�޽��� ���
		
		//next() - �� �ܾ� ���� �Է�. ���� �������� �ܾ� ����. nextLine() �޼ҵ�� ȥ��� �ٹٲ� ���� ó�� �ʿ�.
		//nextLine() - �� ���� ���� �Է�. 
		
		System.out.println("------------");
		System.out.println("���� ����");
		System.out.println("------------");
		System.out.print("���¹�ȣ:");
		String ano = sc.next();
		System.out.print("������:");
		String owner = sc.next();
		System.out.print("�ʱ��Աݾ�:");
		int balance = sc.nextInt();
		System.out.print("���°� �����Ǿ����ϴ�.%n");
		//���� ��ü ���� �� (�迭)����� ����
		//->AccountDAO Ŭ������ createAccount() �޼ҵ� ȣ��
		//->�޼ҵ� �ñ״�ó �м�
		//->public static void createAccount(String ano, String owner, int balance)
		this.dao.createAccount(ano, owner, balance);
	}
}
