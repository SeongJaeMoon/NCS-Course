package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sample_15 {

	public static void main(String[] args) {

		// �л���, �����Է�, ��������Ʈ, �м�, ���� ����� ���� ���α׷� �ۼ�.
		// 1�ܰ�) �л��� ���� �������� �ܺο��� �Է� �޾Ƽ� �迭�� �����ϰ�, ��������Ʈ ���
		// 2�ܰ�) �ְ�����, ������� �߰� ���
		// 3�ܰ�) ������ �ܺ� �Է� �޾Ƽ� �迭�� ����
		// 4�ܰ�) �л����� ���� �ܺ� �Է� �޾Ƽ� �迭�� ũ�� ����
		// 5�ܰ�) �޴� ���
		/*
		 * ��¿�)
		 */
		int[] score = null;
		int studentNum = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���α׷��Դϴ�.");
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("-----------------------------------------");
			int input = sc.nextInt();
			sc.nextLine();
			if(input == 1){
				System.out.printf("����>%d",input);
				// �ܺ� �Է�
				studentNum = sc.nextInt();
				sc.nextLine();
				score = new int[studentNum];
			}
			else if(input == 2) {
				System.out.println("������ �Է����ּ���.");
				for (int i = 0; i < score.length; i++) {
					System.out.printf("score[%d]>", i);
					score[i] = sc.nextInt();
					sc.nextLine();
				}

			}else if(input == 3) {
				System.out.printf("����>%d",input);
				for (int i = 0; i < score.length; i++) {
					System.out.printf("score[%d] : %d%n", i, score[i]);
				}
			}else if(input == 4) {
				System.out.printf("����>%d",input);
				// �ְ�����, ������� ���
				int max = score[0];
				int sum = 0;

				for (int i = 0; i < score.length; i++) {
					sum += score[i];
					if (max < score[i]) {
						max = score[i];
					}
				}
				double avg = sum / (double) studentNum;
				System.out.printf("�ְ�����: %d, �������: %.1f%n", max, avg);
			}else if(input == 5) {
				sc.close();
				System.out.println("���α׷� ����");
				run = false;
			}else {
				System.out.println("�� �� ���� �Է��Դϴ�.");
			}
		}
	}
}
