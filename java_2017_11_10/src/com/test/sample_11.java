package com.test;

public class sample_11 {

	public static void main(String[] args) {
		//���� for��.
		//�迭 �Ǵ� �÷��� ��ü Ž�� ���� �ݺ���.
		//�迭 ��ü�� ���������� Ž���ؼ� ��Ҹ� �ӽú����� �����Ѵ�.
		/*
			for(�ڷ��� ������ : �迭��ü){
			}
		 */
		//�Ϲ� for��
		int []a = {10, 20, 30, 40, 50};
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] : %d%n", i, a[i]);
		}
		//���� for��
		for(int i : a) { //�� �ε����� �°� �迭 a�� ���� ���� i�� �־��ش�. (i(��)�� Ž�� �� ���)
			System.out.println(i); //�ε����� ���� �� �� ����. 
		}
	}
}
