package com.member;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

//(콘솔)서비스 관련 클래스
public class MemberService {
	
	//(배열)저장소 객체
	private MemberDAO dao = new MemberDAO();
	
	public void memberAdd(Scanner sc) {
		
		System.out.println("------------");
		System.out.println("회원정보 입력.");
		System.out.println("------------");
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("전화번호:");
		String phone = sc.next();
		while(true) {
			try {
				this.phonepatternCheck(phone);
				break;
			}catch(Exception e) {		
				System.out.println(e.getMessage());
				System.out.print("전화번호:");
				phone = sc.next();
			}
		}
		System.out.print("이메일:");
		String email = sc.next();
		while(true) {
			try {
				this.emailpatternCheck(email);
				break;
			}catch(Exception e) {	
				System.out.println(e.getMessage());
				System.out.print("이메일:");
				email = sc.next();
			}
		}
		System.out.print("등록일:(yyyy-MM-dd)");
		String regDate = sc.next();
		while(true) {
			try {
				this.isRegDate(regDate);
				break;
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.print("등록일:(yyyy-MM-dd)");
				regDate = sc.next();
			}
		}
		System.out.println(Dept.getList());
		System.out.print("부서선택:");
		String deptId = sc.next();
		this.dao.memberAdd(name, phone, email, regDate, deptId);
		System.out.println("회원정보 등록이 완료되었습니다.");
	}
	
	public void memberList(Scanner sc){
		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("회원정보 정렬 출력");
			System.out.println("1. 이름  2. 전화번호 3. 이메일  4. 등록일 5. 부서");
			System.out.println("--------------------------------------------------");
			System.out.println("선택(1~5, 0 quit?)");
			int selectNo = sc.nextInt();
			if(selectNo==0)break;
			switch (selectNo) {
			case 1:System.out.println(this.dao.memberList("이름"));break;
			case 2:System.out.println(this.dao.memberList("전화번호"));break;
			case 3:System.out.println(this.dao.memberList("이메일"));break;
			case 4:System.out.println(this.dao.memberList("등록일"));break;
			case 5:System.out.println(this.dao.memberList("부서"));break;
			}
		}
	}
	public void memberSearch(Scanner sc){
		
		while(true) {
		System.out.println("--------------------------------------------------");
		System.out.println("회원 정보 검색>");
		System.out.println("1. 이름 기준 2. 전화번호 기준 3. 이메일 기준 4. 등록일 기준 5.부서 기준");
		System.out.println("--------------------------------------------------");
		System.out.println("선택(1~5, 0 quit?)");
		int selectNo = sc.nextInt();
		if(selectNo==0)break;
		switch(selectNo) {
			case 1: this.memberSearch(sc, "이름"); break;
			case 2: this.memberSearch(sc, "전화번호"); break;
			case 3: this.memberSearch(sc, "이메일"); break;
			case 4: this.memberSearch(sc, "등록일"); break;
			case 5: this.memberSearch(sc, "부서기준"); break;
			}
		}
		//System.out.print(this.dao.memberSearch(name));
	}
	//회원 정보 검색 서브메뉴 메소드
	//key : 검색 기준
	//value : 검색 대상
	public void memberSearch(Scanner sc, String key) {
		System.out.println("-------------------");
		System.out.printf("회원 정보 검색(%s기준)%n", key);
		System.out.println("-------------------");
		String value = sc.next();
		System.out.printf("%s%n", value);
		System.out.println(this.dao.memberSearch(key, value));
	}
	
	private void isRegDate(String regDate) throws ParseException, DateFormatException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(regDate);
		String pattern = sdf.format(date);
		if(!regDate.equals(pattern)) {
			throw new DateFormatException("잘못된 날짜 형식 입력입니다.");
		}
	}
	
	 //정규식 패턴
    private void phonepatternCheck(String phone) throws PatternFormatException{
        String regExp = "010-\\d{4}-\\d{4}";
        boolean result = Pattern.matches(regExp, phone);
        if(!result) {
            throw new  PatternFormatException("전화번호 형식이 틀렸습니다.");
        }
    }
    private void emailpatternCheck(String email) throws PatternFormatException{
        String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        boolean result = Pattern.matches(regExp, email);
        if(!result) {
            throw new PatternFormatException("이메일 형식이 틀렸습니다.");
        }
    }
	
}
