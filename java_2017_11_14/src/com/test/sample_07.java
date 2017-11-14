package com.test;

public class sample_07 {

	public static void main(String[] args) {
		
		/*
	      1  6 11 16 21
  		  2  7 12 17 22
  		  3  8 13 18 23
  		  4  9 14 19 24
  		  5 10 15 20 25
		 */
		
		int[][]arr = new int[5][5];
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[j][i] = ++num;
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
