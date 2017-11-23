package oop.test3;

public class Sample {
	
	/*
	//싱글톤 패턴
	- Gof 디자인 패턴의 한 종류
	- 생성패턴, 구조 패턴, 행위 패턴...etc 
	- 한 클래스에 한 객체만 생성(존재)하도록 제한한다.
	- 사용자가 직접 객체 생성 요구하는 상황 제한(private 생성자) + 객체 생성 요구를 처리하는 전용 메소드 추가
	*/
	
	//정적(static) 필드
	//->초기값으로 객체 생성된 결과 (참조주소)
	//->메모리에 Sample 객체(instance)는 한 개인 상태를 유지
	private static Sample singleton = new Sample(); 

	//private 생성자
	private Sample() {
	}
	
	//정적(static)메소드
	//객체 생성 요구를 처리하는 전용 메소드
	public static Sample getInstance() {
		//Sample 객체에 대한 참조주소 반환
		//->new 연산자에 의한 추가 객체 생성은 없다.
		return singleton;
	}
	
}
