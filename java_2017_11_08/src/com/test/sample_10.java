package com.test;

public class sample_10 {

	public static void main(String[] args) {
		//�ݺ��� �׽�Ʈ
		//break -> Ư�� �ݺ� ��Ȳ���� �ݺ� Ż��(�� Ż��)
		//�ݺ��� ���ο� switch ���� �ȿ����� ��� ����
		//��ø�� �ݺ����� ��� �� ���� ���� Ż�� ����
		//�Ϲ������� ���ѹݺ� �������� Ư�� ���� ������ Ż�� �������� ���
		int count = 0;
		while(true) {
			System.out.println("���ѽ��� ����...");
			count++;
			if(count > 10) {
				System.out.print("�� Ż��!");
				break;
			}
		}
		//���������� ���α׷� ���� ����
		//���ѽ��� �� ���ο� break; Ű���尡 ���ٸ� Unreachable code
	}
}
//��°��
/*

 */