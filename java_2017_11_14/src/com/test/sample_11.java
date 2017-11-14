package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sample_11 {

	public static void main(String[] args) {

		//배열의 배열에 대한 복사
		//Arrays 클래스의 copyOf(), copyOfRange() 메소드 사용
		//System 클래스의 arraycopy() 메소드 사용
		//얕은 복사(shallow copy), 깊은 복사(deep copy)
		
		int[]arr1 = {10, 20, 30, 40, 50};
		int[]arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int[]arr3 = {10, 20, 30, 40, 50};
		int[]arr4 = new int[arr3.length];
		
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		/*
		[10, 20, 30, 40, 50]
		[10, 20, 30, 40, 50]
		[10, 20, 30, 40, 50]
		[10, 20, 30, 40, 50]
		 */
		
	}
}
