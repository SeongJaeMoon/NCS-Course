package oop.test3;

import java.util.Scanner;

public class AccountService {
	
	private AccountDAO dao = new AccountDAO();
	//���»���
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
		System.out.println("���°� �����Ǿ����ϴ�.");
		//���� ��ü ���� �� (�迭)����� ����
		//->AccountDAO Ŭ������ createAccount() �޼ҵ� ȣ��
		//->�޼ҵ� �ñ״�ó �м�
		//->public static void createAccount(String ano, String owner, int balance)
		this.dao.createAccount(ano, owner, balance);
	}

	//�Ա� �޼ҵ�
	public void deposit(Scanner sc) {
		System.out.println("-----------");
		System.out.println("����");
		System.out.println("-----------");
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		System.out.print("���ݾ� : ");
		int balance = sc.nextInt();
		System.out.println("���:������ �����Ǿ����ϴ�.");
		this.dao.deposit(ano, balance);
	}

	//��� �޼ҵ�
	public void withdraw(Scanner sc) {
		System.out.println("-----------");
		System.out.println("���");
		System.out.println("-----------");
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		System.out.print("��ݾ� : ");
		int balance = sc.nextInt();
		System.out.println("���:����� �����Ǿ����ϴ�.");
		this.dao.withdraw(ano, balance);
	}
	
	public void accountList() { //��ü ���¸�� ��¿� �޼ҵ�
		System.out.println("-------");
		System.out.println("��������");
		System.out.println("-------");
		System.out.println(this.dao.accountList());
	}
}
