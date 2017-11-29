package com.inheritance003;

public class Main {

	public static void main(String[] args) {

		//local 변수는 자동 초기화되지 않는다.
		//->명시적 초기화
		int a = 20, b = 10;
		
		//자식 클래스의 객체 
		My_Calculation demo = new My_Calculation();
		demo.additon(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
		
	}

}
