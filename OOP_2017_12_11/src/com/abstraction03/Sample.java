package com.abstraction03;

public class Sample {

	//SubClass01 또는 SubClass02 객체를 사용하는 입장 -> 포함관계
	//포함 관계 적용시 해당 객체를 명시적 지정하지 않고, 추상 객체를 이용해서 연결하는 형태(약한 결합)

	//해당 객체를 명시적 지정 -> 강한 결합
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
		//SubClass01의 전용 메소드 호출
		this.sub.method();
	}
	//SubClass01 메소드 호출 -> Sample 클래스의 메소드를 이용한 간접호출
}
