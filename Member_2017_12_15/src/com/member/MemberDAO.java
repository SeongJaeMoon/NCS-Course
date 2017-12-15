package com.member;

import java.util.*;
//(배열)저장소 관리 클래스
public class MemberDAO {
	
	//(배열)저장소 생성 및 관리
	private List<Member> members = new ArrayList<Member>();
	//(배열)저장소 인덱스 관리 변수
	//회원 정보 입력 메소드
	public void memberAdd(String name, String phone, String email, String regDate, String deptId) {

		try {
			Member m = new Member(name, phone, email, regDate, deptId);
			this.isExistMeber(m);
			members.add(m);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	
	public String memberList(String key) {		
		
		Collections.sort(members, new Comparator<Member>() {
			int result = 0;
			@Override
			public int compare(Member o1, Member o2) {
				switch(key) {
				case "이름" :
					result = o1.getName().compareTo(o2.getName());
					break;
				case "전화번호":
					result = o1.getPhone().compareTo(o2.getPhone());
					break;
				case "이메일":
					result = o1.getEmail().compareTo(o2.getEmail());
					break;
				case "등록일":
					result = o1.getRegDate().compareTo(o2.getRegDate());
					break;
				case "부서":
					result = o1.getDeptId().compareTo(o2.getDeptId());
					break;
				}
				return result;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("총 : %d건%n", this.members.size()));
		sb.append(String.format("-------------------------------------------------%n"));
		for(Member member : this.members) {
			sb.append(String.format("%s%n",member));
		}
		return sb.toString();
	}
		
	
	
	public String memberSearch(String name) {
		int index = 0; //인덱스 선언
		StringBuilder sb = new StringBuilder();
		for(Member member : this.members) {
			if(member.getName().equals(name)) {
				++index; //인덱스 증가
				sb.append(String.format("%s%n",member));//해당 멤버의 값 가져오기
			}
		}
		sb.insert(0,String.format("총 : %d건%n---------------------------------------------------%n", index));
		if(index==0)//index가 0이라면
		sb.append(String.format("%s%n","검색 결과가 업습니다."));
		
		return sb.toString();		
	}
	
	public String memberSearch(String key, String value) {
		//검색 기능 구현
		//->일부 내용만 일치해도 검색되도록 수정
		int index = 0; //인덱스 선언
		StringBuilder sb = new StringBuilder();
		for(Member member : this.members) {
				String temp=null;
				switch(key) {
				case "이름": temp = member.getName(); break;
				case "전화번호:": temp = member.getPhone(); break;
				case "이메일": temp = member.getEmail(); break;
				case "등록일": temp = member.getRegDate(); break;
				case "부서기준": temp = member.getDeptId(); break;
				}
				if(!value.equals("부서기준")&&temp.contains(value)) {
					++index;
					sb.append(String.format("%s%n", member));
				}else if(value.equals("부서기준")&&temp.equals(value)) {
					++index;
					sb.append(String.format("%s%n", member));
				}
		}
		sb.insert(0,String.format("총 : %d건%n---------------------------------------------------%n", index));
		if(index==0)//index가 0이라면
		sb.append(String.format("%s%n","검색 결과가 업습니다."));
		
		return sb.toString();		
	}

	private void isExistMeber(Member m) throws ExistMemberException{
		for(Member member : this.members){
			if(member.equals(m)) {
				 throw new ExistMemberException("회원 정보 저장에 실패했습니다. -중복 저장");
			}
		}
	}
	
}
