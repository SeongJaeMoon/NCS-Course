package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class sample_18 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է�
		// Ű���带 �̿��ؼ� ���� �Ǵ� ���ڿ��� ���α׷� ���η� �о���� �� �ִ�.
		// EnterŰ �� ���� ���� 2�� �Է°� ����
		// System.in.read();
		// (���ǻ���) ���� ó�� �ʿ�, Ư�� ���� �Է� �� Enter Ű �Է�.
		// EnterŰ�� �ش��ϴ� ����(13,10)�� �Է� ó���� �ȴ�. -> �޴������� ������ �ݺ��ؼ� ��� ��.
		int a = 0;
		boolean run = true;
		
		while (run) {
			//Ű���� ���� �Է��� �ݺ��� ó���ϴ� ���
			//EnterŰ�� �ش��ϴ� ����(13,10)�� �Է� ó���� �ȴ�.
			//->"�޴� ����?" ���ڿ��� ������ ��µȴ�.
			//-> EnterŰ�� ��찡 �ƴ� ���� "�޴� ����?" ���ڿ� ���
			if(a!=10&&a!=13)
			System.out.print("==�޴��� �������ּ���!== \n1.�������\n2.�����Ա�\n3.������ȸ\n4.���α׷�����\n");
			a = System.in.read();
			char b = (char)a;
			switch (b) {
			case '1':
				System.out.print("==���� ���==\n");
				break;
			case '2':
				System.out.print("==���� �Ա�==\n");
				break;
			case '3':
				System.out.print("==���� ��ȸ==\n");
				break;
			case '4':
				System.out.print("==���α׷� ����==\n");
				run = false;
				break;
			default:
				//System.out.print("==������ �� ���� ȣ���Դϴ�.==\n");
				break;
			}
		}
	}
}
// ��°��
/*
 * 
 */
