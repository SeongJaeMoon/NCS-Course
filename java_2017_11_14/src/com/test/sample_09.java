package com.test;

import java.util.Scanner;

public class sample_09 {

	public static void main(String[] args) {

		/*
		 * ��¿�) ũ�⸦ �Է��� �ּ���(max : 14) : 5
		 * 
		 * 1 2 3 4 5 16 17 18 19 6 15 24 25 20 7 14 23 22 21 8 13 12 11 10 9
		 * 
		 * ����Ϸ��� �ƹ�Ű�� �����ʽÿ�.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ũ�⸦ �Է����ּ���~: ");

			int size = sc.nextInt();
			sc.nextLine();
			
			//0�Է½� ����
			if(size ==0) break;
			
			int[][] arr = new int[size][size];
			// �迭�� �ʱ�ȭ
			// 1���� (size*size)������ ���� ���������� �ʱ�ȭ
			int temp = 1;
			int z = 0, q = -1;
			int count = 0;
			while (size > 0) {
				for (int i = 0; i < size; i++) {
					q += temp;
					arr[z][q] = ++count;
				}
				--size;
				for (int i = 0; i < size; i++) {
					z += temp;
					arr[z][q] = ++count;
				}
				temp = -temp;
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("%3d", arr[i][j]);
				}
				System.out.print("\n");
			}
			System.out.println("����Ϸ��� EnterŰ�� �����ʽÿ�... ");
			sc.nextLine();
		}
		sc.close();
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
