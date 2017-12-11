package com.abstraction04;

public class Sample {

	//SubClass01 또는 SubClass02 객체를 사용하는 입장 -> 포함관계
	//포함 관계 적용시 해당 객체를 명시적 지정하지 않고, 추상 객체를 이용해서 연결하는 형태(약한 결합)

	//해당 객체를 추상적 객체(인터페이스)로 지정 -> 약한 결합
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
		//SubClass01의 전용 메소드 호출
		this.sub.method();
	}
	//SubClass01 메소드 호출 -> Sample 클래스의 메소드를 이용한 간접호출
}
