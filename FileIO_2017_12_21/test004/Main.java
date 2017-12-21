package com.test004;

import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//File IO
		/*
		
		- File을 대상으로 입출력하는 액션
		- java.io 패키지 필요
		- 데이터가 연속된 상태로 존재하는 것을 스트림(Stream)이라고 한다. 스트림 상태의 데이터를 물리적으로 파일에 기록하거나, 파일의 정보를 읽어내서 스트림 상태로 만들 수 있다.
		- 스트림은 진행 방향에 따른 구분으로 InputStream, OutputStream이 존재한다.
		- 스트림을 처리하는 단위에 따른 구분으로 ByteStream(바이너리 파일 처리용), CharacterStream(텍스트 파일 처리용)이 존재한다.
		
		- 파일 + InputStream + Byte 단위 => FileInputStream 클래스 이용
		- 파일 + OutputStream + Byte 단위 => FileOutputStream 클래스 이용
		- 파일 + InputStream + Character 단위 => FileReader 클래스 이용
		- 파일 + OutputStream + Character 단위 => FileWriter 클래스 이용
		
		*/
		
		//OutputStream 클래스
		//-OutputStream 클래스는 바이트 기반 출력 스트림의 최상위 클래스이다.
		//-하위 클래스로서 FileOutputStream, BufferedOutputStream, DataOutputStream, PrintStream 클래스가 존재한다.
		//-주요 메소드로 write(), flush(), close() 메소드가 있다.
		
		
		//write() 메소드
		//- 출력 스트림에게 1바이트 단위로 데이터를 내보내기.
		
		String str = "Hello";
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes)); //[72, 101, 108, 108, 111]
		
		//파일 동적 생성(덮어쓰기)
		//주의) C:\ 드라이브는 관리자 권한이 있는 경우만 파일 생성 가능하므로 사용하지 말 것.
		OutputStream os = new FileOutputStream("D:\\test.txt");
		for (int i=0; i<bytes.length; ++i) {
			//바이트 단위로 파일에 기록된다.
			os.write(bytes[i]);
		}
		os.close();

	}

}
