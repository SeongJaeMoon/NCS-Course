package oop.account.test;

import java.util.*;

public class Main {


	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in); //��ĳ�� ��ü ����
		Service service = new Service(); //���� ��ü ����
		service.accountAdd(); //��ü �ʱ�ȭ
		System.out.println("�ʱ� ���ݾ��� 10000�� �Դϴ�.");
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.�Ա� 2.��� 3.�߰� 4.���¸��");
			System.out.println("---------------------------");
			int input = sc.nextInt();
			String inputAccount = sc.nextLine();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.println("�Ա��� �����Ͽ����ϴ�. ���¸� �Է����ּ���.");
				inputAccount = sc.nextLine();
				if(service.isFindAccount(inputAccount)) {
				System.out.println("�Աݾ��� �Է����ּ���.");
				input = sc.nextInt();
				sc.nextLine();
				service.accountAdd(input);
				}else {
					System.out.println("���¹�ȣ�� �߸� �Է��Ͽ����ϴ�. �ٽ� �õ��ϼ���.");
				}
				break;
			case 2:
				System.out.println("����� �����Ͽ����ϴ�. ���¸� �Է����ּ���.");
				inputAccount = sc.nextLine();
				if(service.isFindAccount(inputAccount)) {
				System.out.println("��ݾ��� �Է����ּ���.");
				input = sc.nextInt();
				sc.nextLine();
				service.accountSub(input);
				}else {
					System.out.println("���¹�ȣ�� �߸� �Է��Ͽ����ϴ�. �ٽ� �õ��ϼ���.");
				}
				break;
			case 3:
				System.out.println("�߰��� ���� ��ȣ�� �Է����ּ���.");
				inputAccount = sc.nextLine();
				service.accountAdd(inputAccount);
				break;
			case 4:
				service.accountList();
				break;
			default:
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				sc.close();
				break;
			}
		}
	}
}
