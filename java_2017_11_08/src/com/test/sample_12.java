package com.test;

public class sample_12 {

	public static void main(String[] args) {
		// ����
		// �ֻ����� ������ ���� ���� ���� ���� ���� �ƴϸ� ���� �ݺ� �� ���, 5�̸� ���� �ݺ� Ż��

		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			int diceSum = dice1 + dice2;
			System.out.println("first: " + dice1 + ", second: " + dice2 + " = " + diceSum);
			if (diceSum == 5) {
				break;
			}
		}
	}
}
// ��°��
/*
first :  ~, second : ~ = diceSum 
 */