package com.test;

public class sample_05 {

	public static void main(String[] args) {
	
		//�迭�� ������ ��(���� 0~100) ������(5��)�� �غ��ϰ�, ��, ��� ����ؼ� ����ϴ� �ڵ� �ۼ�.
		//�Է� -> ó�� -> ��� ���� ���� 
		int [] arr1 = new int[5];
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			int random1 = (int)(Math.random()*101);
			arr1[i] = random1;
			sum += arr1[i];
			System.out.printf("arr1[%d] : %d%n", i ,arr1[i]);	
		}
		System.out.printf("%n �迭 ����� ���� : %d%n ����� : %.1f", sum, sum/(double)arr1.length);	
	}
}
