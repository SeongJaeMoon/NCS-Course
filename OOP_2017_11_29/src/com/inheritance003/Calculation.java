package com.inheritance003;

public class Calculation {

	//�ʵ�-> �ڵ� �ʱ�ȭ -> 0
	//instance ����
	//private -> ��� �Ұ�
	int z;
	
	
	//�⺻ �����ڰ� �����ִ�!
	
	//instance �޼ҵ�
	//public -> ��� ����
	public void additon(int x, int y) {
		//x, y -> local ����
		this.z = x + y;
		System.out.println("The sum of the given numbers "+z);
	}
	public void subtraction(int x, int y) {
		this.z = x - y;
		System.out.println("The diffrence between the given numbers "+z);
	}
}
