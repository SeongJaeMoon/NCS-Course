package com.test;

public class sample018 {

	int min(int x, int y) {
		int result = x<y ? x: y;
		return result;
	}
	int getMax(int []x) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < x.length; i++) {
			if(max < x[i]) {
				max = x[i];
			}
		}
		return max;
	}
	int getMin(int []x) {
		int min = Integer.MAX_VALUE;
		for(int i =0; i < x.length; i++) {
			if(min > x[i]) {
				min = x[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		//���� ������(���׿�����)
		//variable x = ���� ? ���ϰ�� :  �����ϰ��
		sample018 sample = new sample018();
		int ismin = sample.min(1, 2);
		System.out.println(ismin);
		int a = 10, b =20;
		ismin = sample.min(10, 20);
		
		//������ ���Ǽ� �� ���� ū ��
		//int a1 = 10;
		//int a2 = 10;
		//int a3 =10;
		//int temp = a1 > a2 ? a1 : a2;
		//int max = temp >a3 ? temp : a3;
		int [] x = {13, 1, 20,  2,  3,  7, 4};
		int getMaximum =sample.getMax(x);
		int getMinimum = sample.getMin(x);
		System.out.println(getMaximum);
		System.out.println(getMinimum);
	}
}
