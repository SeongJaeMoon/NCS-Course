package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sample_16 {

	public static void main(String[] args) {

		// �л���, �����Է�, ��������Ʈ, �м�, ���� ����� ���� ���α׷� �ۼ�.
		// 1�ܰ�) �л��� ���� �������� �ܺο��� �Է� �޾Ƽ� �迭�� �����ϰ�, ��������Ʈ ���
		// 2�ܰ�) �ְ�����, ������� �߰� ���
		// 3�ܰ�) ������ �ܺ� �Է� �޾Ƽ� �迭�� ����
		// 4�ܰ�) �л����� ���� �ܺ� �Է� �޾Ƽ� �迭�� ũ�� ����
		// 5�ܰ�) �޴� ���
		// 6�ܰ�) �л���(�迭 ũ��)�� ���������� ��ϵ��� ����. �ʱⰪ 5, �ڵ�Ȯ��(�迭ũ��+5)
		/*
		 * ��¿�)
		 */
		int[] score = new int[5];
		int[] scoreCopy = new int[score.length];
		
		int studentNum = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���α׷��Դϴ�.");
		while (run) {
			System.out.println("------------------------------------");
			System.out.println("2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("------------------------------------");
			int input = sc.nextInt();
			sc.nextLine();
			if (input == 2) {
				System.out.println("������ �Է����ּ���.");
				while (true) {
					System.out.printf("score[%d]>", studentNum);
					if(studentNum == score.length) {
						scoreCopy = new int[score.length];
						scoreCopy = Arrays.copyOf(score, score.length);
						score = new int[score.length+5];
					}
					score[studentNum] = sc.nextInt();
					sc.nextLine();
					++studentNum;
					System.out.println("�Է��� ����ұ��?(y/n)");
					String xy = sc.nextLine();
					sc.nextLine();
					if (xy.equalsIgnoreCase("n")) {
						System.out.printf("����>%s%n", xy);
						break;
					}
				}
			} else if (input == 3) {
				System.out.printf("����>%d%n", input);
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("score[%d] : %d%n", i, scoreCopy[i]);
				}
			} else if (input == 4) {
				System.out.printf("����>%d%n", input);
				// �ְ�����, ������� ���
				int max = scoreCopy[0];
				int sum = 0;

				for (int i = 0; i < studentNum; i++) {
					sum += scoreCopy[i];
					if (max < scoreCopy[i]) {
						max = scoreCopy[i];
					}
				}
				double avg = sum / (double) studentNum;
				System.out.printf("�ְ�����: %d, �������: %.1f%n", max, avg);
			} else if (input == 5) {
				sc.close();
				System.out.println("���α׷� ����");
				run = false;
			} else {
				System.out.printf("%d, %d, %d%n", score.length, scoreCopy.length ,studentNum);
				System.out.println(Arrays.toString(score));
				System.out.println(Arrays.toString(scoreCopy));
				//System.out.println("�� �� ���� �Է��Դϴ�.");
				sc.nextLine();
			}
		}
	}
}
