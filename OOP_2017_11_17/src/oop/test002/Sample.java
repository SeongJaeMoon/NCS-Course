package oop.test002;

//리턴타입 테스트용 클래스
public class Sample {

	//메소드의 리턴타입
	//void or 자료형(기본, 참조)
	
	//void - 반환값이 없는 경우, return 구문 x
	void method() {
		//return 값 있으면 에러난다.
	}
	
	//void가 아닌 자료형 지정시 return 구문 필요
	int method1() {
		return 0;
	}
	
	double method2() {
		return 0; //자동 형변한
	}
	
	String method3() {
		
		return null;//문자열 or null
	}
	
	int[] method7(){
		
		int[] a = {1,2,3};
		
		return a;
	}
}
