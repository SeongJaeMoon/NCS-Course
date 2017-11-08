package com.test;

import java.io.IOException;
import java.util.Scanner;

public class sample_19 {
	//키보드 입력
	//키보드를 이용해서 문자 또는 문자열을 프로그램 내부로 읽어들일 수 있다. 
	//Scanner 클래스를 이용하면 문자열 단위로 입력가능
	//패키지 등록 및 예외 처리 필요
	//주의)실행시 문자열 입력 대기 상태가 된다. 특정 문자열 입력 후 Enter키
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);//반복문 바깥에다가 선언하는 것을 권장
		boolean run = true;
		String s;//스캐너 객체를 담을 변수
		while(run) {
			System.out.print("1~2~3~4입력!\n");
			s = scanner.nextLine();
			switch (s) {//자료형이 문자열이거나 정수일 때만 가능
			case "1":
				System.out.print("안녕?\n");
				break;
			case "2":
				System.out.print("나는\n");
				break;
			case "3":
				System.out.print("성재야~\n");
				break;
			case "4":
				System.out.print("만나서 반갑습니당!\n");
				run = false;
				scanner.close();
				break;
			default:
				break;
			}
		}
	}
}
