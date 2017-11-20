package oop.test;

//매개변수 테스트용 클래스
public class Sample2 {
	
	//매개변수 개수가 불확실한 경우
	//->단, 자료형은 확정된 상태
	//->매개변수 목록에서 "..."표현.
	//->전달 받은 매개값 목록이 배열로 표현된다.
	//->가변매개변수
	void method(int...args) {
		for(int temp : args) {
			System.out.println(temp);
		}
		for(int b = 0; b < args.length; ++b) {
			System.out.printf("a[%d]: %d%n", b, args[b]);
		}
	}
	
	//매개변수 자료형에 따른 구분
	//기본형(by value)과 참조형(by reference)의 차이
	
	//by value
	//메소드 호출시 매개변수 값을 보내는쪽과 받는 쪽이 서로 독립 상태.
	//값 복사
	void method1(int i) {
		++i;
		System.out.printf("inner: %d%n",i);
	}
	
	//by reference
	//메소드 호출시 매개변수 값을 보내는쪽과 받는 쪽이 서로 연결 상태.
	//->참조주소 복사
	//->메소드 액션 결과에 대한 return 구문이 필요 없음.
	void method2(int[]a) {
		++a[0];
		System.out.printf("inner arr : %d%n",a[0]);
	}
	
	int method3(int a) {
		++a;
		return a;
	}
}

