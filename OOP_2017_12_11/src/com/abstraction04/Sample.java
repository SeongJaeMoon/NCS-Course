package com.abstraction04;

public class Sample {

	//SubClass01 �Ǵ� SubClass02 ��ü�� ����ϴ� ���� -> ���԰���
	//���� ���� ����� �ش� ��ü�� ����� �������� �ʰ�, �߻� ��ü�� �̿��ؼ� �����ϴ� ����(���� ����)

	//�ش� ��ü�� �߻��� ��ü(�������̽�)�� ���� -> ���� ����
	private Super sub;
	
	public Sample() {
		super();
	}
	
	public Sample(Super sub) {
		super();
		this.sub = sub;
	}

	public Super getSub() {
		return this.sub;
	}
	
	public void method() {
		//SubClass01�� ���� �޼ҵ� ȣ��
		this.sub.method();
	}
	//SubClass01 �޼ҵ� ȣ�� -> Sample Ŭ������ �޼ҵ带 �̿��� ����ȣ��
}
