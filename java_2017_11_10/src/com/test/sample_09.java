package com.test;

public class sample_09 {

	public static void main(String[] args) {
		//�迭 ���� ���ǻ���
		//�޼ҵ� �Ű������� �迭 ��ü ���޽� ����Ͽ� ���� �迭�� ���� �Ұ�.
		// -> new ������ ���
		
		//�ùٸ� ��
		int[]score;
		score = new int[]{10, 20, 30};
		//����ڰ� �غ��� �޼ҵ� ȣ�� �� �Ű����� �� ����
		int sum = add(score);
		System.out.printf("%d%n", sum);
		
		//Ʋ�� ��, ���� ����
		//add({10, 20, 30});
		int sum1 = add(new int[] {10, 20, 30});
		System.out.printf("%d%n", sum1);
	}
	
	public static int add(int[]a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
