package com.test001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		//컬렉션 프레임워크
		/*
		 -컬렉션(Collection)은 자바에서 객체를 수집해서 저장하는 역할을 하는 클래스들의 집합
		 -List, Set, Map 인터페이스를 구현한 클래스들의 집합체이다.
		 -List 인터페이스 특징 : 저장 순서를 유지한다. 중복 저장 가능. 대표적인 구현 클래스는 ArrayList 클래스이다.
		 -Set 인터페이스 특징 : 저장 순서가 유지되지 않는다. 중복 저장 불가. 대표적인 구현 클래스는 HashSet 클래스이다.
		 -Map 인터페이스 특징 : 키와 값의 쌍으로 자료 저장. 키는 중복 저장 불가. 값은 중복 허용. 인덱스는 제공되지 않는다. 대표적인 구현 클래스는 HashMap 클래스이다.
		 */
		
		//List 인터페이스
		/*		
  		값만 저장된다.
		인덱스 제공.
		저장 순서를 유지한다
		중복 저장 가능.
		정렬 기능이 지원된다.
		대표적인 구현 클래스는 ArrayList 클래스이다.
		*/
		//ArrayList 클래스를 이용한 컬렉션 저장소 준비
		//->메모리 상의 크기는 자동 관리된다.
		//->초기 크기를 정할 필요가 없다.
		//->컬렉션 저장소 준비할 때 제네릭 표현에 의해 저장 가능한 객체의 종류가 제한된다.
		List<String> list = new ArrayList<String>();
		list.add("안녕");
		list.add("나는");
		list.add("성재야");
		//자료 전체를 꺼내는 경우 향상된 for문 사용
		//null 자료는 자동 제외된다.
		for(String s : list) {
			System.out.println(s);
		}
		
		//특정 위치에 자료 추가 가능
		list.add(1, "kim");
		for(String s : list) {
			System.out.println(s);
		}
		
		//특정 위치의 자료를 새로운 자료로 덮어쓰기. 수정 액션
		list.set(1, "lee");
		for(String s : list) {
			System.out.println(s);
		}
		
		//자료 검색 기능.
		System.out.println();
		System.out.println(list.contains("안녕"));
		System.out.println(list.contains("성재야"));
		System.out.println(list.indexOf("안녕"));
		System.out.println(list.indexOf("성재야"));
		
		//특정 자료 삭제
		list.remove("안녕");
		for(String s : list) {
			System.out.println(s);
		}
		
		//다량의 자료 추가. 배열 자료형을 List 자료형으로 형변환.
		List<String>alist = Arrays.asList("안녕", "나는","성재야");
		for(String s : alist) {
			System.out.println(s);
		}
		List<String>list3 = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			list3.add(i, "하이");
		}
		Object[] objList = list3.toArray();
		System.out.println(Arrays.toString(objList));
	}
}
