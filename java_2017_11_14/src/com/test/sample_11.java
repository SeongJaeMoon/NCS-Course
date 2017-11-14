package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sample_11 {

	public static void main(String[] args) {

		//�迭�� �迭�� ���� ����
		//Arrays Ŭ������ copyOf(), copyOfRange() �޼ҵ� ���
		//System Ŭ������ arraycopy() �޼ҵ� ���
		//���� ����(shallow copy), ���� ����(deep copy)
		
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
