package com.test;

public class sample_12 {
	 
	//cmd에서 "java 클래스 이름 값1 값2 값3..." 입력 시에 -> 옵션 값 String 배열로 매개변수 전달.
	public static void main(String[] args) {//매개변수 전달 String 자료형 배열, JVM이 해줌
		//main 메소드의 매개변수 분석
		//String[] args
		//JVM이 전달하는 문자열형 배열 객체를 전달받을 수 있는 변수
		//자바프로그램이 실행될 때 외부 자료를 전달할 수 있다.
		//예를 들어, 명령 프롬프트에서 실행하는 경우 "java 클래스이름 자료1 자료2 ..."형태로 실행
		//이클립스에서 실행하는 경우 > Run > Run configurations...>
		
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		if(args.length < 2 || args == null){
			System.out.println("The value is not enough");
			System.exit(0);
		}else{
			for(int i = 0; i < args.length; i++){
				sb.append(String.format("option : %s%n", args[i]));
				sum += Integer.parseInt(args[i]); 
			}
		}
		System.out.print(sb.toString());
		System.out.printf(String.format("%n sum : %d", sum));
		
	}
}
