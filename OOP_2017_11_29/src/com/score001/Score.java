package com.score001;

//자료형 클래스
public class Score {

	//화면 설계를 토대로 분석한 결과를 필드로 구성 -> getter, setter 구성
	//번호(읽기 전용), 이름, 과목1, 과목2, 과목3, 총점(읽기 전용), 평균(읽기 전용), 석차
	
	//석차 정보 추가 예정
	private String sid;
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private int total;
	private double avg;
	private int rank;
	
	public Score() {
		
	}
	public Score(String sid, String name, int sub1, int sub2, int sub3) {
		this.sid = sid;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getSid() {
		return sid;
	}
	public int getTotal() {
		return this.sub1+this.sub2+this.sub3;
	}
	public double getAvg() {
		return this.getTotal()/3.0;
	}
	//성적 정보 출력용 메소드
	public String scoreInfo() {
		return String.format("%2s %2s %2d %2d %2d %2d %.1f", this.sid, this.name, this.sub1, this.sub2, this.sub3, this.getTotal(), this.getAvg());
	}
}
