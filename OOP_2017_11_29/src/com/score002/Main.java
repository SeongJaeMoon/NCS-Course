package com.score002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ScoreService service = new ScoreService();
		boolean run = true;
		while(run) {
			System.out.println("1. ���� ���� �Է�  2. ���� ���� ���");
			System.out.println("����(1~2, 0 quit)?");
			int input = sc.nextInt();
			switch(input) {
			case 0 : run = false;break;
			case 1 : service.scoreAdd(sc);break;
			case 2 : service.scoreList();break;
			
			}
		}
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
}
