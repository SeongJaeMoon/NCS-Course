package com.score002;

import java.util.Arrays;

//(배열)저장소 관리 클래스
public class ScoreDAO {
	
	//(배열)저장소 생성 및 관리
	private Score[]scores = new Score[5];
	
	//(배열)저장소 인덱스 관리 변수
	private int idx;
	
	//성적 정보 입력 메소드
	//중복된 번호 사용시 입력 실패할 수 있다.
	public int scoreAdd(String sid, String name, int sub1, int sub2, int sub3){
		int result = 0;
		
		// 중복된 번호 검사 과정 추가->private 메소드로 구성
		if (this.isCheckId(sid)) {
			Score score = new Score(sid, name, sub1, sub2, sub3);
			this.scores[this.idx] = score;
			++this.idx;
			// 저장소 자동 증가
			if (this.scores.length % 5 == 0) {
				this.scores = Arrays.copyOf(this.scores, this.scores.length + 5);
			}
			result = 1;//입력 성공의 경우
		}
		return result;
	}
	//성적 정보 출력 메소드
	public String scoreList() {
		StringBuilder sb = new StringBuilder();
		int index = 0;
		//석차 계산 메소드
		this.rank();
		  sb.append(String.format("번호 이름과목1 과목2 과목3 총점 평균 석차%n"));
		for(Score score : this.scores) {
			if(score==null)continue;
			sb.append(String.format("%s%n",score.scoreInfo()));
			++index;
		}
		sb.insert(0, String.format("총: %d건%n------------------------%n", index));
		return sb.toString();
	}
	//석차 계산용 메소드 -> setter 메소드
	private void rank() {
		//석차 알고리즘
		//1. 배열에 성적 정보를 여러개 저장
		//2. 모든 석차 정보는 초기값 1로 설정
		//3. 기준 성정과 나머지 성적들을 비교해서 기준 성적보다 
		//	 나머지 성적이 큰 경우가 있다면 기준 석차의 현재 값을 +1연산
		for(int i = 0; i < this.scores.length; ++i) {
			if(this.scores[i]==null)continue;
			for(int j = 0; j <this.scores.length; ++j) {
				if(this.scores[j]==null)continue;
				if(this.scores[i].getTotal()<this.scores[j].getTotal()) {
					//현재 석차 +1 액션
					this.scores[i].setRank(this.scores[i].getRank()+1);
				}
			}
		}
	}
	
	private boolean isCheckId(String sid){
		boolean result = true;
		for(Score s : this.scores) {
			if(s==null)continue;
			if(s.getSid().equals(sid)) {
				result = false;
			}
		}
		return result;
	}
}
