package com.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Scanner;

public class sample_09 {

	public static void main(String[] args) {
		// ����) �ߺ����� ���� ���� �������� ��� ���α׷� �ڵ� �ۼ�.
		// �ζ� ���� ������ ����(1~45) 6���� ���� �� �ߺ��� ���ڰ� ���� ���·� ���� �Ѵ�.
		// �ζ� ���� 6���� �� ���� ������ ��� ���
		// 6�� ���ڸ� ��½� ���ĵ� ���·� ��� -> ��������
		// �ִ� ���� ���� 10��
		/*
		 * ���¿�) ���ϴ� ���(1~n) ex.5 �ߺ��� ����� �ȴ�.
		 */

		int rottoNum = (int) (Math.random()) * 45 + 1;
		Scanner input = new Scanner(System.in);
		int max = 0;
		boolean isOk = true;
		boolean run = true;
		System.out.println("�ζ� ����ϴ� ���� �Դϴ�.");
		while (run) {
			System.out.println("�ζ� ����� Ŭ�����ּ���(�������� :10)");
			int size = input.nextInt();
			input.nextLine();
			int[][] rottoArray = new int[size][6];
			int[] colum = new int[size * 6];
			System.out.println(colum.length);
			if (size > 10) {
				System.out.println("��� ������ 10���Դϴ�.");
			} else {
				
			}
		}
		input.close();
	}
}
