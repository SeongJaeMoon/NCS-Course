package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sample_14 {

	public static void main(String[] args) {

		//�л���, �����Է�, ��������Ʈ, �м�, ���� ����� ���� ���α׷� �ۼ�.
		//1�ܰ�) �л��� ���� �������� �ܺο��� �Է� �޾Ƽ� �迭�� �����ϰ�, ��������Ʈ ��� 
		//2�ܰ�) �ְ�����, ������� �߰� ���
		//3�ܰ�) ������ �ܺ� �Է� �޾Ƽ� �迭�� ����
		/*
		��¿�)
		 */
	
		Scanner sc = new Scanner(System.in);
		
		//�ܺ� �Է�
		int studentNum = 5;
		int[]score = null;
		score = new int[studentNum];
		for(int i = 0; i < score.length; i++) {
			System.out.printf("score[%d]>", i);
			score[i] = sc.nextInt();
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("score[%d] : %d%n", i, score[i]);
		}
		
		//�ְ�����, ������� ���
		int max = score[0];
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		double avg = sum / (double)studentNum;
		System.out.printf("�ְ�����: %d, �������: %.1f%n", max, avg);
		
		sc.close();
		System.out.println("���α׷� ����");
	}
}
