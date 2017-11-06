package com.test;

public class sample011 {
	
	int getNear(int []x, int neardata) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < x.length; i++) {
			int temp = Math.abs(min-neardata);
			if(min > temp) {
				min = temp;
				neardata = x[i];
			}
		}
		return neardata;
	}
	
	public static void main(String[] args) {
		//Casting
		//Data type (A convert to B),암시적, 명시적
		//작은 타입의 자료를 큰 타입의 변수에 저장하는 과정에서 발생.
		//byte(1) <- short(2) <- char(2)  <- int(4) <- long(8) <- float(4) <- double(8) 표혐의 범위!
		//강제 형변환, 작은 타입=(작은타입)큰 타입;
		//자료 손실 발생 가능.
		byte a = 100;
		int b = 210000000;
		a = (byte)b; // 앞 부분의 메모리에 적재된 데이터 날리고 끝 부분의 메모리만 남겨놓음. ex) int -> byte 앞 3byte 날라감.
		System.out.println(a);
		int d = 100;
		byte c = (byte)d;
		System.out.println(c);
		
		//int 자료형의 값을 char 자료형의 변수에 저장
		// ->강제 형변환
		int g = 65;
		char h = (char)g;
		System.out.println(h);
		//double 자료형을 -> int 자료형 변수에 저장
		double ab = 123.456;
		g = (int)ab;
		System.out.println(g);
		int x = (int)Math.ceil(ab);
		System.out.println(x);
		
		System.out.println(Math.PI);
		int [] arr = {1,2,3,4,5,6};
		sample011 sample = new sample011();
		int neardata = sample.getNear(arr, 3);
		System.out.println(neardata);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		char mc = 'a';
		int mi = mc;
		System.out.println(mi);
		//변수는 숫자로 시작 x, 영어로 시작, $, _등의 특수문자로 시작
	}
}
