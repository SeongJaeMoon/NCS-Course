package com.test;

public class sample_04 {

	public static void main(String[] args) {
		
		int[][]array = {{95,86}, {83,92,96}, {78,83,93,87,88}};
		
		int sum = 0;
		double avg = 0.0;
		int num = 0;
		//-> ��ø for�� ���
		//-> ����� ������ Ȯ���ϴ� ���� ���� �߰�
		for(int[]arr : array) {
			for(int a : arr) {
				++num;
				sum += a;
			}
		}
		avg = sum/(double)num;
		System.out.println(num);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}