package com.test;

public class sample_13 {

	public static void main(String[] args) {
		// x, y�� 1~10 ������ ����
		// 4x+5y=60�� �����ϴ� �ظ� ���ؼ� ���
		// (x, y)�� (1,1), (1,2), ...(10,10)�� ��� ����!
		String result = "";
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if ((4 * i) + (5 * j) == 60) {
					result += " (" + i + "," + j +") " +'\n';
				}
			}
		}
		System.out.print(result);
	}
}
// ��°��
/*
(5,8)
(10,4)
 */