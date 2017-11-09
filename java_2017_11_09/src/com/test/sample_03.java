package com.test;

public class sample_03 {

	public static void main(String[] args) {
		
		//String 클래스의 charAt() 메소드
		String ssn = "940221-1229918";
		char temp = ssn.charAt(7);
		
		switch(temp) {
		case '1': 
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
		//indexOf->해당 문자열이 시작하는 인데스 반환, 검색 결과가 없으면 -1 반환.
		String str = new String("Wellcome to Tutorialspoint.com");
		String subStr = new String("Tutorial");
		System.out.println(str.indexOf(subStr));
		
		//length()->문자열의 길이(문자의 수)를 반환
		String str1 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str1.length()); 
		
		//substring(int beginIndex)-> 문자열의 일부 반환 (beginIndex~)만 반환
		String str2 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str2.substring(12));
		
		//substring(int beginIndex, int endIndex)-> 문자열의 일부(beginIndex~endIndex)만 반환
		String str3 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str3.substring(12, 20));
		
		//replace(기존 데이터, 치환할 데이터 ) -> 문자열을 치환
		String str4 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str4.replace("Wellcome to", "Hey~~"));
		
		//replaceAll(정규표현식, 치환)
		String str5 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str5.replaceAll(".*Wellcome to.*", "Hey~~"));
		
		//toLowerCase(), toUpperCase() : 문자열을 소문자로 반환, 대문자로 반환
		String str6 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		
		//주의)문자열 비교시 equals(), equalsIgnoreCase() -> 소문자, 대문자 무시
		String str7 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str7.equalsIgnoreCase(str7));
		
		//trim() -> 문자열의 앞뒤 공백 제거한 후 반환
		//중간에 있는 공백은 제거 되지 않는다.
		String str8 = new String("Wellcome to Tutorialspoint.com");
		System.out.println(str8.trim());
		System.out.println(str8.replace(" ", ""));
		
		//valueOf()-> 기본 자료형의 값을 String 값으로 변환 후 반환
		
		int a = 10;
		double b = 10.0;
		System.out.println(String.valueOf(a) +" "+ String.valueOf(b));	
		
		//서식지정 문자열
		//System.out.printf("서식 포함 문자열", 대상, ...)
		//String.format("서식 포함 문자열", 대상, ...)
		//%[argument_index$][flags][width][.precision]
		//정수 관련 서식 -> %d
		//실수 관련 서식 -> %f
		//범용(문자열) 관련 서식 -> %s
		//줄바꿈 문자 관련 서식 -> %n
		
		//정수 서식
		int c = 10;
		System.out.printf("%d%n", c);
		System.out.printf("[%10d] [%-10d]\n", c, c);
		System.out.printf("%1$d %1$d", c);
		//실수 서식
		double d = 1234.5678;
		System.out.printf("[%.1f]%n", d);
		System.out.printf("[%1$f] [%1$f] %n", d);
		System.out.printf("[%.1f]%n", d);
		System.out.printf("[%.10f]%n", d);
		//문자열 서식
		String sTest1 = "TEST";
		System.out.printf("%s%n",sTest1);
		System.out.printf("%10s%n", d);
		System.out.printf("%-10s%n", d);
		//16진수 서식
		System.out.printf("%1$d -> %1$H(16진수)%n", c);
		System.out.printf("%1$s -> %1$H%n", sTest1);
		//Boolean 서식
		System.out.printf("%1$s -> %1$B%n", 255);
		System.out.printf("%1$s -> %1$B%n", null);
		//문자 서식
		System.out.printf("%1$s -> %1$c%n", 97);
		//16진수 서식
		System.out.printf("%1$s -> %1$X%n", 100);
		//지수 표현식
		System.out.printf("%1$f -> %1$e%n",123234512312313.44);
		//%% -> %를 나타내기 위한 포멧
		System.out.printf("%1s%%", a);
		//grouping separators()
		System.out.printf("%1s$ -> %1$,d%n", 123131323);
		//zero-pad(0) 서식
		System.out.printf("%1$d -> %1$05d%n", 4);
	}
}
