package com.test;

public class sample011 {
	
	int getNear(int []x, int neardata) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < x.length; i++) {
			int temp = Math.abs(min-neardata);
			if(min > temp) {
				min = temp;
				neardata = x[i];
			}
		}
		return neardata;
	}
	
	public static void main(String[] args) {
		//Casting
		//Data type (A convert to B),�Ͻ���, �����
		//���� Ÿ���� �ڷḦ ū Ÿ���� ������ �����ϴ� �������� �߻�.
		//byte(1) <- short(2) <- char(2)  <- int(4) <- long(8) <- float(4) <- double(8) ǥ���� ����!
		//���� ����ȯ, ���� Ÿ��=(����Ÿ��)ū Ÿ��;
		//�ڷ� �ս� �߻� ����.
		byte a = 100;
		int b = 210000000;
		a = (byte)b; // �� �κ��� �޸𸮿� ����� ������ ������ �� �κ��� �޸𸮸� ���ܳ���. ex) int -> byte �� 3byte ����.
		System.out.println(a);
		int d = 100;
		byte c = (byte)d;
		System.out.println(c);
		
		//int �ڷ����� ���� char �ڷ����� ������ ����
		// ->���� ����ȯ
		int g = 65;
		char h = (char)g;
		System.out.println(h);
		//double �ڷ����� -> int �ڷ��� ������ ����
		double ab = 123.456;
		g = (int)ab;
		System.out.println(g);
		int x = (int)Math.ceil(ab);
		System.out.println(x);
		
		System.out.println(Math.PI);
		int [] arr = {1,2,3,4,5,6};
		sample011 sample = new sample011();
		int neardata = sample.getNear(arr, 3);
		System.out.println(neardata);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		char mc = 'a';
		int mi = mc;
		System.out.println(mi);
		//������ ���ڷ� ���� x, ����� ����, $, _���� Ư�����ڷ� ����
	}
}
