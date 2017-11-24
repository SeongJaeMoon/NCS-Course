package oop.test3;

public class Sample2 {

	//static final 필드 초기화
	
	/*
	 -static final 필드는 static 특성 + final 특성을 동시에 가진다.
	 -필드는 상수(constant)라고 표현한다. 상수명은 관례적으로 대문자로 표기한다. snake 표기법 사용. '단어1_단어2' 형태로 표기
	 -형식
	 -초기화는 명시적 초기화, static 초기화 블럭만 가능
	 private static final 자료형 변수명 = 값;
	 */

	private int a;
	
	//static final 필드
	//->대문자로 표기
	//->자동 초기화 지원 불가
	//->getter를 만들지 않고, 직접 접근 가능하도록 설정
	
	public static final int A = 1;
	public static final int B;
	
	static {
		//static 변수명 = 값;
		B=10;
	}
	
}
