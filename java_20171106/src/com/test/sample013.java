package com.test;

public class sample013 {
	
	public static void main(String[] args) {
		//산술연산자 주의사항
		//부동 소수점 수 연산시 부정확한 결과
		int a = 1;
		double b = 0.1;
		int c = 7;
		double zero = 0.0;
		
		//1-(0.1*7) => 1 - 0.7
		double result = a-(b*c);
		System.out.println(result);
		//(1*10)-7 = 10 = > 10-7 => 3/10.0 = > 0.3
		//부동 소수점 연산은 오차를 많이 포함하고 있고, 연산을 반복 수행하면 오착가 증가하므로 되도록 사용하지 않는 것이 좋음.
		double d = ((a*10)-c)/10.0;
		System.out.println(d);
		
		//어떤 값을 0.0으로 나누면 Runtime Exception 발생!
		//java.lang.ArithmeticException
		//NaN: Not a Number, infinite: 무한대
		System.out.println(a%zero);
		System.out.println(a/zero);
		String ss = "100";
		System.out.println(ss+zero);
		System.out.println(Integer.parseInt(ss)+c);
		String nan = "NaN";
		System.out.println(Double.parseDouble(nan)+1);
		//String 자료형
		//문자열 연결(결합) 연산자
		//문자열 + 문자열 => 문자열
		//문자열 + 다른자료 => 문자열
		System.out.println(ss+d+result);
		System.out.println(ss+(d+result));
	}
}
