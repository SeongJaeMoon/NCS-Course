package com.score002;

import java.util.Scanner;

//(�ܼ�) ���� ���� Ŭ����
public class ScoreService {
	
	//(�迭)����� ���� Ŭ���� ��ü Ȯ��
	private ScoreDAO dao = new ScoreDAO();
	
	//���� ���� �Է� �޼ҵ�
	public void scoreAdd(Scanner sc) {
		System.out.print("id�� �Է����ּ���.");
		String sid = sc.next();
		System.out.print("�̸��� �Է����ּ���.");
		String name = sc.next();
		System.out.print("����1�� ������ �Է����ּ���.");
		int sub1 = sc.nextInt();
		System.out.print("����2�� ������ �Է����ּ���.");
		int sub2 = sc.nextInt();
		System.out.print("����3�� ������ �Է����ּ���.");
		int sub3 = sc.nextInt();
		if(this.dao.scoreAdd(sid, name, sub1, sub2, sub3)==1) {
			System.out.println("���� ���� ������ �����߽��ϴ�.");
		}
		else {
			System.out.println("���� ���� �Է��� �����߽��ϴ�. �ߺ��� ��ȣ ���.");
		}
	}
	//���� ���� ��� �޼ҵ�
	public void scoreList() {
		System.out.println("---------------");
		System.out.println("���� ���� ��ü���");
		System.out.println("---------------");
		System.out.print(this.dao.scoreList());
	}
}
