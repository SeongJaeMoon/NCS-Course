package oop.test1;

//생성자 테스트 클래스
public class Sample {

	//
	//매개변수 목록 있는 생성자의 명시적 선언
	//매개변수는 외부에서 전달되는 값(자료)에 대한 수신. local 변수이다.
	
	/*
	 public 클래스이름(매개변수 리스트){
	 
	 }
	 */
	//instance 변수
	private int a;
	
	public Sample(int a) {
		//local 변수 - this 키워드 사용 불가
		
		//instance 멤버 접근시 this 키워드 사용
		//외부에서 전달된 값을 가진 local 변수 a의 자료를 instance 변수 a에 대입.
		this.a = a;
	}
	//필드의 저장된 값을 외부에서 확인할 수 있도록 메소드 추가
	//->getter
	//instance 메소드
	public int getA() {
		return this.a;
	}
}
