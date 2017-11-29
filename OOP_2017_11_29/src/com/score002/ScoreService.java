package com.score002;

import java.util.Scanner;

//(콘솔) 서비스 관련 클래스
public class ScoreService {
	
	//(배열)저장소 관련 클래스 객체 확보
	private ScoreDAO dao = new ScoreDAO();
	
	//성적 정보 입력 메소드
	public void scoreAdd(Scanner sc) {
		System.out.print("id를 입력해주세요.");
		String sid = sc.next();
		System.out.print("이름을 입력해주세요.");
		String name = sc.next();
		System.out.print("과목1의 점수를 입력해주세요.");
		int sub1 = sc.nextInt();
		System.out.print("과목2의 점수를 입력해주세요.");
		int sub2 = sc.nextInt();
		System.out.print("과목3의 점수를 입력해주세요.");
		int sub3 = sc.nextInt();
		if(this.dao.scoreAdd(sid, name, sub1, sub2, sub3)==1) {
			System.out.println("성적 정보 저장이 성공했습니다.");
		}
		else {
			System.out.println("성적 정보 입력이 실패했습니다. 중복된 번호 사용.");
		}
	}
	//성적 정보 출력 메소드
	public void scoreList() {
		System.out.println("---------------");
		System.out.println("성적 정보 전체출력");
		System.out.println("---------------");
		System.out.print(this.dao.scoreList());
	}
}
