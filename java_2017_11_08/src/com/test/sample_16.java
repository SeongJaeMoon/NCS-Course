package com.test;

public class sample_16 {

	public static void main(String[] args) {
		// ��ø for�� �׽�Ʈ
		// ���� : ������(*)�� �Ʒ� ���·� ����ϴ� �ڵ� �ۼ�.
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		 *****
		  ****
		   ***
		    **
		     *
		 */

		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.print('\n');
		}
		System.out.print('\n');

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i > j)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.print('\n');
		}
	}
}
// ��°��
/*
 * 
 * 
 */