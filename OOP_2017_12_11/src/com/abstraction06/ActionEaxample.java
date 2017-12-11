package com.abstraction06;

public class ActionEaxample {

	public static void main(String[] args) {
		//익명 구현 객체
		//인터페이스를 이용한 임시 객체 생성 -> 인터페이스의 추상 메소드 오버라이딩
		Action action = new Action() {
			@Override
			public void action() {
				System.out.println("복사를 합니당");
			}
		};
		action.action();
	}

}
