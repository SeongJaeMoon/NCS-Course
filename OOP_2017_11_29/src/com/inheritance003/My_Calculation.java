package com.inheritance003;

//특정 클래스에 대한 상속 지정 -> extends
public class My_Calculation extends Calculation{

	//부모 클래스의 멤버에 대한 상속이 이루어진다
	
	//자기만의 멤버 추가 가능
	
	public void multiplication(int x, int y) {
		this.z = x * y;
		System.out.println("The product of the given numbers " + z);
	}
}
