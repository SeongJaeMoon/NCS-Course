package com.test024;

//������ �׽�Ʈ Ŭ����
public class Sample {

	//������ �����ε�(Overloading)
	/*
	 -Ŭ���� ���� ���� �̸��� ���� �����ڰ� ������ ����� ����.
	 -���� �̸��� ���� �ĺ���(Ŭ����, ����, ��Ÿ) �������� �����ϴ� ���� �߸��� ǥ��.
	 -������ �ߺ� ���� -> �ñ״�ó(�Ű����� ����)�� �޶�� �Ѵ�.
	 -�⺻ ������+ �Ű����� ��� �ִ� �����ڵ����� ����
	 */
	
	private int a;
	private int b;
	
	public Sample() {
		
	}
	
	public Sample(int a) {
		this.a = a;
	}
	
	public Sample(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//�ʵ��� ����� ���� �ܺο��� Ȯ���� �� �ֵ��� �޼ҵ� �߰�
	//->getter
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	
	
}
