package com.polymorphism2;

//실행 테스트 클래스
public class Main {

	public static void main(String[] args) {
		
		int[]arr = new int[5];
		arr[0]=10;
		arr[1]=(int)12.34;
		for(int a : arr) {
			System.out.println(a);
		}
		Number[]arr2 = new Number[5];
		arr2[0] = 10;
		arr2[1] = 12.34;
		for(Number a : arr2) {
			System.out.println(a);
		}
	}
}
