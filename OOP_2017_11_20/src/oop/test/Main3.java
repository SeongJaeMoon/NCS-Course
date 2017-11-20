package oop.test;

public class Main3 {
	
	//인스턴스 메소드 샘플
	void method() {
		
	}
	//대표적인 static(정적)메소드
	public static void main(String[] args) {
		
		//인스턴스 메소드 접근을 위한 this 키워드 사용
		//Cannot use this int a static context
		//this.method();
		
		//-> Main 클래스에 대한 객체(instance)생성 필요
		//-> 참조변수를 통한 접근
		Main3 m = new Main3();
		m.method();
	}
}
