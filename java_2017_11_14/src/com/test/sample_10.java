package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class sample_10 {

	public static void main(String[] args) {

		//�迭�� �迭�� ���� ����
		//Arrays Ŭ������ copyOf(), copyOfRange() �޼ҵ� ���
		//System Ŭ������ arraycopy() �޼ҵ� ���
		//���� ����(shallow copy), ���� ����(deep copy)
		
		int[]arr1 = {10, 20, 30, 40};
		int[]arr2 = {10, 20, 30, 40};
		String[]str1 = {"������", "������", "������"};
		String[]str2 = {"������", "������", "������"};
		
		arr2 = Arrays.copyOf(arr1, arr1.length);
		++arr1[0];
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2)); // ���� �� ���Ѵ�.
		
		int[][] arr3 = {{10,20,30}, {10,20}};
		int[][] arr4 = Arrays.copyOf(arr3, arr3.length);
		//���� ����!	
		++arr3[0][0];
		
		for(int[]arr : arr3) {
			for(int a : arr) {
				System.out.printf("%d ",a);
			}
		}
		
		System.out.println();
		
		for(int[]arr : arr4) {
			for(int a : arr) {
				System.out.printf("%d ",a);
			}
		}
		
		System.out.println();
		
		int[][] arr5 = {{10,20,30}, {10,20}};
		int[][] arr6 = new int[2][3];
		arr6[0] = Arrays.copyOf(arr5[0], arr5[0].length);
		arr6[1] = Arrays.copyOf(arr5[1], arr5[1].length);
		
		++arr5[0][0];
		
		for(int[]arr : arr5) {	
			for(int a : arr) {
				System.out.printf("%d ",a);
			}
		}	
		System.out.println();
		
		for(int[]arr : arr6) {
			for(int a : arr) {
				System.out.printf("%d ",a);
			}
		}
		System.out.println();
		
	}
}
