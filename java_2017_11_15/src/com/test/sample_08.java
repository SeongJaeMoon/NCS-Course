package com.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Scanner;

public class sample_08 {

	public static void main(String[] args) {
		// ����) �ߺ����� ���� ���� �������� ��� ���α׷� �ڵ� �ۼ�.
		// �ζ� ���� ������ ����(1~45) 6���� ���� �� �ߺ��� ���ڰ� ���� ���·� ���� �Ѵ�.
		// �ζ� ���� 6���� �� ���� ������ ��� ���
		// 6�� ���ڸ� ��½� ���ĵ� ���·� ��� -> ��������
		// �ִ� ���� ���� 10��
		/*
		 * ���¿�) ���ϴ� ���(1~n) ex.5 �ߺ��� ����� �ȴ�.
		 */

		Scanner input = new Scanner(System.in);
		int cnt = 0;
		boolean isOk = true;
		boolean run = true;
		System.out.println("�ζ� ����ϴ� ���� �Դϴ�.");
		while (run) {
			System.out.println("�ζ� ����� Ŭ�����ּ���(�������� :10)");
			int size = input.nextInt();
			input.nextLine();
			int[][] rottoArray = new int[size][6];

			if (size > 10) {
				System.out.println("��� ������ 10���Դϴ�.");
			} else {
				while (isOk) {
					for (int i = 0; i < rottoArray.length; i++) {
						int[] rottoColum = new int[6];
						for (int j = 0; j < 5; j++) {
							rottoColum[j] = (int) (Math.random() * 45) + 1;				
						}
						Arrays.sort(rottoColum);
						
						if(Arrays.equals(rottoArray[i], rottoArray[i+1]))
							]
						rottoArray[i] = rottoColum;
					}
					isOk = false;
				}
				for (int i = 0; i < size; i++) {
					System.out.println(Arrays.toString(rottoArray[i]));
				}
			}
		}
		input.close();
	}
}
