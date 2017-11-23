package com.test025;

//������ �׽�Ʈ Ŭ����
public class Sample {

	//�ٸ� ������ ȣ��
	/*
	- ������ �����ε� ������ ��� ���� ��ü�� �ٸ� ������ ȣ�� ����.
	- ������ ���ο��� �ٸ� ������ ȣ�� ��� ����.
	- this(), this(��, ...)
	- ������ ���� �׼��� �ٸ� �����ڿ��� ����.
	- ����) �ٸ� ������ ȣ�� ������ ������ ���ο��� ���� ó�� ��ġ���� ���.
	 */
	
	private int a;
	private int b;
	
	public Sample() {
		
		//�ʵ� a,b�� 0���� �ʱ�ȭ �ϴ� �׼��� �ٸ� ������ ȣ�� �������� �ۼ�.
		this(0,0);
		
	}
	
	public Sample(int a) {
		
		
		//������ ���� �׼� �ڵ�
		//-> �ٸ� �����ڿ��� ����
		//this.a = a;
		this(a,0);
		System.out.println("�Ű����� ��� �ִ� ������ ȣ��.");
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
