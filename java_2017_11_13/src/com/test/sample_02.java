package com.test;

import java.util.Arrays;

public class sample_02 {

	public static void main(String[] args) {

		// �迭 ��� ����
		// ���� : ��Ҹ� ũ������� �����ϴ� ����, (�������� or ��������)
		// ���� �˰���(Bubble)�� ������ ����
		// Arrays Ŭ������ sort() �޼ҵ�

		/*
		 * 1. �迭 ��ҿ� ���ĵ��� ���� �⺻�ڷ��� ��� �غ� -> 5��. 2. �� ������ ��Ҹ� ��. 3. (if ���������� ���, ���� ��Ұ�
		 * ũ��, ������ ��Ұ� ���� ��� ��ȯ). �׷��� ���� ��� ���. 4. �񱳿� ��ȯ �׼��� �迭 ��� ��ü�� ���ؼ� ������ ������ �ݺ�.
		 * 0-1, 1-2, 2-3, 3-4, ... 5. �迭 ��� ��ü�� ���� ��, ��ȯ �׼� �� �� ������ ���¸� 1ȸ��. 6. �迭 ���
		 * �߿��� ���� ū ���� ���� �����ʿ� ��ġ�Ѵ�. 7. 2��~6�� ������ �ݺ�. ��, ���� ������ �� ���� ����(������ ���� ���� ����).
		 * 8. �� ����� �������� �ݺ� ����.
		 */
		String [] str = {"json", "xml", "nodejs", "angularjs", "rubyonrails"};
		// ���� �� ���
		for (String b : str) {
			System.out.printf("%s ", b);
		}
		System.out.println();
		// ���� ����
		/*
		 * if(arr[n] > arr[n+1] int temp = arr[n]; arr[n] = arr[n+1]; arr[n+1] = temp;
		 * n�� 0,1,2,3, ...., ������ ��(�迭 ����� ���� - 2)
		 * if(a[n] > a[n+1]){
		 * 
		 * }
		 * ����) ���ڿ�(String �ڷ���) �񱳴� > �����ڷ� �� �Ұ�
		 */
		String temp = "";
		for(int i = 0; i < str.length; i++) {
			for(int j = i; j < str.length - 1; j++) {
				if(str[i].compareTo(str[j]) > 0){ 
					//��.compareTo("�񱳰�") 
					//if(�� > �񱳰�) return ��� 
					//else if(�� < �񱳰�) return ���� 
					//else if(�� == �񱳰�) return 0 
					System.out.printf("ȸ��: %d [%s <��ȯ> %s]%n", i+1, str[i], str[j]);
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		/*for(int i = 1; i < str.length; ++i) {
			for(int j = 0; j < str.length - i; ++j) {
				if(str[j].compareTo(str[j+1]) > 0){ 
					//��.compareTo("�񱳰�") 
					//if(�� > �񱳰�) return ��� 
					//else if(�� < �񱳰�) return ���� 
					//else if(�� == �񱳰�) return 0 
					System.out.printf("ȸ��: %d [%s <��ȯ> %s]%n", i+1, str[i], str[i+1]);
					String temp = str[j+1];
					str[j+1] = str[j];
					str[j] = temp;
				}
			}
		}*/
		
		for (String b : str) {
			System.out.printf("%s ", b);
		}
	}
}
