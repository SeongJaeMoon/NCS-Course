package com.inheritance003;

//Ư�� Ŭ������ ���� ��� ���� -> extends
public class My_Calculation extends Calculation{

	//�θ� Ŭ������ ����� ���� ����� �̷������
	
	//�ڱ⸸�� ��� �߰� ����
	
	public void multiplication(int x, int y) {
		this.z = x * y;
		System.out.println("The product of the given numbers " + z);
	}
}
