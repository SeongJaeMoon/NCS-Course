package com.test;

import java.util.Arrays;


public class sample_03 {

	public static void main(String[] args) {
		
		//Arrays class
		//java.util.Arrays 클래스의 sort() 메소드를 사용
		//->java.util 패키지 등록 필요
		//객체 정렬은 불가능!
		
		int [] a = {1,3,5,4,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		String [] str = {"json", "xml", "nodejs", "angularjs", "rubyonrails"};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
	}
}
