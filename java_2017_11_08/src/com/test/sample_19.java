package com.test;

import java.io.IOException;
import java.util.Scanner;

public class sample_19 {
	//Ű���� �Է�
	//Ű���带 �̿��ؼ� ���� �Ǵ� ���ڿ��� ���α׷� ���η� �о���� �� �ִ�. 
	//Scanner Ŭ������ �̿��ϸ� ���ڿ� ������ �Է°���
	//��Ű�� ��� �� ���� ó�� �ʿ�
	//����)����� ���ڿ� �Է� ��� ���°� �ȴ�. Ư�� ���ڿ� �Է� �� EnterŰ
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);//�ݺ��� �ٱ����ٰ� �����ϴ� ���� ����
		boolean run = true;
		String s;//��ĳ�� ��ü�� ���� ����
		while(run) {
			System.out.print("1~2~3~4�Է�!\n");
			s = scanner.nextLine();
			switch (s) {//�ڷ����� ���ڿ��̰ų� ������ ���� ����
			case "1":
				System.out.print("�ȳ�?\n");
				break;
			case "2":
				System.out.print("����\n");
				break;
			case "3":
				System.out.print("�����~\n");
				break;
			case "4":
				System.out.print("������ �ݰ����ϴ�!\n");
				run = false;
				scanner.close();
				break;
			default:
				break;
			}
		}
	}
}
