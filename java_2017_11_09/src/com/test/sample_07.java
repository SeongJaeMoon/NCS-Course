package com.test;

public class sample_07 {

	public static void main(String[] args) {

		//����) ���ڿ��� �Ʒ� ���·� ����ϴ� �ڵ� �ۼ�.
		//��ø for��, ASCII�ڵ� 65~69 A, B, C, D, E
		//��ø for��, ASCII�ڵ� 65~73 A, B, C, D, E, F, G, H, I
		/*
		 * A
		 * A B
		 * A B C 
		 * A B C D E
		 */
		
		/* A B C D E
		 * B C D E F
		 * C D E F G
		 * D E F G H
		 * E F G H I
		 */
		
		
		for(int i = 65; i <= 69; i++) {
			for(int j = 65; j <= i; j++) {
					System.out.printf("%c ", j);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		
		for(int i = 65; i <= 69; i++) {
			for(int j = i; j <= i + 4 ; j++) {
				System.out.printf("%c ", j);
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
}
