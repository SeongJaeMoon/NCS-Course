package com.abstraction03;

public class Sample {

	//SubClass01 �Ǵ� SubClass02 ��ü�� ����ϴ� ���� -> ���԰���
	//���� ���� ����� �ش� ��ü�� ����� �������� �ʰ�, �߻� ��ü�� �̿��ؼ� �����ϴ� ����(���� ����)

	//�ش� ��ü�� ����� ���� -> ���� ����
	private SubClass01 sub;
	
	public Sample() {
		super();
	}
	
	public Sample(SubClass01 sub) {
		super();
		this.sub = sub;
	}

	public SubClass01 getSub() {
		return this.sub;
	}
	
	public void method() {
		//SubClass01�� ���� �޼ҵ� ȣ��
		this.sub.method();
	}
	//SubClass01 �޼ҵ� ȣ�� -> Sample Ŭ������ �޼ҵ带 �̿��� ����ȣ��
}
