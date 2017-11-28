package com.member;

import java.util.Scanner;

//(배열)저장소 관리 클래스
public class MemberDAO {
	
	//(배열)저장소 생성 및 관리
	private Member[] members = new Member[5];
	//(배열)저장소 인덱스 관리 변수
	private int idx;
	
	//회원 정보 입력 메소드
	
	public void memberAdd(String name, String phone, String email, String regDate) {
		
		//Member 객체 생성 및 (배열)저장소에 저장
		Member m = new Member(name, phone, email, regDate);
		this.members[this.idx] = m;
		//인덱스 증가
		++this.idx;
	}
	
	public String memberList() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("총 : %d건%n", this.idx));
		sb.append(String.format("-------------------------------------------------%n"));
		for(Member member : this.members) {
			if(member == null)continue;
			sb.append(String.format("%s%n",member.getMemberInfo()));
		}
		return sb.toString();
	}
	public String memberSearch(String name) {
		Member m = null; //멤버타입의 변수 선언
		int index = 0; //인덱스 선언
		StringBuilder sb = new StringBuilder();
		for(Member member : this.members) {
			if(member == null)continue;
			if(member.getName().equals(name)) {
				m=member;//찾은 멤버가 있다면 값 할당
				++index; //인덱스 증가
				sb.append(String.format("%s%n",m.getMemberInfo()));//해당 멤버의 값 가져오기
			}
		}
		sb.insert(0,String.format("총 : %d건%n---------------------------------------------------%n", index));
		if(m==null)//찾은 결과가 null이라면
		sb.append(String.format("%s%n","검색 결과가 업습니다."));
		
		return sb.toString();		
	}
}
