package oop.test;

//매개변수 테스트용 클래스
public class Sample {
	//매개변수 
	//- 메소드 진행에 필요한 외부 데이터를 수신하는 역할
	//- 메소드 호출시 매개변수에 대응하는 데이터를 전송해야 한다.
	
	//매개변수 없는 경우
	void method() {
		System.out.println("매개변수가 없는 메소드 호출.");
	}
	//매개변수가 있는 경우
	//->메소드이름(자료형, 변수명, ...)
	//->외부자료(이름, 전화번호)가 서로 연관성 있는 경우는 하나의 자료(개인의 정보)로 통합한
	void method2(int x, int y){
		//내부 액션 진행을 위한 외부 자료
		//->x, y
		System.out.printf("x:%s%n", x);
		System.out.printf("x:%s%n", y);
	}
	
	int method3(int x, int y) {
		int result = x+y;
		return result;
	}
	
	String decToHex(int dec, int radix) {
		int a = 0;
		StringBuilder result = new StringBuilder();
		String[] temp = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		if (dec > 0 && radix == 2 || radix == 16) {
			while (true) {
				a = dec % radix;
				dec /= radix;
				result.insert(0, temp[a]);//특정 위치에 문자열 끼우기
				if (dec == 0)
					break;
			}
		} else {
				result.append("Error");//뒤에 끼우기
		}
		return result.toString();
	}
}
