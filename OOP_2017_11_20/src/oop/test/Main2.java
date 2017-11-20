package oop.test;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		
		Sample2 s = new Sample2();
		int i = 10;
		//by value
		s.method1(i);
		System.out.printf("outer: %d%n", i);
		//by value + return
		int result = s.method3(i);
		System.out.printf("result: %d%n", result);
		//by reference
		int[]arr = {10};
		s.method2(arr);
		System.out.printf("outer arr: %d%n", arr[0]);
	
		//by reference »óÈ²
		//Arrays -> sort
		int[]temp = {4, 3, 5, 2, 1};
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp) );
	}
}
