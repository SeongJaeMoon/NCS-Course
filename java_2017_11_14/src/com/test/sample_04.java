package com.test;

public class sample_04 {

	public static void main(String[] args) {
		// Ÿ���� �迭(�迭�� �迭)
		// 1���� �迭�� ��ҷμ� �� �ٸ� 1���� �迭�� ����ִ� ����.
		// ������ �ڷḦ �ڷḦ �������� ������ �ڵ����� null�� �ʱ�ȭ
		//������ �ڷḦ ������ �迭�� �迭�� �迭�� ������ ����.
		String[]arr=new String[5];
		//�ڵ� �ʱ�ȭ ����
		//[0],[1],[2],[3],[4]
		
		for(int a = 0; a < arr.length; a++) {
			System.out.println(arr[a]);
		}
		//�������� �����ּҸ� ���� ���ڿ��� ��ȯ����(�迭 ��ҿ� �����ּҸ� ����)
		//���ڿ� �ڽ��� �迭�� �ٸ� ������ �����Ѵ�.
		
		arr[0] = "TEST";
		arr[1] = "SAMPLE";
		arr[2] = "TEST";
		arr[3] = new String("TEST");
		for(int a = 0; a < arr.length; a++) {
			System.out.println(arr[a]);
		}
		//���� �ּ� ��
		System.out.println(arr[0] == arr[3]); //false
		System.out.println(arr[0] == arr[2]); //true
		
		//�� ��
		System.out.println(arr[0].equals(arr[3])); //true
		System.out.println(arr[0].equalsIgnoreCase(arr[3]));//true
	}
}
