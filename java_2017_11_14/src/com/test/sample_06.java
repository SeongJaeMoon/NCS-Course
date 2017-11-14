package com.test;

public class sample_06 {

	public static void main(String[] args) {
		
		/*
	     1  2  3  4  5
		10  9  8  7  6
		15 14 13 12 11
		16 17 18 19 20
		25 24 23 22 21
		 */
		
		int[][]arr = new int[5][5];
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				if(i%2==0) {
					arr[i][j] = ++num;
				}else {
					arr[i][arr[j].length - j - 1] = ++num;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j= 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
	}
}
