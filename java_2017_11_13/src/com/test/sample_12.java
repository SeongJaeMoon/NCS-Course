package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sample_12 {

	public static void main(String[] args) {

		// next() : �������� ���е� ���ڿ� �Է½� ���. ���ڿ� �ڷ� ��ȯ.
		// nextLine() : ���� ���� �� �� ��ü ���ڿ� �Է½� ���. ���ڿ� �ڷ� ��ȯ.
		// nextInt() : �������� ���е� ���� ������ ���ڿ� �Է½� ���. ���� �ڷ� ��ȯ
			
		// ����) next(), nextInt() �� nextLine() �޼ҵ� ȥ��� �ٹٲ� ���� ó�� �ʿ�.
		// ���� ���� �� ���� -> ���� �Է����� ó��
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.nextLine(); //next��  ȥ��� �߰��� �� �ֱ�
		int a = sc.nextInt();
		System.out.printf("%s %d", str, a);
	}
}
