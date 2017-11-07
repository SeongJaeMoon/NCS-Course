package com.test;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class sample_05 {

	
	public static void main(String[] args){ 

		// 중첩된 if~else문
		// if~else문 안에 또 다른 if~else문! if~else문이 왜 거기서 나와?

		/*
		 * if(boolean_expression){ 전제 조건 if(boolean_expression){ 세부 조건 } }
		 */
		System.out.println("등급 구하기 놀이");
		while (true) {
			Scanner sc = new Scanner(System.in);
			int x = 0;
			String s = null;
			x = sc.nextInt();
			if (x >= 90) {
				if (x >= 95) {
					s = "A+ 잘했어!";
				} else {
					s = "A 잘했어!";
				}
			} else if (x >= 80) {
				if (x >= 85) {
					s = "B+ 잘했어!";
				} else {
					s = "B 잘했어!";
				}
			} else if (x >= 70) {
				if (x >= 75) {
					s = "C+ 잘했어!";
				} else {
					s = "C 잘했어!";
				}
			} else if (x >= 60) {
				if (x >= 65) {
					s = "D+ 잘했어!";
				} else {
					s = "D 잘했어!";
				}
			} else {
				s = "F 다음부터 잘하면 돼!";
			}
			System.out.println("점수는:"+ x +" 등급은:"+ s);
		}
	}
}
/*----
*결과:
----*/