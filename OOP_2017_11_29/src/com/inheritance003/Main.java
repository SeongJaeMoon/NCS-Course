package com.inheritance003;

public class Main {

	public static void main(String[] args) {

		//local ������ �ڵ� �ʱ�ȭ���� �ʴ´�.
		//->����� �ʱ�ȭ
		int a = 20, b = 10;
		
		//�ڽ� Ŭ������ ��ü 
		My_Calculation demo = new My_Calculation();
		demo.additon(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
		
	}

}
