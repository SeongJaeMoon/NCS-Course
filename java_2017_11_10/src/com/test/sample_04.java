package com.test;

public class sample_04 {

	public static void main(String[] args) {
		double [] arrD = {1.9, 2.9, 3.4, 3.5};
		
		for(int i = 0; i < arrD.length; i++){
			System.out.printf("arrD[%d] : %s%n", i, arrD[i]);
		}
		
		double sum = 0;
		double max = arrD[0];
		
		for (int i = 0; i < arrD.length; i++) {
			sum +=arrD[i];
			if(arrD[i] > max) {
				max = arrD[i];
			}
		}
		System.out.printf("гу╟Х : %s, max : %s", sum, max);
	}
}
