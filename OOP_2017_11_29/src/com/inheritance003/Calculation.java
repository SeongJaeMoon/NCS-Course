package com.inheritance003;

public class Calculation {

	//필드-> 자동 초기화 -> 0
	//instance 변수
	//private -> 상속 불가
	int z;
	
	
	//기본 생성자가 숨어있당!
	
	//instance 메소드
	//public -> 상속 가능
	public void additon(int x, int y) {
		//x, y -> local 변수
		this.z = x + y;
		System.out.println("The sum of the given numbers "+z);
	}
	public void subtraction(int x, int y) {
		this.z = x - y;
		System.out.println("The diffrence between the given numbers "+z);
	}
}
