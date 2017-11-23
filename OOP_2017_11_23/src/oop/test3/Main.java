package oop.test3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//싱글톤 패톤이 적용된 클래스의 객체 생성
		//->직접 new 연산을 이용해서 객체 생성하지 않는다.
		//->전용 static 메소드(getInstance) 호출
		//->static 메소드는 클래스이름.메소드이름(); 형식
		Sample sample = Sample.getInstance();
		
		System.out.println(sample.toString());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
	}
}
