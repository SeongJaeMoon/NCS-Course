package com.test;

public class sample_01 {

	public static void main(String[] args) {
	
		//오늘 정리 1조.
		//if(boolean){조건식...}
		//중괄호 작성하지 않으면 밑에 한 줄만 읽힘, 가독성을 위해서 중괄호 필수!
		int x = 10;
		if(x<20) {
			System.out.println(x);
		}else {
			System.out.println(++x);
		}
		
		if(x > 90) {
			//실행 x
		}
		if(x < 90) {
			//실행 o
		}
		System.out.println((int)Math.random()*101);
		System.out.println((int)(Math.random()*100+1));
	}
}
/*----
*결과:
----*/