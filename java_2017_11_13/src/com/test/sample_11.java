package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sample_11 {

	public static void main(String[] args) {
		// ����) �������� �̸�, ������ �ܺ� �Է� �ް�, ��½� �̸�(��������) �Ǵ� ����(��������)�� ���� ����
		// ���� : �迭�� �̸� �����, ���� ����� ���� �غ��ϰ�, �̸�, ������ ��Ī�ϱ� ���ؼ� ���� index�� ���

		String[] names = new String[5];
		int[] scores = new int[5];
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}
		
		 System.out.println("������ �Է��ϼ���."); 
		 for(int i = 0; i < names.length; i++) {
			 scores[i] = sc.nextInt();
		 }
		String []namesCopy = Arrays.copyOf(names, names.length); 
		int []scoresCopy = Arrays.copyOf(scores, scores.length);  
		System.out.println();

		while (run) {
			System.out.println("�̸����� �������� : 1, ������ �������� : 2, ���� : 0");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("������");
				System.out.println(Arrays.toString(namesCopy));
				System.out.println(Arrays.toString(scoresCopy));
				for (int i = 1; i < names.length; i++) {
					for (int j = 0; j < names.length - i; j++) {
						if (names[j].compareTo(names[j + 1]) > 0) {
							String temp1 = names[j];
							names[j] = names[j + 1];
							names[j + 1] = temp1;
							int temp = scores[j];
							scores[j] = scores[j + 1];
							scores[j + 1] = temp;
						}
					}
				}
				System.out.println("���� ��");
				for(int a = 0; a < names.length; a++) {
					System.out.printf("�̸� : %s, ���� : %d %n", names[a], scores[a] );
				}
				break;
			case 2:
				System.out.println("���� ��");
				System.out.println(Arrays.toString(namesCopy));
				System.out.println(Arrays.toString(scoresCopy));
				for (int i = 1; i < scores.length; i++) {
					for (int j = 0; j < scores.length - i; j++) {
						if (scores[j] < scores[j + 1]) {
							int temp = scores[j];
							scores[j] = scores[j + 1];
							scores[j + 1] = temp;
							String temp1 = names[j];
							names[j] = names[j + 1];
							names[j + 1] = temp1;
						}
					}
				}
				System.out.println("���� ��");
				for(int a = 0; a < names.length; a++) {
					System.out.printf("�̸� : %s, ���� : %d %n ", names[a], scores[a] );
				}
				break;
			default:
				run = false;
				sc.close();
				break;
			}
		}
	}
}
