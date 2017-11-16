package oop.test;

import java.util.Scanner;

public class OOP003 {

	public static void main(String[] args) {

		CoffeeMachine coffeeMachine = new CoffeeMachine(50, "아메리카노", 100, 1);
		coffeeMachine.setPower(true);
		Scanner scanner = new Scanner(System.in);
		int input;
		String menu = null;
		System.out.println("커피를 만들어 주세요!");
		while (coffeeMachine.getPower()) {

			System.out.println("-------------------------------------");
			System.out.println("1.물의양 2.원두 3.온도 4.샷 5.커피뽑기 6.끄기");
			System.out.println("-------------------------------------");

			input = scanner.nextInt();
			scanner.nextLine();
			
			switch (input) {
			case 1:
				System.out.println("물의 양을 선택해주세요");
				input = scanner.nextInt();
				scanner.nextLine();
				coffeeMachine.setWater(input);
				break;
			case 2:
				System.out.println("원두를 선택해주세요");
				menu = scanner.nextLine();
				scanner.nextLine();
				coffeeMachine.setMenu(menu);
				break;
			case 3:
				System.out.println("적정 온도를 선택해주세요");
				input = scanner.nextInt();
				scanner.nextLine();
				coffeeMachine.setTemper(input);
				break;
			case 4:
				System.out.println("샷을 선택해주세요");
				input = scanner.nextInt();
				scanner.nextLine();
				coffeeMachine.setShot(input);
				break;
			case 5:
				System.out.println("선택한 옵션으로 커피를 로스팅합니다 :)");
				System.out.println(coffeeMachine.Loasting());
				break;
			case 6:
				System.out.println("커피머신을 끕니다.");
				scanner.close();
				coffeeMachine.setPower(false);
				break;
			default:
				System.out.println("알 수 없는 선택입니다.");
				break;
			}
		}
	}
}
