package com.test;

public class sample_01 {

	public static void main(String[] args) {
		//�迭(Array)
		/*
		
		 ������(�������� �⺻ Ư���� �� ������)
		 
		 ������ �ڷ����� ���� ����Ұ� ������ �غ�� ����
		 ������ �� ũ�� ���� �ʿ�
		 �迭 �ڽ��� �ڷ����� �⺻��, ������ ��� ���� ����
		 
		 �ڷ���[] ����; -> ����
		 or
		 �ڷ��� ����[];
		 
		 ���� = new �ڷ���[ũ��];
		 ����[�ε���] = ��;
		 or
		 �ڷ���[] ���� = {��0, ��1, ��2, ... n};
		 or
		 ���� = new �ڷ���[ũ��]{��0, ��1, ��2, ... n};
		 
		 �迭 ��� ���ٽ� �ε��� ���. ������[�ε���] �ε��� 0���� ����, �ݺ����� �̿��� �ȵ��� ����
		 �迭 ����� ������ length �ʵ�� Ȯ�� ����, �б� ���� �ʵ�
		 ����) �迭�� ������ �ڵ� �ʱ�ȭ�� �����ϴ�, int �ڷ����� 0���� �ʱ�ȭ, double �ڷ����� 0.0, �������� null 
		 ����) ArrayIndexOutOfBoundException : �ε��� ��� ������ ����� �ε��� ����
		 */
		
		//�迭 ����
		int[]arr1;
		
		//�迭 ����(�ڵ� �ʱ�ȭ)
		arr1 = new int[5];
		
		//�迭 ��� ����(�ε���, 0~ũ��-1)
		System.out.print(arr1[0]);
		System.out.print(arr1[1]);
		System.out.print(arr1[2]);
		System.out.print(arr1[3]);
		System.out.print(arr1[4]);
		System.out.print("\n");
		
		//�ݺ����� �̿��� �迭 ��� ����
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
	}
}
