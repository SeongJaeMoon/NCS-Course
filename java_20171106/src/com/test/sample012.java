package com.test;

public class sample012 {
	
	public static void main(String[] args) {
		//���� ������
		//�ڷ��� ���� = �� �Ǵ� ǥ����;
		int a = 10;
		int b = 10, c = 20;
		int d, e, f;
		d = e = f = 10;
		String s = "moon seong jae";
		System.out.println(s);
		System.out.println(s.length()+""+s.charAt(3));
		int g  = 10;
		e -= g;
		System.out.println(e);
		double x = 10.0;
		e += (int)x;
		System.out.println(e);
		//��� ������ +,-,*,/,%,++,--
		//���ڿ� + ������ �ڷ��� = ���ڿ� 
		System.out.println("d+f="+(d+f));
		// int / int = int, int%int = int
		int z= 15, q = 10;
		System.out.println(z/(double)q);
		
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(b--);
		System.out.println(--b);
		System.out.println(b--);
		
		int qulified = Integer.MAX_VALUE;
		System.out.println(qulified+a);
	}
}
