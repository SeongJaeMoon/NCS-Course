package com.test;

import java.util.Scanner;

public class sample_09 {

	public static void main(String[] args) {

		/*
		 * 출력예) 크기를 입력해 주세요(max : 14) : 5
		 * 
		 * 1 2 3 4 5 16 17 18 19 6 15 24 25 20 7 14 23 22 21 8 13 12 11 10 9
		 * 
		 * 계속하려면 아무키나 누르십시오.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("크기를 입력해주세요~: ");

			int size = sc.nextInt();
			sc.nextLine();
			
			//0입력시 멈춤
			if(size ==0) break;
			
			int[][] arr = new int[size][size];
			// 배열의 초기화
			// 1부터 (size*size)까지의 수를 순차적으로 초기화
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
			System.out.println("계속하려면 Enter키를 누르십시오... ");
			sc.nextLine();
		}
		sc.close();
		System.out.println("프로그램이 종료되었습니다.");
	}
}
