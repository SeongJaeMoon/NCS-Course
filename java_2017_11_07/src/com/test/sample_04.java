package com.test;

import java.text.DecimalFormat;
import java.util.Random;

public class sample_04 {

	public static void main(String[] args) {

		//난수 테스트 : 무작위로 발생하는 일정 범위 수
		//0.0 <= Math.random()<1.0, 기본적으로 0보단 크고 1보단 작은 수 발생. -> 곱하기 연산으로 정수 만들 수 있음.
		//Math.random()*Max-Min+1 + MIN; -> MAX부터MIN까지 랜덤 함수
		
		System.out.println((int)(Math.random()*100)+1);
		System.out.printf("%.1f\n", Math.random());
		float x =10.3343f;
		DecimalFormat df = new DecimalFormat(".##");
		String sf = df.format(x);
		System.out.println(sf);
		
		//정수 난수 1<= 난수 <= 100
		System.out.println((int)(Math.random()*100)+1);
		//정수 난수 0<= 난수 <= 100
		System.out.println((int)(Math.random()*100));
		System.out.println((int)Math.ceil(Math.random()*100));
		Random rd = new Random();
		System.out.println(rd.nextInt());
		System.out.println((int)(Math.random()*6)+1);
		
		
	}
}
/*----
*결과:
----*/