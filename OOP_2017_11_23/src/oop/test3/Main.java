package oop.test3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//�̱��� ������ ����� Ŭ������ ��ü ����
		//->���� new ������ �̿��ؼ� ��ü �������� �ʴ´�.
		//->���� static �޼ҵ�(getInstance) ȣ��
		//->static �޼ҵ�� Ŭ�����̸�.�޼ҵ��̸�(); ����
		Sample sample = Sample.getInstance();
		
		System.out.println(sample.toString());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
	}
}
