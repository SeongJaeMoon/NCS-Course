
	//화면 설계를 토대로 분석한 결과를 필드로 구성 -> getter, setter 구성
	/*
	--------------------------------
	회원관리 v1.0 (콘솔 버전)
	- 회원 정보 입력, 회원 정보 출력 액션 구현
	- 화면 설계를 토대로 항목 결정->  이름, 전화번호, 이메일, 등록일(yyyy-MM-dd) ->자료형 클래스
	- 화면 설계
	--------------------------------------------
	 */
package com.test002;

import java.util.*;

//메인 메뉴 액션 클래스
public class Main {

	public static void main(String[] args) {
		
		Member m1 = new Member("moon", "010-4318-0221");
		Member m2 = new Member("seong", "010-5678-9101");
		Member m3 = new Member("jae", "010-4318-0221");
		Member m4 = new Member("moon", "010-4318-0221");
		
		List<Member>list = new ArrayList<Member>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		Collections.sort(list, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				return m1.getName().compareTo(m2.getName());
			}
		});
		
		System.out.printf("총인원:%s명%n", list.size());
		System.out.println("----------");
		
		for(Member m : list) {
			//toString() 메소드 생략
			System.out.println(m);
		}
		
		//특정 조건을 만족하는 자료만 출력
		System.out.println("----------");
		int count = 0;
		for(Member m : list) {
			if(m.getName().equals("moon")) {
				System.out.printf("%s%n", m);
				++count;
			}
		}
		System.out.printf("총:%d명%n", count);
		System.out.println("----------");
		
		Member temp = new Member("moon", "010-4318-0221");
		temp.setMid(4);
		list.remove(temp);
		
		for(Member m : list) {
			//toString() 메소드 생략
			System.out.println(m);
		}
		//주의) 중복된 이름이 있는 경우 원하는 자료 삭제가 안 되는 경우가 발생한다.
		//equals 오버라이딩 필요!
	}
}
