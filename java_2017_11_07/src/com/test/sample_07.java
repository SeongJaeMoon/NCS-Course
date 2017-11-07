package com.test;

public class sample_07 {

	public static void main(String[] args) {
		//변수의 SCOPE
		//선언 위치에 따라 다르다.
		//Local variables, Instance variable, Class/Static variable, Global variable
		//Local variables -> default value 명시적 선언
		//int a = 10;
		//System.out.println(a);
		//int b = 5;
		//System.out.println(b);
		
		//int - > byte 자료형으로 형변환
		//byte 자료형은 허용 범위가 -127~127
		int i = 128;
		
		if(i >= Byte.MIN_VALUE && i <=Byte.MAX_VALUE) {
			byte c = (byte)i;
			System.out.println("c : " + c);
			System.out.println("i : "+ i);
		}else {
			System.out.println("Byte 범위를 벗어났습니다.");
		}
		
		
	}
}
/*----
*결과:
----*/