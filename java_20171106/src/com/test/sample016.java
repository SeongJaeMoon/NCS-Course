package com.test;

public class sample016 {
	
	public static void main(String[] args) {
		//&&(AND), ||(OR), !(NOT)
		//참 AND 참 = 참
		//참 AND 거짓 = 거짓
		//참 OR 참 = 참
		//참 OR 거짓 = 거짓
		
		boolean x= true;
		boolean y =false;
		boolean z = true;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!(x&&y));
		System.out.println(!(x||y));
		System.out.println(!x||y);
		System.out.println(!x||z);
		System.out.println(!(x||z));
		
		int a = 10;
		int b = 20;
		System.out.println((a%5)==0);
		System.out.println((a%10)==0);
		
		//비트단위 연산자
		//&,|,^,~,<<,>>,>>>
		//1 & 0 => 0
		//1 & 1 => 1
		//1|1 => 1
		//1|0 => 1
		byte b1 = 45; //00101101
		byte b2 =25; //00011001
		System.out.println(b1|b2);//00111101
		System.out.println(b1&b2);//00001001
		System.out.println(b1<<1); //01011010
		System.out.print(b1>>1); //00010110
	}
}
