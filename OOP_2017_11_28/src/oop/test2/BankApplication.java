package oop.test2;

import java.util.*;

public class BankApplication {


	public static void main(String[] args) {
		//Local variable
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
			//->case ������ ���๮�� �� ���� �̻� �ִ� ���� �������� �ʴ´�.
			switch(selectNo) {
			case 1:service.createAccount(sc);break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:run = false;break;
			}
		}
		//�ڹ� ���� �ڿ��� �ƴ� �ܺ� �ڿ�(�ü��) ���� close() �޼ҵ� ȣ��!
		sc.close();
		System.out.println("���α׷� ����.");	
	}
}