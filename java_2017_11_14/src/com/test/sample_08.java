package com.test;

public class sample_08 {

	public static void main(String[] args) {

		/*
		 	   ´ÞÆØÀÌ
		   1  2  3  4 5
 		  16 17 18 19 6
 		  15 24 25 20 7
 		  14 23 22 21 8
		  13 12 11 10 9
		 */
		int size = 5;
		int[][] arr = new int[size][size];
		/*int num = 0;
		int x = 0;
		int y = -1;
		int delta = 0;
		
		while(size > 0){
		for (int i = 0; i < size; i++) {
			++y;
			arr[x][y] = ++num;
		}
		--size;
		for (int i = 0; i < size; i++) {
			++x;
			arr[x][y] = ++num;
		}
		for (int i = 0; i < size; i++) {
			--y;
			arr[x][y] = ++num;
		}
		--size;
		for (int i = 0; i < size; i++) {
			--x;
			arr[x][y] = ++num;
		}
	}*/
		
		int temp = 1;
		int z = 0, q = -1;
		int count = 0;
		while(size > 0) {
			for(int i = 0; i < size; i++) {
				q += temp;
				arr[z][q] = ++count;
			}
			--size;
			for(int i = 0; i < size; i++) {
				z += temp;
				arr[z][q] = ++count;
			}
			temp = -temp;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
	}
}
