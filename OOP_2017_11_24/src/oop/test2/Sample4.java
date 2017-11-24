package oop.test2;

import 	java.util.Random;

public class Sample4 {
	//�ʵ� �ʱ�ȭ
			/*
			 -�ʵ� �ʱ�ȭ�� �Ʒ� ������� ����ȴ�.
			 1. �ڵ� �ʱ�ȭ
			 2. ����� �ʱ�ȭ
			 3. �����ڿ� ���� �ʱ�ȭ. ��, instance �ʵ忡 ���ؼ���.
			 4. static �ʱ�ȭ ���� ���� �ʱ�ȭ. ��, static �ʵ忡 ���ؼ���.
			 
			 -static �ʱ�ȭ ���� ���� ���� �ʱ�ȭ�� static �ʵ忡 ���ؼ� �ʱ�ȭ�� �� ���.
			 -����� �ʱ�ȭ�� ������ ��� �ʱ�ȭ �� ���. ���� ���, ���α׷� ���� ��������� �ʱ�ȭ �ϴ� ���.
			 
			 -����-
			 static{
			 	static���� = ��;
			 }
			 */

	//1���� 10������ ���� �ʱ�ȭ. ��, ������ �ʱ�ȭ.
	//���� �߻� -> Random Ŭ���� ���.
	//-> �ݺ��� ó��, for ������ ���Թ��� ���� �Ұ�
	//-> �ʱ�ȭ �� ���
	
	//static �ʵ�
	private static int[] arr;
	
	//static �ʱ�ȭ ���
	static {
		// �迭 ��ü ���� �� ������ ���� �ʱ�ȭ �׼�
		Sample4.arr = new int[5]; // �迭 ����
		Random random = new Random(); // ������ü ����
		for (int i = 0; i < arr.length; ++i) {
			Sample4.arr[i] = random.nextInt(11); // �迭�� ���� �Ҵ�
		}
	}
	
	//getter
	public static int[] getArr() {
		return Sample4.arr;
	}
}
