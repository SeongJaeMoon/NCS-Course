package com.test;

public class sample_06 {

	public static void main(String[] args) {
	
		//�迭�� ������ ��(���� 0~100) ������(5��)�� �غ��ϰ�, ��, ��� ����ؼ� ����ϴ� �ڵ� �ۼ�.
		//�Է� -> ó�� -> ��� ���� ����
		int []arr1 = new int[5];
		StringBuilder sb = new StringBuilder();
		//----�Է°���----
		for(int i = 0; i < arr1.length; i++) {
			int temp = (int)(Math.random()*101);
			arr1[i] = temp;
			sb.append(String.format("arr1[%d] : %d %n", i, arr1[i]));
		}
		int max = arr1[0];
		//----ó������----
		for(int i = 0; i < arr1.length; i++) {
			if(max < arr1[i])
				max = arr1[i];
		}
		//----��°���----
		System.out.println("------------");
		System.out.println("�ִ밪 ���ϱ�");
		System.out.printf(sb.toString());
		System.out.printf("�ִ� �� : %d ", max);
		
	}
}
