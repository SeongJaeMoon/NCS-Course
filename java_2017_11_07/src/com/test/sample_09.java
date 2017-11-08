package com.test;

public class sample_09 {

	public static void main(String[] args) {
		//switch case -> expression==value 일때만 허용
		//break, default -> optional
		//switch 구문에서 break; 구문은 특정 case 구문을 실행하고 switch 블럭을 빠져나갈때 사용된다.
		
		int x = (int)(Math.random()*6)+1;
		
		switch(x) {
			case 6 :
				System.out.println(x+"입니다.");
				break;
			case 5 :
				System.out.println(x+"입니다.");
				break;
			case 4 :
				System.out.println(x+"입니다.");
				break;
			case 3 :
				System.out.println(x+"입니다.");
				break;
			case 2 :
				System.out.println(x+"입니다.");
				break;
			default :
				System.out.println(x+"입니다.");
				break;
		}
		//변수 a에 임의의 등급(A,a,B,b,C,c)를 지정한다.
			char score = 'A';
		switch(score) {
			case 'A' :
			case 'a' :
				//'A' || 'a'일 경우 실행
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default :
				System.out.println("손님입니다.");
				break;
		}
		
		int scorex = (int)(Math.random()*101);
		String result = null;
			switch(scorex/10){
				case 10:
				case 9:
					result = "등급은 A입니다.";
					break;
				case 8:
					result = "등급은 B입니다.";
					break;
				case 7:
					result = "등급은 C입니다.";
					break;
				default :
					result = "등급은 D입니다.";
					break;
			}
			System.out.println("점수가 "+ scorex+ "입니다. "+ result);
	}
}
/*----
*결과:
----*/