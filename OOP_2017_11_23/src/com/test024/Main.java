package com.test024;


public class Main {

	public static void main(String[] args) {
		
		//������ �����ε� �׽�Ʈ
		
		//�Ű����� ��� �ִ� ������ ȣ��
		//->�ñ״�ó �м�
		Sample s1 =new Sample(10);
		System.out.println(s1.getA());
		System.out.println(s1.getB());
		
		//�Ű������� �� ������ ��� ����.
		//-> �ñ״�ó �м�
		Sample s2 =new Sample();
		System.out.println(s2.getA());
		System.out.println(s2.getB());
		
		//�Ű������� ���޵Ǵ� ���� ���Ƶ� ����
		//->�ñ״�ó �м�
		Sample s3 =new Sample(10,20);
		System.out.println(s3.getA());
		System.out.println(s3.getB());
		
	}

}
