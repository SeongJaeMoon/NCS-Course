package oop.test;

//객체 지향 특성중 캡슐화에 대한 테스트 클래스
public class Capsulation {

	//캡슐화(Encapsulation)
	/*
	 1. 데이터 은닉(data hiding)한다는 의미. 접근제한자 필요.
	 
	 2. 구현 내용을 감춘다는 의미. 메소드 필요.
	 복잡한 액션을 감추고 외부에서 간단하게 메소드 호출만으로 액션 수행 가능한 상태를 만든다.
	 
	 3.
	 
	 */
	//10진수 -> 2진수
	//10진수(int) -> 2진수(String)
	//10(10) -> 1010(2)
	String decToBin(int dec) {
		
		int a = 0;
		String result = "";
		
		while(true) {
				//나머지 연산 (2로 나눈 나머지는 0 또는 1
				a = dec % 2;
				//정수 나누기 연산
				dec = dec / 2;
				//나머지 연산 결과를 문자열(2진수)
				//주의) 먼저 계산된 나머지는 2진수 형태의 문자열에서 오른쪽부터 채운다. 
				//예를 들어, 10(10) -> 1010(2)
				//0 -> 10 -> 010 -> 1010
				//순서대로 만들어진다.
				result = a + result;
				if(dec==0)break;
		}
		return result;
	}
}
