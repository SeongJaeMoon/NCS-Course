package com.test;

public class sample_4 {

	public static void main(String[] args) {

		// String 클래스의 indexOf() 메소드
		// 책 제목들 중에서 특정 단어가 포함된 책 검색
		// 책 제목들 -> 배열을 이용해서 준비
		String[] books = { "코스모스", "논어", "열하일기", "맹자", "대학", "중용" };
		String keyword = "열하";
		//배열 탐색 전용 for문
		for(String book : books) {
			if(book.indexOf(keyword)!=-1) {
				System.out.println(book);
			}
		}
	}
}
