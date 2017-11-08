package com.test;

public class sample_17 {

	public static void main(String[] args) {
		//중첩 for문 테스트
		//문제 : 별문자(*)를 아래 형태로 출력하는 코드 작성.
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		
		for(int i = 0; i <= 5; i++) {
			for(int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.print('\n');
		}
		System.out.print('\n');
	}
}
// 출력결과
/*
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
 */