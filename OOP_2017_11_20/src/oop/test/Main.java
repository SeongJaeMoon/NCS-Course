package oop.test;

public class Main {

	public static void main(String[] args) {
		//매개변수 테스트용 클래스의 객체(instance) 생성
		//-> new 연산자
		//-> heap 영역
		//-> 참조주소를 가지는 변수(4byte)는 stack 영역
		//-> 로컬 변수인 경우 선언시 변수가 준비되고, 변수 사용 범위를 벗어나면 소멸. 객체는 heap 영역에서 쓰레기 객체가 된다. 가비지 컬렉터의 수집 대상이 된다.
		Sample s = new Sample();
		//객체 생성후 이 객체가 가진 멤버(메소드) 덪승 사을
		//->메소드 호출
		//->변수.메소드명()
		//->메소드 시그니처를 분석해서 매개변수와 반환값을 분석해야 한다.
		
		//매개변수, 반환값이 없는 메소드 호출
		//->변수.메소드명()
		//->메소드 시그니처->void method()
		//->메소드 선언 위치 이동시 Ctrl + 메소드이름 클릭
		s.method();
		
		//매개변수가 있는, 반환값이 없는 메소드 호출
		//->메소드 시그니처->void method2(int x, int y)
		//->변수.메소드명(값1, 값2)
		//->전달하는 값은 매개변수의 자료형, 순서, 개수를 맞춰서 전송해야 한다.
		s.method2(10, 20);
		
		//매개변수, 반환 값이 있는 메소드 호출
		//->메소드 시그니처->int method3(int x, int y);
		//->자료형 변수 = 변수.메소드명(값1, 값2);
		//->전달하는 값은 매개변수의 자료형, 순서, 개수를 맞춰서 전송해야 한다.
		int result = s.method3(10, 20);
		System.out.println(result);
		System.out.println(s.method3(10, 20));
		
		double result2 = s.method3(10, 20);//자동 형변환 가능
		
		//진법 변환 메소드 호출 테스트
		//메소드 시그니처 분석 -> String toBin(int dec)
		//String 변수 = toBin(값);
		int a = 10;
		Capsulation cap = new Capsulation();	
		System.out.printf("%d(10) -> %s(2)%n", a,cap.decToBin(10));
		//자바에서 제공하는 진법 변환 메소드
		String result3 = Integer.toString(a, 2);
		System.out.printf("%d(10) -> %s(2)%n", a, result3);
		
		//자바에서 제공하는 진법 변환 메소드
		String result4 = Integer.toString(a, 16);
		System.out.printf("%d(10) -> %s(16)%n", a, result4);
		
		Sample sample = new Sample();
		int i = 110;
		System.out.printf("%d(10)->%s(16)%n", i, sample.decToHex(i, 16));
		i = 220;
		System.out.printf("%d(10)->%s(16)%n", i, sample.decToHex(i, 16));
		i = 10;
		System.out.printf("%d(10)->%s(16)%n", i, sample.decToHex(i, 16));
		
		//가변매개변수에 대한 값 전달
		Sample2 sample2 = new Sample2();
		//전달해야 하는 값의 개수에 제약이 없다.
		sample2.method();
		sample2.method(10, 20, 30);
		sample2.method(30, 40, 50, 60);
		//배열 객체를 전달할 수 있다.
		int[]arr = { 10, 20, 30, 40};
		sample2.method(arr);

	}
}
