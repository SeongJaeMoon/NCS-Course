package oop.test2;

public class Sample2 {

	//�ʵ� �ʱ�ȭ
	/*
	 -�ʵ� �ʱ�ȭ�� �Ʒ� ������� ����ȴ�.
	 1. �ڵ� �ʱ�ȭ
	 2. ����� �ʱ�ȭ
	 3. �����ڿ� ���� �ʱ�ȭ. ��, instance �ʵ忡 ���ؼ���.
	 4. static �ʱ�ȭ ���� ���� �ʱ�ȭ, ��, static �ʵ忡 ���ؼ���.
	 
	 -�ڵ� �ʱ�ȭ�� ��ü ������ �⺻������ �ʱ�ȭ�Ǵ� ����. int �ڷ����� 0, double �ڷ����� 0.0, ��������(Ŭ����, ������, �迭, �������̽�)�� null�� �ʱ�ȭ �ȴ�.
	 -����� �ʱ�ȭ�� ����ڰ� ���� ���Ƿ� �����ؼ� �ʱ�ȭ�ϴ� ����. ����(�Ҵ�) ������ ���.
	 -
	 */
	//�ڵ� �ʱ�ȭ
	private int a;
	
	//����� �ʱ�ȭ
	private int b = 10;
	
	//���� �ڷ����� ���� �ʵ带 ���� ����
	private static int c, d = 10;
	
	//instance getter
	public int getA() {
		return this.a;
	}
	
	//static getter
	public static int getC() {
		return Sample2.c;
	}
	
}
