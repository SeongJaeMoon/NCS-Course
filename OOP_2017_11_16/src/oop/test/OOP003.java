package oop.test;

import java.util.Scanner;

public class OOP003 {

	public static void main(String[] args) {

		CoffeeMachine coffeeMachine = new CoffeeMachine(50, "�Ƹ޸�ī��", 100, 1);
		coffeeMachine.setPower(true);
		Scanner scanner = new Scanner(System.in);
		int input;
		String menu = null;
		System.out.println("Ŀ�Ǹ� ����� �ּ���!");
		while (coffeeMachine.getPower()) {

			System.out.println("-------------------------------------");
			System.out.println("1.���Ǿ� 2.���� 3.�µ� 4.�� 5.Ŀ�ǻ̱� 6.����");
			System.out.println("-------------------------------------");

			input = scanner.nextInt();
			scanner.nextLine();
			
			switch (input) {
			case 1:
				System.out.println("���� ���� �������ּ���");
				input = scanner.nextInt();
				scanner.nextLine();
				coffeeMachine.setWater(input);
				break;
			case 2:
				System.out.println("���θ� �������ּ���");
				menu = scanner.nextLine();
				scanner.nextLine();
				coffeeMachine.setMenu(menu);
				break;
			case 3:
				System.out.println("���� �µ��� �������ּ���");
				input = scanner.nextInt();
				scanner.nextLine();
				coffeeMachine.setTemper(input);
				break;
			case 4:
				System.out.println("���� �������ּ���");
				input = scanner.nextInt();
				scanner.nextLine();
				coffeeMachine.setShot(input);
				break;
			case 5:
				System.out.println("������ �ɼ����� Ŀ�Ǹ� �ν����մϴ� :)");
				System.out.println(coffeeMachine.Loasting());
				break;
			case 6:
				System.out.println("Ŀ�Ǹӽ��� ���ϴ�.");
				scanner.close();
				coffeeMachine.setPower(false);
				break;
			default:
				System.out.println("�� �� ���� �����Դϴ�.");
				break;
			}
		}
	}
}
