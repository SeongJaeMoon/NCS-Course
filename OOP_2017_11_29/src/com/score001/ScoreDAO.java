package com.score001;

import java.util.Arrays;

//(배열)저장소 관리 클래스
public class ScoreDAO {
	
	//(배열)저장소 생성 및 관리
	private Score[]scores = new Score[5];
	//(배열)저장소 인덱스 관리 변수
	private int idx;
	//성적 정보 입력 메소드
	public void scoreAdd(String sid, String name, int sub1, int sub2, int sub3){
		Score score = new Score(sid, name, sub1, sub2, sub3);
		if(this.scores.length==this.idx) {
			Arrays.copyOf(scores, scores.length+5);
		}
		this.scores[this.idx] = score;
		++this.idx;
	}
	//성적 정보 출력 메소드
	public String scoreList() {
		StringBuilder sb = new StringBuilder();
		int index = 0;
		  sb.append(String.format("----------------------------------------------%n"));
		  sb.append(String.format("번호  이름   과목1 과목2 과목3 총점 평균%n"));
		for(Score score : this.scores) {
			if(score==null)continue;
			sb.append(String.format("%s%n",score.scoreInfo()));
			++index;
		}
		sb.insert(0, String.format("총: %d건%n------------------------%n", index));
		return sb.toString();
	}
}
