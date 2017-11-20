package oop.test003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * FieldInitValue initValue = new FieldInitValue();
		 * 
		 * System.out.println(initValue.intField);//0
		 * System.out.println(initValue.floatField);//0.0
		 * System.out.println(initValue.longField);//0
		 * System.out.println(initValue.stringField);//null
		 * System.out.println(initValue.arr);//null
		 */

		// ����) 10���� ���ڸ� �Է� �޾Ƽ�, 2���� ���ڿ��� ����ϴ� �ڵ� �ۼ�.

		/*
		 * 10���� -> 2���� ��ȯ 
		 * 10����(0 exit)?15 
		 * 15(10) -> 1111(2) 
		 * ���α׷� ����.
		 */
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean run = true;
		int input;
		System.out.println("10���� -> 2����");
		while (run) {
			System.out.println("10����(0 exit)?");
			input = sc.nextInt();
			sc.nextLine();
			if(input==0) {
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				sc.close();
			}else {
				
				String result = ""; //���ڿ��� �߰��� �ӽú��� ����
				int temp = input; //�Է� ���� ��Ÿ�� �ӽú��� ����
				String result1 = "";//�������� ������ ����� ���� ����
					
					while(input != 1) {
						result += String.valueOf(input%2); //�Է� ���� 2�� ���� ������ ���� ������� ����
						input /= 2; //�ش� ���� 2�� ���� ���� �Ҵ�
					}
					
					result += 1;//������ 1�� ���� ���ϱ� ���� �ݺ����� ���������Ƿ� 1�� ������
					
					for(int i = result.length()-1; i >= 0; --i) {
						
						result1 += result.charAt(i); //����� ������� �������� ������
					}
					
					System.out.printf("%d(10) -> %s(2)%n", temp, result); //10���� �Է°��� 2���� ��ȯ �� ���
			}
		}
	}
}
