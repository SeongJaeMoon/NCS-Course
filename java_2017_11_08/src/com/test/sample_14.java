package com.test;

public class sample_14 {

	public static void main(String[] args) {
		//��ø for�� �׽�Ʈ
		//������(*)�� �Ʒ� ���·� ����ϴ� �ڵ� �ۼ�.
		/*
		 
		 * 
		 **
		 ***
		 ****
		 ***** 
		 
		 */
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.print('\n');
		}
		System.out.print('\n');
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 0 ; j <= i; j++){
				System.out.print("* ");
			}
			System.out.print('\n');
		}
		System.out.print('\n');
		
	}
}
// ��°��
/*

 */