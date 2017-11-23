package oop.test1;

public class Main {

	public static void main(String[] args) {
	
		//매개변수 목록 있는 생성자 호출
		//->시그니처 분석
		Sample s =new Sample(2);
		System.out.println(s.getA());
	}
}
