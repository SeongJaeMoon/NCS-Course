package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sample_01 {

	public static void main(String[] args) {
		
		//참조타입
		/*
		 * 실제 자료가 저장된 영역(Heap)과 자료를 참조할 수 있는 변수가 다른 영역(Stack)에 선언된 상태
		 * 배열, 열거, 클래스(문자열)
		 * Main Method 호출시 단일 쓰레드 생성
		 * 기본 타입은 Stack 영역에 변수가 저장되고, 자료가 저장된다.
		 * 생성과 소멸이 쉽다.
		 * 
		 * 참조 타입은 Stack 영역에 변수가 참조주소를 저장하고, 자료는 별도의 영역(Heap)에 저장된다.
		 * 참조 주소를 가지고 자료를 가지고 와야 한다.
		 * 참조 타입 자료는 크기가 일정하지 않다. 객체(Object) 단위로 관리. 객체의 생성과 소멸은 쉽게 이루어지지 않는다.
		 *
		 * 참조 타입의 대표적인 자료형은 클래스이고, 클래스의 대표적인 자료형은 String(문자열)
		 * 
		 * 주의) 참조 타입의 변수에 객체를 할당하지 않는 경우 null 값을 가질 수 있다.
		 * 주의) 정상적인 객체의 참조주소를 가지지 않은 참조 타입의 변수를 호출시 NullPointerException 발생.
		 * 주의) 참조 당하지 않는 객체는 메모리에 JVM(가비지 컬렉터)에 의해 자동 제거된다.
		 * 참조되지 못 하는 상태 <-> 메모리 상태에서 연결 x 
		 */
		
		//String 자료형의 변수 선언 및 초기화
		//Heap 영역에 "Hello" 문자열 생성
		//Stack 영역에 참조형 변수 a 생성
		//"Hello"문자열의 참조주소를 a에 할당
		
		//동일한 문자열 리터널인 경우 동일한 String 객체를 참조한다.
		String a = "Hello";
		String b = "Hello";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode()+", "+b.hashCode());
		
		//"Hello"라는 값을 가지는 String 클래스의 객체 생성
		//Stack 영역에 참조형 변수 b 생성
		//객체의 참조주소를 변수 b에 할당
		//주의) 객체 생성 연산자인 new 사용시 새로운 객체 생성 및 새로운 참조주소를 가진다.
		String c = new String("Hello");
		String d = new String("Hello");
		Object e = new Object();
		Object f = new Object();
		System.out.println(e.hashCode()+", "+f.hashCode());
		
		//== 연산자를 참조 타입에서 사용하면 참조 주소를 비교 연산한다.
		System.out.println(e==f);
		System.out.println(e.equals(f));
		System.out.println(c==d);
		
		//null 값 확인
		//String str = null; // NullPointerException
		//System.out.println(str.toString());
		String x = "사랑";
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(sdf.format(date));
		System.out.println(String.format("%s입니다.%s", x, String.valueOf(sdf.format(date)) ));
		//문자열의 더하기 연산은 권장하지 않는 포멧
		//문자열 여러개를 더할 때는 format을 통해 이루어질 수 있도록하기
	}
}
